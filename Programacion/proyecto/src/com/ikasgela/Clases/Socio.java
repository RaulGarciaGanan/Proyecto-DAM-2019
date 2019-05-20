package com.ikasgela.Clases;

import java.sql.Time;

public class Socio {
    private String codSocio;
    private String Nombre;
    private String Apellido;
    private String DNI;
    private String Telefono;
    private String Email;
    private Time Fecha_Nacimiento;
    private String Cargo;
    private String Contrasena;
    private String Tipo;

    public Socio() {
    }

    public Socio(String codSocio, String nombre, String apellido, String DNI, String telefono, String email, Time fecha_Nacimiento, String cargo, String contrasena, String tipo) {
        this.codSocio = codSocio;
        Nombre = nombre;
        Apellido = apellido;
        this.DNI = DNI;
        Telefono = telefono;
        Email = email;
        Fecha_Nacimiento = fecha_Nacimiento;
        Cargo = cargo;
        Contrasena = contrasena;
        Tipo = tipo;
    }

    public String getCodSocio() {
        return codSocio;
    }

    public void setCodSocio(String codSocio) {
        this.codSocio = codSocio;
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

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }
}
