package com.company;

import java.util.Date;

public class VHS extends Ejemplar{
    //Atributos
    private Date fechaFabricacion;

    //Constructor
    public VHS(Integer codEjemplar, Integer codIMDB) {
        super(codEjemplar, codIMDB);
        this.fechaFabricacion = new Date();
    }

    //Getters

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }
}
