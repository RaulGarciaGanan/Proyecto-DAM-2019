package com.ikasgela.ClasesBD;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GenericoBD {

    public Connection  conectar(Connection conn) {
        System.out.println("--- Conexión a Oracle --------------------------");

         conn = null;
        try {
            // Cargar el driver Oracle JDBC Thin (ojdbc7.jar)
            // REF: Descarga: http://www.oracle.com/technetwork/database/features/jdbc/default-2280470.html
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

            // Cadena de conexión: driver@machineName:port:SID, userid, password
            conn = DriverManager.getConnection("jdbc:oracle:thin:@SrvOracle:1521:orcl", "eqdam02", "eqdam02");
            System.out.println("INFO: Conexión abierta");
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(GenericoBD.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void cerrarConexion(Connection conn) throws SQLException{

        try
        {
             conn = null;
            System.out.print("Conexion cerrada");
            conn.close();
        }
        catch(SQLException e){

        }
    }

}
