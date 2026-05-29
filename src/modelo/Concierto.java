package modelo;

import java.util.Date;

public class Concierto {
    private String nombre;
    private Date fecha;
    private final ZonaArreglo zonas; 

    public Concierto(String nombre, Date fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.zonas = new ZonaArreglo(4); // Máximo 4 zonas según las reglas
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }
    public ZonaArreglo getZonas() { return zonas; }
}