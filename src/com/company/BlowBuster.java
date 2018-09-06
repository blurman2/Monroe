package com.company;

import java.util.ArrayList;

public class BlowBuster {
    //Atributos
    private ArrayList<Pelicula> listaPeliculas;

    //Constructor
    public BlowBuster(ArrayList<Pelicula> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }


    //Responsabilidades
    public Integer alquilar(Integer codIMDB){
        for (int i=0; i<listaPeliculas.size();i++){
            Pelicula peliculaEnCuestion = listaPeliculas.get(i);
            if(codIMDB == peliculaEnCuestion.getImdb()){
                Integer codigoEjemplar = peliculaEnCuestion.alquilar();
                return codigoEjemplar;
            }
        }
        System.out.println("No se encontró la película");
        return null;
    }


    public void devolver(Integer codPelicula, Integer codEjemplar){
        for (int i = 0; i< listaPeliculas.size(); i++){
            Pelicula peliculaEnCuestion = listaPeliculas.get(i);
            if(codPelicula == peliculaEnCuestion.getImdb()){
                peliculaEnCuestion.devolver(codEjemplar);
                return;
            }
        }
        System.out.println("Código de pelicula invalido");
    }


}
