package modelo;

public class VentaArreglo {
    private final Venta[] ventas;
    private int indice;

    public VentaArreglo(int tamaño) {
        this.ventas = new Venta[tamaño];
        this.indice = 0;
    }

    public boolean add(Venta v) {
        boolean result = false;
        if (this.indice < this.ventas.length) {
            this.ventas[this.indice] = v;
            this.indice++;
            result = true;
        }
        return result;
    }
}