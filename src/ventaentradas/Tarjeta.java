package ventaentradas;

public class Tarjeta {
    private int numero;
    private String nombre;
    private String fecha;
    private int cvv;

    public Tarjeta(int numero, String nombre, String fecha, int cvv) {
        this.numero = numero;
        this.nombre = nombre;
        this.fecha = fecha;
        this.cvv = cvv;
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public int getCvv() { return cvv; }
    public void setCvv(int cvv) { this.cvv = cvv; }
}