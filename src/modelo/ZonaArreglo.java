package modelo;

public class ZonaArreglo {
    private final Zona[] zonas;
    private int indice;

    // Constructor que define el tamaño máximo del arreglo
    public ZonaArreglo(int tamaño) {
        this.zonas = new Zona[tamaño];
        this.indice = 0;
    }

    // Método para agregar una zona al arreglo
    public boolean add(Zona z) {
        boolean result = false;
        if (this.indice < this.zonas.length) {
            this.zonas[this.indice] = z;
            this.indice++;
            result = true;
        }
        return result;
    }

    // Método para obtener una zona por su nombre
    public Zona getZonaxNombre(String nombre) {
        Zona result = null;
        for (int i = 0; i < this.indice; i++) {
            if (this.zonas[i].getNombre().equalsIgnoreCase(nombre)) {
                result = this.zonas[i];
                break;
            }
        }
        return result;
    }
}