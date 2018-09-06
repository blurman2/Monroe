package com.company;

import java.util.ArrayList;

public class Pelicula {
    //Atributos
    private Integer imdb;
    private String titulo;
    private Integer anioPub;
    private ArrayList<String> listaIdiomas;
    private ArrayList<Ejemplar> listaEjemplares;

    //Constructor
    public Pelicula(Integer imdb, String titulo, Integer anioPub, ArrayList<Ejemplar> listaEjemplares, ArrayList<String> listaIdiomas) {
        this.imdb = imdb;
        this.titulo = titulo;
        this.anioPub = anioPub;
        this.listaEjemplares = listaEjemplares;
        this.listaIdiomas = listaIdiomas;

    }

    //Getters
    public Integer getImdb() {
        return imdb;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getAnioPub() {
        return anioPub;
    }

    //Responsabilidades
    public void imprimirIdiomas(){
        System.out.println(listaIdiomas);
    }

    public Integer alquilar(){
        for(int i=0; i<listaEjemplares.size();i++){
            Ejemplar ejemplarEnCuestion = listaEjemplares.get(i);
            if(!ejemplarEnCuestion.alquilado()){
                ejemplarEnCuestion.alquilar();
                return ejemplarEnCuestion.getCodEjemplar();
            }
        }
        System.out.println("No hay ejemplares disponibles de la película " + titulo );
        return null;
    }

    public void devolver(Integer codigoADevolver){
        for(int i=0; i< listaEjemplares.size();i++){
            Ejemplar ejemplarEnCuestion = listaEjemplares.get(i);
            if(codigoADevolver == ejemplarEnCuestion.getCodEjemplar()){
                ejemplarEnCuestion.devolver();
                return; //mata la fución
            }
        }
        System.out.println("El código de ejemplar no es válido");
    }


}
