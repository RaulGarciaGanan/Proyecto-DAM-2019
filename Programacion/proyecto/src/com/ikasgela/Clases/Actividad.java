package com.ikasgela.Clases;

import java.lang.management.ThreadInfo;
import java.sql.Time;
import java.time.LocalDate;

public class Actividad {

    private String codigo;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;
    private String tipo;
    private String dificultad;
    private int cod_soc;
    private String descripcion;
    private Double precio;
    private String suspension;
    private String aceptada;

    public Actividad() {
    }

    public Actividad(String codigo, LocalDate fecha_inicio, LocalDate fecha_fin, String tipo, String dificultad, int cod_soc, String descripcion, Double precio, String suspension, String aceptada) {
        this.codigo = codigo;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.tipo = tipo;
        this.dificultad = dificultad;
        this.cod_soc = cod_soc;
        this.descripcion = descripcion;
        this.precio = precio;
        this.suspension = suspension;
        this.aceptada = aceptada;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDate getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(LocalDate fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public int getCod_soc() {
        return cod_soc;
    }

    public void setCod_soc(int cod_soc) {
        this.cod_soc = cod_soc;
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

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    public String getSuspension() {
        return suspension;
    }

    public String getAceptada() {
        return aceptada;
    }

    public void setAceptada(String aceptada) {
        this.aceptada = aceptada;
    }
}
