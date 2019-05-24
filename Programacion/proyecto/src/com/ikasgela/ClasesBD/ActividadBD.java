package com.ikasgela.ClasesBD;

import com.ikasgela.Clases.Actividad;
import com.ikasgela.Clases.Socio;
import com.ikasgela.Menu;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ActividadBD {
    private static Connection conn;
    public static List<Actividad> actividades = new ArrayList<>();

    public static void insertarActividad(Actividad actividad) throws Exception {
        GenericoBD gbd = new GenericoBD();
        conn = gbd.conectar(conn);
        PreparedStatement sentencia = gbd.conectar(conn).prepareStatement("INSERT INTO ACTIVIDADES(COD_ACTIVI,TIPO,DIFICULTAD,SOCIO_CREA_ACTIVIDAD,PRECIO,FECHA_INICIO,FECHA_FIN) VALUES(INCREMENTO_ACTIVIDAD.NEXTVAL,?,?,?,?,?,?)");
        sentencia.setString(1, actividad.getTipo());
        sentencia.setString(2, actividad.getDificultad());
        sentencia.setInt(3, actividad.getCod_soc());
        sentencia.setDouble(4, actividad.getPrecio());
        sentencia.setDate(5, Date.valueOf(actividad.getFecha_inicio()));
        sentencia.setDate(6, Date.valueOf(actividad.getFecha_fin()));
        sentencia.executeUpdate();
        gbd.cerrarConexion(conn);
    }

    public static void validarActividad(Actividad actividad) throws Exception {
        GenericoBD gbd = new GenericoBD();
        conn = gbd.conectar(conn);
        PreparedStatement sentencia = gbd.conectar(conn).prepareStatement("UPDATE SOCIOS SET ACEPTADA='SI' WHERE COD_ACTIVI=?");
        sentencia.setString(1, actividad.getCodigo());
        sentencia.executeUpdate();
        gbd.cerrarConexion(conn);
    }

    public static void listadoActividad() throws Exception {
        GenericoBD gbd = new GenericoBD();
        conn = gbd.conectar(conn);
        PreparedStatement sentencia = gbd.conectar(conn).prepareStatement("SELECT * FROM ACTIVIDADES");
        ResultSet resultSet = sentencia.executeQuery();
        while (resultSet.next()) {
            Actividad actividad = new Actividad();
            actividad.setCodigo(resultSet.getString("COD_ACTIVIDAD"));
            actividad.setTipo(resultSet.getString("TIPO"));
            actividad.setDificultad(resultSet.getString("DIFICULTAD"));
            actividad.setCod_soc(resultSet.getInt("SOCIOS_COD_SOC"));
            actividad.setPrecio(resultSet.getDouble("PRECIO"));
            actividad.setSuspension(resultSet.getString("MOTIVO_SUSPENSION"));
            actividad.setFecha_inicio(resultSet.getDate("FECHA_INICIO").toLocalDate());
            actividad.setFecha_fin(resultSet.getDate("FECHA_FIN").toLocalDate());
            actividad.setAceptada(resultSet.getString("ACEPTADA"));
            actividades.add(actividad);
        }
        gbd.cerrarConexion(conn);


    }

    public static void listadoValidarActividad() throws Exception {
        GenericoBD gbd = new GenericoBD();
        conn = gbd.conectar(conn);
        PreparedStatement sentencia = gbd.conectar(conn).prepareStatement("SELECT * FROM ACTIVIDADES WHERE ACEPTADA='NO'");
        ResultSet resultSet = sentencia.executeQuery();
        while (resultSet.next()) {
            Actividad actividad = new Actividad();
            actividad.setCodigo(resultSet.getString("COD_ACTIVIDAD"));
            actividad.setTipo(resultSet.getString("TIPO"));
            actividad.setDificultad(resultSet.getString("DIFICULTAD"));
            actividad.setCod_soc(resultSet.getInt("SOCIOS_COD_SOC"));
            actividad.setPrecio(resultSet.getDouble("PRECIO"));
            actividad.setSuspension(resultSet.getString("MOTIVO_SUSPENSION"));
            actividad.setFecha_inicio(resultSet.getDate("FECHA_INICIO").toLocalDate());
            actividad.setFecha_fin(resultSet.getDate("FECHA_FIN").toLocalDate());
            actividad.setAceptada(resultSet.getString("ACEPTADA"));
            actividades.add(actividad);
        }
        gbd.cerrarConexion(conn);

    }

    /*No actualiza*/
    public static void actualizarActividad(Actividad actividad) throws Exception {
        GenericoBD gbd = new GenericoBD();
        conn = gbd.conectar(conn);
        PreparedStatement sentencia = gbd.conectar(conn).prepareStatement("UPDATE SOCIOS SET TIPO=?,DIFICULTAD=?,SOCIOS_COD_SOC=?,PRECIO=?,FECHA_INICIO=?,FECHA_FIN=?  WHERE COD_ACTIVI = ?");
        sentencia.setString(1, actividad.getTipo());
        sentencia.setString(2, actividad.getDificultad());
        sentencia.setInt(3, actividad.getCod_soc());
        sentencia.setDouble(4, actividad.getPrecio());
        sentencia.setDate(5, Date.valueOf(actividad.getFecha_inicio()));
        sentencia.setDate(6, Date.valueOf(actividad.getFecha_fin()));
        sentencia.setString(8, actividad.getDescripcion());

        System.out.println(sentencia.executeUpdate());
        gbd.cerrarConexion(conn);
    }

    public static void borrarActividad(Actividad actividad) throws Exception {
        GenericoBD gbd = new GenericoBD();
        conn = gbd.conectar(conn);
        PreparedStatement sentencia = gbd.conectar(conn).prepareStatement("delete  ACTIVIDADES   WHERE COD_ACTIVI = ?");
        sentencia.setString(1, actividad.getCodigo());
        sentencia.executeUpdate();
        gbd.cerrarConexion(conn);
    }
}
