package org.kt.model;

/**
 * Representa la entidad Libro dentro del modelo de dominio de LibraryApp.
 * 
 * @author Kevin Tuy - 2026320
 * @version 1.0.0
 */
public class Libro {
    private int idLibro;
    private String titulo;
    private String isbn;
    private double precio;

    public Libro() {}

    public Libro(int idLibro, String titulo, String isbn, double precio) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.isbn = isbn;
        this.precio = precio;
    }

    public int getIdLibro() { return idLibro; }
    public void setIdLibro(int idLibro) { this.idLibro = idLibro; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    @Override
    public String toString() { return "Libro{" + "idLibro=" + idLibro + ", titulo=" + titulo + ", isbn=" + isbn + ", precio=" + precio + '}'; }
}