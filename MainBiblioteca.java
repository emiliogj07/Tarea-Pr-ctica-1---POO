/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Emilio
 */
public class MainBiblioteca {
    public static void main(String[] args) {
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", "123456789");
        Usuario usuario = new Usuario("Carlos", 1);
        Prestamo prestamo = new Prestamo("12/10/2026", usuario, libro);

        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Disponible: " + libro.consultarDisponibilidad());

        prestamo.prestarLibro();
        System.out.println("Disponible: " + libro.consultarDisponibilidad());
        usuario.mostrarLibrosPrestados();

        prestamo.devolverLibro();
        System.out.println("Disponible: " + libro.consultarDisponibilidad());
    }
}
