package ventaentradas;

import java.util.Date;

public class Venta {
    private Date fecha;
    private int monto;

    public Venta(Date fecha, int monto) {
        this.fecha = fecha;
        this.monto = monto;
    }

    public boolean anular() { return false; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }
    public int getMonto() { return monto; }
    public void setMonto(int monto) { this.monto = monto; }
}