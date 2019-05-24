package com.ikasgela.Clases;

import java.sql.Time;
import java.time.LocalDate;

public class Cuota {
    private String codigo;
    private String tipo_cuota;
    private String si_no_pagado;
    private int anyo_validez;
    private int informacion_pago;
    private int importe_ingresado;
    private int Cod_soc;

    public Cuota() {
    }

    public Cuota(String codigo, String tipo_cuota, String si_no_pagado, int anyo_validez, int informacion_pago, int importe_ingresado, int cod_soc) {
        this.codigo = codigo;
        this.tipo_cuota = tipo_cuota;
        this.si_no_pagado = si_no_pagado;
        this.anyo_validez = anyo_validez;
        this.informacion_pago = informacion_pago;
        this.importe_ingresado = importe_ingresado;
        Cod_soc = cod_soc;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo_cuota() {
        return tipo_cuota;
    }

    public void setTipo_cuota(String tipo_cuota) {
        this.tipo_cuota = tipo_cuota;
    }

    public String getSi_no_pagado() {
        return si_no_pagado;
    }

    public void setSi_no_pagado(String si_no_pagado) {
        this.si_no_pagado = si_no_pagado;
    }

    public int getAnyo_validez() {
        return anyo_validez;
    }

    public void setAnyo_validez(int anyo_validez) {
        this.anyo_validez = anyo_validez;
    }

    public int getInformacion_pago() {
        return informacion_pago;
    }

    public void setInformacion_pago(int informacion_pago) {
        this.informacion_pago = informacion_pago;
    }

    public int getImporte_ingresado() {
        return importe_ingresado;
    }

    public void setImporte_ingresado(int importe_ingresado) {
        this.importe_ingresado = importe_ingresado;
    }

    public int getCod_soc() {
        return Cod_soc;
    }

    public void setCod_soc(int cod_soc) {
        Cod_soc = cod_soc;
    }
}
