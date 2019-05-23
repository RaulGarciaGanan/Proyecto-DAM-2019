package com.ikasgela.ClasesBD;

import com.ikasgela.*;
import com.ikasgela.Clases.Socio;

import javax.swing.*;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SocioBD {

    private static Connection conn;

    public static List<Socio> socios = new ArrayList<>();


    public static void logearSocio() throws Exception {
        //Utilizamos usuario y nombre para logear a un usuario.
        GenericoBD gbd = new GenericoBD();
        conn = gbd.conectar(conn);
        String email = Login.login.getUsuario().getText();
        String contrasenya = String.copyValueOf(Login.login.getPassword().getPassword());
        PreparedStatement sentencia = gbd.conectar(conn).prepareStatement("SELECT cod_soc, nombre, tipo_socio  FROM Socios  WHERE email=? AND passwd=?");
        sentencia.setString(1, email);
        sentencia.setString(2, contrasenya);
        Socio user = new Socio();
        ResultSet resultado = sentencia.executeQuery();
        if (resultado.next()) {
            user.setCodSocio(resultado.getString("cod_soc"));
            user.setNombre(resultado.getString("nombre"));
            user.setTipo(resultado.getString("tipo_socio"));
            Menu.codigo_socio = Integer.parseInt(user.getCodSocio());
        }
        if (user.getTipo().equalsIgnoreCase("administrador")) {
            Menu.getFrame().setContentPane(MenuAdministrador.menuAdmin);
            Menu.getFrame().pack();
            Menu.getFrame().setVisible(true);
            Menu.getFrame().setLocationRelativeTo(null);
        } else {
            Menu.getFrame().setContentPane(MenuUsuario.menuUsuario);
            Menu.getFrame().pack();
            Menu.getFrame().setVisible(true);
            Menu.getFrame().setLocationRelativeTo(null);
        }
        gbd.cerrarConexion(conn);
    }

    public static void insertarSocio(Socio socio) throws Exception {
        GenericoBD gbd = new GenericoBD();
        conn = gbd.conectar(conn);
        PreparedStatement sentencia = gbd.conectar(conn).prepareStatement("INSERT INTO SOCIOS(COD_SOC,NOMBRE,APELLIDOS,DNI,TELEFONO,EMAIL,FECHA_NACI,PASSWD) VALUES(INCREMENTO_SOCIO.NEXTVAL,?,?,?,?,?,?,?)");
        sentencia.setString(1, socio.getNombre());
        sentencia.setString(2, socio.getApellido());
        sentencia.setString(3, socio.getDNI());
        sentencia.setInt(4, socio.getTelefono());
        sentencia.setString(5, socio.getEmail());
        sentencia.setDate(6, Date.valueOf(socio.getFecha_Nacimiento()));
        sentencia.setString(7, socio.getContrasena());
        sentencia.executeUpdate();
        gbd.cerrarConexion(conn);
    }

    public static void validarSocio(Socio socio) throws Exception {
        GenericoBD gbd = new GenericoBD();
        conn = gbd.conectar(conn);
        PreparedStatement sentencia = gbd.conectar(conn).prepareStatement("UPDATE SOCIOS SET TIPO_SOCIO='USUARIO' WHERE COD_SOC=?");
        sentencia.setString(1, socio.getCodSocio());
        sentencia.executeUpdate();
        gbd.cerrarConexion(conn);
    }

    public static void listadoSocio() throws Exception {
        GenericoBD gbd = new GenericoBD();
        conn = gbd.conectar(conn);
        PreparedStatement sentencia = gbd.conectar(conn).prepareStatement("SELECT * FROM SOCIOS");
        ResultSet resultSet = sentencia.executeQuery();
        while (resultSet.next()) {
            Socio socio = new Socio();
            socio.setCodSocio(resultSet.getString("COD_SOC"));
            socio.setNombre(resultSet.getString("NOMBRE"));
            socio.setApellido(resultSet.getString("APELLIDOS"));
            socio.setDNI(resultSet.getString("DNI"));
            socio.setTelefono(resultSet.getInt("TELEFONO"));
            socio.setEmail(resultSet.getString("EMAIL"));
            socio.setFecha_Nacimiento(resultSet.getDate("FECHA_NACI").toLocalDate());
            socio.setContrasena(resultSet.getString("PASSWD"));
            socio.setTipo(resultSet.getString("TIPO_SOCIO"));
            socios.add(socio);
        }
        gbd.cerrarConexion(conn);


    }

    public static void listadoValidarSocio() throws Exception {
        GenericoBD gbd = new GenericoBD();
        conn = gbd.conectar(conn);
        PreparedStatement sentencia = gbd.conectar(conn).prepareStatement("SELECT * FROM SOCIOS WHERE TIPO_SOCIO='PENDIENTE'");
        ResultSet resultSet = sentencia.executeQuery();
        while (resultSet.next()) {
            Socio socio = new Socio();
            socio.setCodSocio(resultSet.getString("COD_SOC"));
            socio.setNombre(resultSet.getString("NOMBRE"));
            socio.setApellido(resultSet.getString("APELLIDOS"));
            socio.setDNI(resultSet.getString("DNI"));
            socio.setTelefono(resultSet.getInt("TELEFONO"));
            socio.setEmail(resultSet.getString("EMAIL"));
            socio.setFecha_Nacimiento(resultSet.getDate("FECHA_NACI").toLocalDate());
            socio.setContrasena(resultSet.getString("PASSWD"));
            socio.setTipo(resultSet.getString("TIPO_SOCIO"));
            socios.add(socio);
        }
        gbd.cerrarConexion(conn);

    }

    public static void listadoUsuarioSocio() throws Exception {
        GenericoBD gbd = new GenericoBD();
        conn = gbd.conectar(conn);
        PreparedStatement sentencia = gbd.conectar(conn).prepareStatement("SELECT * FROM SOCIOS WHERE TIPO_SOCIO='USUARIO'");
        ResultSet resultSet = sentencia.executeQuery();
        while (resultSet.next()) {
            Socio socio = new Socio();
            socio.setCodSocio(resultSet.getString("COD_SOC"));
            socio.setNombre(resultSet.getString("NOMBRE"));
            socio.setApellido(resultSet.getString("APELLIDOS"));
            socio.setDNI(resultSet.getString("DNI"));
            socio.setTelefono(resultSet.getInt("TELEFONO"));
            socio.setEmail(resultSet.getString("EMAIL"));
            socio.setFecha_Nacimiento(resultSet.getDate("FECHA_NACI").toLocalDate());
            socio.setContrasena(resultSet.getString("PASSWD"));
            socio.setTipo(resultSet.getString("TIPO_SOCIO"));
            socios.add(socio);
        }
        gbd.cerrarConexion(conn);

    }

    public static void listadoAdministradorSocio() throws Exception {
        GenericoBD gbd = new GenericoBD();
        conn = gbd.conectar(conn);
        PreparedStatement sentencia = gbd.conectar(conn).prepareStatement("SELECT * FROM SOCIOS WHERE TIPO_SOCIO='ADMINISTRADOR'");
        ResultSet resultSet = sentencia.executeQuery();
        while (resultSet.next()) {
            Socio socio = new Socio();
            socio.setCodSocio(resultSet.getString("COD_SOC"));
            socio.setNombre(resultSet.getString("NOMBRE"));
            socio.setApellido(resultSet.getString("APELLIDOS"));
            socio.setDNI(resultSet.getString("DNI"));
            socio.setTelefono(resultSet.getInt("TELEFONO"));
            socio.setEmail(resultSet.getString("EMAIL"));
            socio.setFecha_Nacimiento(resultSet.getDate("FECHA_NACI").toLocalDate());
            socio.setContrasena(resultSet.getString("PASSWD"));
            socio.setTipo(resultSet.getString("TIPO_SOCIO"));
            socios.add(socio);
        }
        gbd.cerrarConexion(conn);

    }

/*No actualiza*/
    public static void actualizarSocio(Socio socio) throws Exception {
        GenericoBD gbd = new GenericoBD();
        conn = gbd.conectar(conn);
        PreparedStatement sentencia = gbd.conectar(conn).prepareStatement("UPDATE SOCIOS SET NOMBRE = ?, APELLIDOS = ?, DNI = ?, TELEFONO = ?, EMAIL = ?, FECHA_NACI  = ?, PASSWD = ?  WHERE COD_SOC = ?");
        sentencia.setString(1, socio.getNombre());
        sentencia.setString(2, socio.getApellido());
        sentencia.setString(3, socio.getDNI());
        sentencia.setInt(4, socio.getTelefono());
        sentencia.setString(5, socio.getEmail());
        sentencia.setDate(6, Date.valueOf(socio.getFecha_Nacimiento()));
        sentencia.setString(7, socio.getContrasena());
        sentencia.setString(8, socio.getCodSocio());
        sentencia.executeUpdate();
        gbd.cerrarConexion(conn);
    }

    public static void borrarSocio(Socio socio) throws Exception {
        GenericoBD gbd = new GenericoBD();
        conn = gbd.conectar(conn);
        PreparedStatement sentencia = gbd.conectar(conn).prepareStatement("delete  SOCIOS   WHERE COD_SOC = ?");
        sentencia.setString(1, socio.getCodSocio());
        sentencia.executeUpdate();
        gbd.cerrarConexion(conn);
    }

    public static void buscarSocio(Socio socio) throws Exception {
        GenericoBD gbd = new GenericoBD();
        conn = gbd.conectar(conn);
        PreparedStatement sentencia = gbd.conectar(conn).prepareStatement("SELECT * FROM SOCIOS WHERE COD_SOC = ?");
        sentencia.setString(1, socio.getCodSocio());
        ResultSet resultSet = sentencia.executeQuery();
        if (resultSet.next()) {
            socio.setCodSocio(resultSet.getString("COD_SOC"));
            socio.setNombre(resultSet.getString("NOMBRE"));
            socio.setApellido(resultSet.getString("APELLIDOS"));
            socio.setDNI(resultSet.getString("DNI"));
            socio.setTelefono(resultSet.getInt("TELEFONO"));
            socio.setEmail(resultSet.getString("EMAIL"));
            socio.setFecha_Nacimiento(LocalDate.parse((CharSequence) resultSet.getDate("FECHA_NACI")));
            socio.setContrasena(resultSet.getString("PASSWD"));
            gbd.cerrarConexion(conn);
        } else {
            gbd.cerrarConexion(conn);
        }


    }


}
