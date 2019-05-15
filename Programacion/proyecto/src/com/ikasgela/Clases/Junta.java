package com.ikasgela.Clases;

import java.sql.Time;

public class Junta {
    private Time fecha_Inicio;
    private Time fecha_Fin;

    public Junta(Time fecha_Inicio, Time fecha_Fin) {
        this.fecha_Inicio = fecha_Inicio;
        this.fecha_Fin = fecha_Fin;
    }

    public Time getFecha_Inicio() {
        return fecha_Inicio;
    }

    public void setFecha_Inicio(Time fecha_Inicio) {
        this.fecha_Inicio = fecha_Inicio;
    }

    public Time getFecha_Fin() {
        return fecha_Fin;
    }

    public void setFecha_Fin(Time fecha_Fin) {
        this.fecha_Fin = fecha_Fin;
    }
}
