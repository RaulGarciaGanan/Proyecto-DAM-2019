package com.ikasgela.ClasesBD;

import com.ikasgela.Clases.Actividad;
import com.ikasgela.Clases.Cuota;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CuotaBD {
    private static Connection conn;
    public static List<Cuota> cuotas = new ArrayList<>();

    public static void insertarCuota(Cuota cuota) throws Exception {
        GenericoBD gbd = new GenericoBD();
        conn = gbd.conectar(conn);
        PreparedStatement sentencia = gbd.conectar(conn).prepareStatement("INSERT INTO CUOTAS (COD_CUOTA,TIPO_CUOTA,ANYO_VALIDEZ,SOCIOS_QUE_PAGA) VALUES(INCREMENTO_ACTIVIDAD.NEXTVAL,?,?,?)");
        sentencia.setString(1, cuota.getTipo_cuota());
        sentencia.setInt(2, cuota.getAnyo_validez());
        sentencia.setInt(3, cuota.getCod_soc());

        gbd.cerrarConexion(conn);
    }

    public static void listadoCuota() throws Exception {
        GenericoBD gbd = new GenericoBD();
        conn = gbd.conectar(conn);
        PreparedStatement sentencia = gbd.conectar(conn).prepareStatement("SELECT * FROM CUOTAS");
        ResultSet resultSet = sentencia.executeQuery();
        while (resultSet.next()) {
            Cuota cuota = new Cuota();
            cuota.setCodigo(resultSet.getString("COD_CUOTA"));
            cuota.setTipo_cuota(resultSet.getString("TIPO_CUOTA"));
            cuota.setSi_no_pagado(resultSet.getString("SI_NO_PAGADO"));
            cuota.setAnyo_validez(resultSet.getInt("ANYO_VALIDEZ"));
            cuota.setInformacion_pago(resultSet.getInt("INFORMACION_PAGO"));
            cuota.setCod_soc(resultSet.getInt("SOCIO_QUE_PAGA"));
            cuota.setImporte_ingresado(resultSet.getInt("IMPORTE_INGRESADO"));
            cuotas.add(cuota);
        }
        gbd.cerrarConexion(conn);


    }


    /*No actualiza*/
    public static void modificarCuota(Cuota cuota) throws Exception {
        GenericoBD gbd = new GenericoBD();
        conn = gbd.conectar(conn);
        PreparedStatement sentencia = gbd.conectar(conn).prepareStatement("UPDATE CUOTA SET TIPO_CUOTA=?, SOCIO_QUE_PAGA  WHERE COD_ACTIVI = ?");
        sentencia.setString(1, cuota.getTipo_cuota());
        sentencia.setInt(2, cuota.getCod_soc());
        System.out.println(sentencia.executeUpdate());
        gbd.cerrarConexion(conn);
    }

    public static void borrarCuota(Cuota cuota) throws Exception {
        GenericoBD gbd = new GenericoBD();
        conn = gbd.conectar(conn);
        PreparedStatement sentencia = gbd.conectar(conn).prepareStatement("delete  CUOTAS   WHERE COD_CUOTA = ?");
        sentencia.setString(1, cuota.getCodigo());
        sentencia.executeUpdate();
        gbd.cerrarConexion(conn);
    }
}
