package modelo;

public class EntradaArreglo {
    private final Entrada[] entradas;
    private int indice;

    public EntradaArreglo(int tamaño) {
        this.entradas = new Entrada[tamaño];
        this.indice = 0;
    }

    public boolean add(Entrada e) {
        boolean result = false;
        if (this.indice < this.entradas.length) {
            this.entradas[this.indice] = e;
            this.indice++;
            result = true;
        }
        return result;
    }
}