package com.ikasgela.Clases;

import java.sql.Time;

public class Administrador extends Socios {
    public Administrador(String nombre, String apellido, String DNI, String telefono, String email, Time fecha_Nacimiento, String cargo) {
        super(nombre, apellido, DNI, telefono, email, fecha_Nacimiento, cargo);
    }

    
}
