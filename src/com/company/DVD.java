package com.company;

public class DVD extends Ejemplar {
    //Atributos
    private Integer nroZona;


    //Constructor
    public DVD(Integer codEjemplar, Integer codIMDB, Integer nroZona) {
        super(codEjemplar, codIMDB);
        this.nroZona = nroZona;
    }

    //Getters y Setters
    public Integer getNroZona() {
        return nroZona;
    }
}
