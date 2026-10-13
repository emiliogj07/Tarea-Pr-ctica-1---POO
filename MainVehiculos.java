/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author Emilio
 */

//
public class MainVehiculos {
    public static void main(String[] args) {
        Vehiculos vehiculo1 = new Vehiculos();
        Vehiculos vehiculo2 = new Vehiculos("A123456");
        Vehiculos vehiculo3 = new Vehiculos("B654321", "Toyota", "Corolla");

        System.out.println("Vehículo 1: " + vehiculo1.getPlaca());
        System.out.println("Vehículo 2: " + vehiculo2.getPlaca());
        System.out.println("Vehículo 3: " + vehiculo3.getMarca() + " " + vehiculo3.getModelo());

        // Tres formas de llamar al mismo método.
        System.out.println("Básico: RD$" + vehiculo3.calcularMantenimiento(10000));
        System.out.println("Cambio de aceite: RD$" + vehiculo3.calcularMantenimiento(10000, "aceite"));
        System.out.println("Completo urgente: RD$" + vehiculo3.calcularMantenimiento(10000, "completo", true));
    }
}
