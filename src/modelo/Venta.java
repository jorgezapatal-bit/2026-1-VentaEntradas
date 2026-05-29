package modelo;

import java.util.Date;

public class Venta {
    private Date fecha;
    private double montoTotal;
    private final EntradaArreglo entradas; // <- Colección para el máximo de 4 entradas
    private Tarjeta tarjetaDePago; // <- Referencia a la tarjeta usada

    public Venta(Date fecha, double montoTotal, Tarjeta tarjetaDePago) {
        this.fecha = fecha;
        this.montoTotal = montoTotal;
        this.tarjetaDePago = tarjetaDePago;
        this.entradas = new EntradaArreglo(4); // Límite estricto de 4 entradas
    }

    public boolean anular() { return false; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }
    
    public double getMontoTotal() { return montoTotal; }
    public void setMontoTotal(double montoTotal) { this.montoTotal = montoTotal; }
    
    public Tarjeta getTarjetaDePago() { return tarjetaDePago; }
    public void setTarjetaDePago(Tarjeta tarjetaDePago) { this.tarjetaDePago = tarjetaDePago; }
    
    public EntradaArreglo getEntradas() { return entradas; }
}