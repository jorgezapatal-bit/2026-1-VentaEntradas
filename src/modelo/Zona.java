package modelo;

import excepciones.CapacidadExcedidaException;
import excepciones.LimiteEntradasException;

public class Zona {
    private String nombre;
    private int capacidad;
    private int precio;
    private final EntradaArreglo entradas; 
    private int entradasVendidas; // Para llevar la cuenta manual

    public Zona(String nombre, int capacidad, int precio) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.precio = precio;
        this.entradas = new EntradaArreglo(capacidad);
        this.entradasVendidas = 0;
    }

    public Entrada[] venderEntrada(int numero) throws CapacidadExcedidaException, LimiteEntradasException {
        if (numero > 4) {
            throw new LimiteEntradasException("No se puede vender más de 4 entradas por transacción.");
        }
        if (this.entradasVendidas + numero > capacidad) {
            throw new CapacidadExcedidaException("No hay suficiente capacidad en la zona " + nombre);
        }
        
        // Simular la venta sumando a la cuenta manual
        this.entradasVendidas += numero;
        return null; 
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }
    public int getPrecio() { return precio; }
    public void setPrecio(int precio) { this.precio = precio; }
}