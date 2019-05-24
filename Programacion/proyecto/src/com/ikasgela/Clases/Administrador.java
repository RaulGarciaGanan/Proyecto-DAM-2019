package com.ikasgela.Clases;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;

public class Administrador extends Socio {
    public Administrador(int codSocio, String nombre, String apellido, String DNI, int telefono, String email, LocalDate fecha_Nacimiento, String cargo, String contrasena, String tipo) {
        super(codSocio, nombre, apellido, DNI, telefono, email, fecha_Nacimiento, cargo, contrasena, tipo);
    }
}
