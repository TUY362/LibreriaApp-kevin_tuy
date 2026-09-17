package org.kt.model;

/**
 * Entidad Libro para la capa modelo de LibraryApp.
 */
public class Libro {
    private int idLibro;
    private String titulo;
    private String isbn;
    private int stock;
    private double precio;

    public Libro() {
    }

    public Libro(int idLibro, String titulo, String isbn, int stock, double precio) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.isbn = isbn;
        this.stock = stock;
        this.precio = precio;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}