package org.kt.model;

/**
 * Representa la categoría o género literario de los libros.
 * 
 * @author Kevin Tuy - 2026320
 * @version 1.0.0
 */
public class Categoria {
    private int idCategoria;
    private String descripcion;

    public Categoria() {}

    public Categoria(int idCategoria, String descripcion) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
    }

    public int getIdCategoria() { return idCategoria; }
    public void setIdCategoria(int idCategoria) { this.idCategoria = idCategoria; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    @Override
    public String toString() { return this.descripcion; }
}