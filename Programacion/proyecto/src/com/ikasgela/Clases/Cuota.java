package com.ikasgela.Clases;

import java.sql.Time;

public class Cuota {
    private String tipo_cuota;
    private String si_no_cuota;
    private Time anyo_validez;
    private int cuanto_pagar;
    private int importe_ingresado;

    public Cuota(String tipo_cuota, String si_no_cuota, Time anyo_validez, int cuanto_pagar, int importe_ingresado) {
        this.tipo_cuota = tipo_cuota;
        this.si_no_cuota = si_no_cuota;
        this.anyo_validez = anyo_validez;
        this.cuanto_pagar = cuanto_pagar;
        this.importe_ingresado = importe_ingresado;
    }

    public String getTipo_cuota() {
        return tipo_cuota;
    }

    public void setTipo_cuota(String tipo_cuota) {
        this.tipo_cuota = tipo_cuota;
    }

    public String getSi_no_cuota() {
        return si_no_cuota;
    }

    public void setSi_no_cuota(String si_no_cuota) {
        this.si_no_cuota = si_no_cuota;
    }

    public Time getAnyo_validez() {
        return anyo_validez;
    }

    public void setAnyo_validez(Time anyo_validez) {
        this.anyo_validez = anyo_validez;
    }

    public int getCuanto_pagar() {
        return cuanto_pagar;
    }

    public void setCuanto_pagar(int cuanto_pagar) {
        this.cuanto_pagar = cuanto_pagar;
    }

    public int getImporte_ingresado() {
        return importe_ingresado;
    }

    public void setImporte_ingresado(int importe_ingresado) {
        this.importe_ingresado = importe_ingresado;
    }
}
