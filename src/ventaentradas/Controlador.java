package ventaentradas;

public class Controlador {

    public void procesarVenta(Zona zona, int cantidadEntradas) {
        try {
            zona.venderEntrada(cantidadEntradas);
            System.out.println("Venta procesada correctamente.");
        } catch (LimiteEntradasException e) {
            System.out.println("Error de límite: " + e.getMessage());
        } catch (CapacidadExcedidaException e) {
            System.out.println("Error de capacidad: " + e.getMessage());
        } finally {
            System.out.println("Proceso de venta finalizado.");
        }
    }

    public void registrarTarjetaCliente(Cliente cliente) {
        try {
            cliente.registrarTarjeta();
            System.out.println("Tarjeta registrada correctamente.");
        } catch (TarjetaInvalidaException e) {
            System.out.println("Error de tarjeta: " + e.getMessage());
        }
    }
}
