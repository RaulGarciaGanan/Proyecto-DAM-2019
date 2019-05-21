package com.ikasgela.ClasesBD;

import com.ikasgela.*;
import com.ikasgela.Clases.Socio;

import javax.swing.*;
import java.sql.*;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SocioBD {

    private static Connection conn;


    public static Socio logearSocio() throws Exception {
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
        return user;
    }

    public static Socio insertarSocio() throws Exception {
        GenericoBD gbd = new GenericoBD();
        conn = gbd.conectar(conn);
        String nombre = Registro.registro.getTFNombre().getText();
        String apellidos = Registro.registro.getTFApellido().getText();
        String DNI = Registro.registro.getTFDNI().getText();
        String Telefono = Registro.registro.getTFTelefono().getText();
        String Email = Registro.registro.getTFEmail().getText();
        String Contraseña = Registro.registro.getTFContrasena().getText();
        String Fecha_naci = Registro.registro.getTFFecha_Naci().getText();
        PreparedStatement sentencia = gbd.conectar(conn).prepareStatement("INSERT INTO SOCIOS VALUES(INCREMENTO_SOCIO.NEXTVAL,?,?,default,?,DEFAULT,?,DEFAULT,DEFAULT,NULL,DEFAULT,NULL,NULL,DEFAULT,'NO',DEFAULT,null);");
        sentencia.setString(1, nombre);
        sentencia.setString(2, apellidos);
        Socio user = new Socio();
        ResultSet resultado = sentencia.executeQuery();
        if (resultado.next()) {
            user.setCodSocio(resultado.getString("cod_soc"));
            user.setNombre(resultado.getString("nombre"));
            user.setTipo(resultado.getString("tipo_socio"));
        }
        gbd.cerrarConexion(conn);
        return user;
    }


}
