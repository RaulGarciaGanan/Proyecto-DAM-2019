package com.ikasgela.ClasesBD;

import com.ikasgela.Clases.Actividad;
import com.ikasgela.Clases.Socio;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class ActividadBD {
    private static Connection conn;
    public static List<Actividad> actividades = new ArrayList<>();

    public static void insertarActividad(Actividad actividad) throws Exception {
        GenericoBD gbd = new GenericoBD();
        conn = gbd.conectar(conn);
        PreparedStatement sentencia = gbd.conectar(conn).prepareStatement("INSERT INTO ACTIVIDADES(COD_ACTIVI,TIPO,DIFICULTAD,SOCIOS_COD_SOC,PRECIO,FECHA_INICIO,FECHA_FIN) VALUES(INCREMENTO_SOCIO.NEXTVAL,?,?,?,?,?,?,?)");
        sentencia.setString(1, actividad.getTipo());
        sentencia.setString(2, actividad.getDificultad());
        sentencia.setInt(3, actividad.getCod_soc());
        sentencia.setDouble(4, actividad.getPrecio());
        sentencia.setDate(5, Date.valueOf(actividad.getFecha_inicio()));
        sentencia.setDate(6, Date.valueOf(actividad.getFecha_fin()));
        sentencia.setString(8, actividad.getDescripcion());
        sentencia.executeUpdate();
        gbd.cerrarConexion(conn);
    }
}
