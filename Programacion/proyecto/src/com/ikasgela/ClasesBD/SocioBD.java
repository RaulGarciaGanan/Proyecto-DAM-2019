package com.ikasgela.ClasesBD;

import com.ikasgela.Clases.Socio;
import com.ikasgela.Login;

import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SocioBD {

    private static Connection conn;
    private static Socio user = new Socio();
    private static Login log = new Login();


    public static Socio logearSocio() throws Exception {
        //Utilizamos usuario y nombre para logear a un usuario.
        GenericoBD gbd = new GenericoBD();
        conn = gbd.conectar(conn);
        String email = log.getUsuario().getText();
        String contrasenya = log.getPassword().getText();
        PreparedStatement sentencia = gbd.conectar(conn).prepareStatement("SELECT s.cod_soc, s.nombre, s.tipo_socio,  FROM Socios s WHERE usuario=? AND contraseña=?");
        sentencia.setString(1, email);
        sentencia.setString(2, contrasenya);
        ResultSet resultado = sentencia.executeQuery();
        if (resultado.next()) {
            user.setCodSocio(resultado.getString("id_persona"));
            user.setNombre(resultado.getString("nombre"));
            user.setTipo(resultado.getString("tipo"));
        }
        gbd.cerrarConexion(conn);
        return user;

    }
}
