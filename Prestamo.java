/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Emilio
 */
public class Prestamo {
    private String fecha;
    private Usuario usuario;
    private Libro libro;
    private boolean activo;

    // Crea un préstamo para un usuario y un libro.
    public Prestamo(String fecha, Usuario usuario, Libro libro) {
        this.fecha = fecha;
        this.usuario = usuario;
        this.libro = libro;
        this.activo = false;
    }

    public void prestarLibro() {
        if (libro.consultarDisponibilidad()) {
            libro.setDisponible(false);
            usuario.agregarLibro(libro);
            activo = true;
            System.out.println("Préstamo realizado el " + fecha);
        } else {
            System.out.println("El libro no está disponible.");
        }
    }

    public void devolverLibro() {
        if (activo) {
            libro.setDisponible(true);
            usuario.quitarLibro(libro);
            activo = false;
            System.out.println("Libro devuelto correctamente.");
        } else {
            System.out.println("No hay un préstamo activo.");
        }
    }
}