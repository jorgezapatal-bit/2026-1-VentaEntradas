package ventaentradas;

public class Cliente extends Persona {
    private int puntos;
    private Tarjeta tarjeta;

    public Cliente(String nombres, String apellidos, String dni, String contrasena, int puntos) {
        super(nombres, apellidos, dni, contrasena);
        this.puntos = puntos;
    }

    public boolean ingresar(String usuario, String clave) { return false; }

    @Override public boolean registrarTarjeta() { return false; }
    @Override public boolean eliminarTarjeta() { return false; }
    @Override public boolean anularVenta() { return false; }
    @Override public boolean comprar() { return false; }

    public int getPuntos() { return puntos; }
    public void setPuntos(int puntos) { this.puntos = puntos; }
    public Tarjeta getTarjeta() { return tarjeta; }
    public void setTarjeta(Tarjeta tarjeta) { this.tarjeta = tarjeta; }
}