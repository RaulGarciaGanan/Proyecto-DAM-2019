package com.ikasgela.Clases;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;

public class Socio {
    private int codSocio;
    private String Nombre;
    private String Apellido;
    private String DNI;
    private int Telefono;
    private String Email;
    private LocalDate Fecha_Nacimiento;
    private String Cargo;
    private String Contrasena;
    private String Tipo;

    public Socio() {
    }

    public Socio(int codSocio, String nombre, String apellido, String DNI, int telefono, String email, LocalDate fecha_Nacimiento, String cargo, String contrasena, String tipo) {
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

    public int getCodSocio() {
        return codSocio;
    }

    public void setCodSocio(int codSocio) {
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

    public int getTelefono() {
        return Telefono;
    }


    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public LocalDate getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(LocalDate fecha_Nacimiento) {
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
