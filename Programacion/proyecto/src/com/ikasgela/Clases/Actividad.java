package com.ikasgela.Clases;

import java.lang.management.ThreadInfo;
import java.sql.Time;

public class Actividad {

    private String codigo;
    private Time fecha;
    private String descripcion;
    private Double precio;
    private boolean suspension;

    public Actividad(String codigo, Time fecha, String descripcion, Double precio, boolean suspension) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.precio = precio;
        this.suspension = suspension;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Time getFecha() {
        return fecha;
    }

    public void setFecha(Time fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public boolean isSuspension() {
        return suspension;
    }

    public void setSuspension(boolean suspension) {
        this.suspension = suspension;
    }
}
