package org.kt.model;

/**
 * Representa la entidad Autor que interactúa con los libros.
 * 
 * @author Kevin Tuy - 2026320
 * @version 1.0.0
 */
public class Autor {
    private int idAutor;
    private String nombre;
    private String nacionalidad;

    public Autor() {}

    public Autor(int idAutor, String nombre, String nacionalidad) {
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public int getIdAutor() { return idAutor; }
    public void setIdAutor(int idAutor) { this.idAutor = idAutor; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getNacionalidad() { return nacionalidad; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }

    @Override
    public String toString() { return this.nombre; }
}