/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telefonia;

/**
 *
 * @author Emilio
 */

// Prueba la facturación telefónica. 
public class MainTelefonia {
    public static void main(String[] args) {
        Plan plan = new Plan(100, 5, 600);
        Cliente cliente = new Cliente("Ana", "809-555-1234", plan);
        Factura factura = new Factura(cliente, 130, 7);

        factura.generarFactura();
    }
}
