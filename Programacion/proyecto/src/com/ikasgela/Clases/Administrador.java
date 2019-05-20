package com.ikasgela.Clases;

import java.sql.Time;

public class Administrador extends Socio {
    public Administrador(String codSocio, String nombre, String apellido, String DNI, String telefono, String email, Time fecha_Nacimiento, String cargo, String contrasena, String tipo) {
        super(codSocio, nombre, apellido, DNI, telefono, email, fecha_Nacimiento, cargo, contrasena, tipo);
    }
}
