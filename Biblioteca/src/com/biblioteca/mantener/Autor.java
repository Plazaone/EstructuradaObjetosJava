package com.biblioteca.mantener;

public class Autor extends General {
    private String observarcion;
    private int librosPublicados;
    private  Pais pais;

    public Autor(){

    }

    public Autor(int codigo, String nombre, String observacion, int librosPublicados, Pais pais){
        super(codigo,nombre);
        this.observarcion= observacion;
        this.librosPublicados= librosPublicados;
        this.pais= pais;
    }

    public void setObservacion(String observacion){
        this.observarcion= observacion;
    }

    public String getObservacion (){
        return observarcion;
    }

    public void setLibrosPublicados(int librosPublicados){
        this.librosPublicados= librosPublicados;
    }

    public int getLibrosPublicados(){
        return librosPublicados;
    }
    public void setPais(Pais pais){
        this.pais = pais;
    }

    public Pais getPais(){
        return pais;
    }

    public String toString(){
        return "Autor{"+ super.toString()+" Observacion: " +observarcion + " Libros publicados: " + librosPublicados + " Pais: " + pais + '}';
    }
}
