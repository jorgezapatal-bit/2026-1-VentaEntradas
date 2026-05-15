package ventaentradas;

import java.util.ArrayList;
import java.util.Date;

public class Concierto {
    private String nombre;
    private Date fecha;
    private ArrayList<Zona> zonas;

    public Concierto(String nombre, Date fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.zonas = new ArrayList<>();
    }

    public boolean agregarZona(String nombre) { return false; }
    public boolean eliminarZona(String nombre) { return false; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }
    public ArrayList<Zona> getZonas() { return zonas; }
}