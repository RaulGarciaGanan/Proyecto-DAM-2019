package com.ikasgela.Clases;

import java.sql.Time;

public class Socios {
    private String Nombre;
    private String Apellido;
    private String DNI;
    private String Telefono;
    private String Email;
    private Time Fecha_Nacimiento;
    private String Cargo;

    public Socios(String nombre, String apellido, String DNI, String telefono, String email, Time fecha_Nacimiento, String cargo) {
        Nombre = nombre;
        Apellido = apellido;
        this.DNI = DNI;
        Telefono = telefono;
        Email = email;
        Fecha_Nacimiento = fecha_Nacimiento;
        Cargo = cargo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTelefono() {
        return Telefono;
    }


    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Time getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Time fecha_Nacimiento) {
        Fecha_Nacimiento = fecha_Nacimiento;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }
}
