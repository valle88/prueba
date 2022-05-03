package com.editorial.pubs;


public class Libro {
    public enum  TEMATICA {
        TERROR,
        AMOR,
        CIENCIA_FICCION
    }
    String Titulo;
    int capitulos;
    TEMATICA tematica;
    String autor;

    public Libro() {
    }

    public Libro(String titulo, int capitulos, TEMATICA tematica, String autor) {
        Titulo = titulo;
        this.capitulos = capitulos;
        this.tematica = tematica;
        this.autor = autor;
    }

    public Libro(String titulo, String autor) {
        Titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    public TEMATICA getTematica() {
        return tematica;
    }

    public void setTematica(TEMATICA tematica) {
        this.tematica = tematica;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
