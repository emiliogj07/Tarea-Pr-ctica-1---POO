/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telefonia;

/**
 *
 * @author Emilio
 */
public class Factura {
    
    private Cliente cliente;
    private int minutosUsados;
    private double datosUsados;

    // Crea una factura con el consumo del cliente. 
    public Factura(Cliente cliente, int minutosUsados, double datosUsados) {
        this.cliente = cliente;
        this.minutosUsados = minutosUsados;
        this.datosUsados = datosUsados;
    }

    public double calcularExtras() {
        Plan plan = cliente.getPlan();
        int minutosExtra = 0;
        double datosExtra = 0;

        if (minutosUsados > plan.getMinutosIncluidos()) {
            minutosExtra = minutosUsados - plan.getMinutosIncluidos();
        }
        if (datosUsados > plan.getDatosGB()) {
            datosExtra = datosUsados - plan.getDatosGB();
        }

        return minutosExtra * 2 + datosExtra * 50;
    }

    //* Calcula el precio mensual más los extras. 
    public double calcularTotal() {
        return cliente.getPlan().getPrecioMensual() + calcularExtras();
    }

    public void generarFactura() {
        Plan plan = cliente.getPlan();
        System.out.println("--- FACTURA ---");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Teléfono: " + cliente.getNumeroTelefonico());
        System.out.println("Minutos incluidos: " + plan.getMinutosIncluidos());
        System.out.println("Minutos usados: " + minutosUsados);
        System.out.println("Datos incluidos: " + plan.getDatosGB() + " GB");
        System.out.println("Datos usados: " + datosUsados + " GB");
        System.out.printf("Precio del plan: RD$%.2f%n", plan.getPrecioMensual());
        System.out.printf("Cargos extras: RD$%.2f%n", calcularExtras());
        System.out.printf("Total a pagar: RD$%.2f%n", calcularTotal());
    }
    
}
