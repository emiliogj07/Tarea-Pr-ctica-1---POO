/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author Emilio
 */

public class Vehiculos {
    private String placa;
    private String marca;
    private String modelo;

    // Constructor con valores por defecto. 
    public Vehiculos() {
        this("Sin placa", "Sin marca", "Sin modelo");
    }

    // Constructor que recibe la placa. 
    public Vehiculos(String placa) {
        this(placa, "Sin marca", "Sin modelo");
    }

    // Constructor con todos los datos. 
    public Vehiculos(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // Calcula el costo según los kilómetros. 
    public double calcularMantenimiento(int kilometros) {
        return 500 + kilometros * 0.10;
    }

    public double calcularMantenimiento(int kilometros, String tipoServicio) {
        double costo = calcularMantenimiento(kilometros);

        if (tipoServicio.equalsIgnoreCase("aceite")) {
            costo += 700;
        } else if (tipoServicio.equalsIgnoreCase("completo")) {
            costo += 1500;
        }

        return costo;
    }

    public double calcularMantenimiento(int kilometros, String tipoServicio, boolean urgente) {
        double costo = calcularMantenimiento(kilometros, tipoServicio);

        if (urgente) {
            costo += 300;
        }
        return costo;
    }
}
