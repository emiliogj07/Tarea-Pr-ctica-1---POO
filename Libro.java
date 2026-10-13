/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Emilio
 */
public class Libro {
     private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    // Crea un libro disponible para prestar.
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    //
    public boolean consultarDisponibilidad() {
        return disponible;
    }

    // Cambia la disponibilidad del libro. 
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
