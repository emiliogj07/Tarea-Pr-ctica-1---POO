/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Emilio
 */
import java.util.ArrayList;

// Guarda la información de un usuario. 
public class Usuario {
    private String nombre;
    private int id;
    private ArrayList<Libro> librosPrestados;

    // Crea un usuario sin libros prestados.
    public Usuario(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.librosPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    // Agrega un libro a la lista del usuario. 
    public void agregarLibro(Libro libro) {
        librosPrestados.add(libro);
    }

    public void quitarLibro(Libro libro) {
        librosPrestados.remove(libro);
    }

    public void mostrarLibrosPrestados() {
        if (librosPrestados.isEmpty()) {
            System.out.println("No tiene libros prestados.");
        } else {
            for (Libro libro : librosPrestados) {
                System.out.println("- " + libro.getTitulo());
            }
        }
    }
}

