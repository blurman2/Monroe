package com.company;

public abstract class Ejemplar {
    //Atributos
    private Integer codEjemplar;
    private Integer codIMDB;
    private Boolean prestado = false;

    //Constructor
    public Ejemplar(Integer codEjemplar, Integer codIMDB) {
        this.codEjemplar = codEjemplar;
        this.codIMDB = codIMDB;
    }

    //Getters y Setters
    public Integer getCodEjemplar() {
        return codEjemplar;
    }

    public Integer getCodIMDB() {
        return codIMDB;
    }

    public Boolean alquilado() {
        return prestado;
    }

    //Responsabilidades
    public void alquilar() {
        if (!alquilado()) {
            this.prestado = true;
            System.out.println("Se alquiló el ejemplar " + codEjemplar);
        } else {
            System.out.println("El ejemplar ya está alquilado");
        }
    }

    public void devolver(){
        this.prestado = false;
        System.out.println("Se devolvió el ejemplar " + codEjemplar);
    }
}
