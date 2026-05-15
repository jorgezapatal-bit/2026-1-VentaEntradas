package ventaentradas;

import java.util.ArrayList;

public class Zona {
    private String nombre;
    private int capacidad;
    private int precio;
    private ArrayList<Entrada> entradas;

    public Zona(String nombre, int capacidad, int precio) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.precio = precio;
        this.entradas = new ArrayList<>();
    }

    public boolean generarEntradas() { return false; }
    public Entrada[] mostrarEntrada() { return null; }
    public Entrada[] venderEntrada(int numero) { return null; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }
    public int getPrecio() { return precio; }
    public void setPrecio(int precio) { this.precio = precio; }
}