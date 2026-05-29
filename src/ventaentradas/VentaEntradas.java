package ventaentradas;

import controlador.ControladorInicio;
import general.Sistema;
import modelo.Usuario;
import vista.frmIniciar;

public class VentaEntradas {

    public static void main(String[] args) {
        // 1. Creamos un usuario "quemado" de prueba para poder ingresar
        // Fíjate que le pasamos: Nombres, Apellidos, DNI, Contraseña, Estado
        Sistema.usuarios.add(new Usuario("Jorge", "Zavaleta", "12345678", "secreto123", true));
        
        // 2. Instanciamos la vista y el controlador
        frmIniciar fInicio = new frmIniciar();
        ControladorInicio controlador = new ControladorInicio(Sistema.usuarios, fInicio);
        
        // 3. ¡Arrancamos el programa!
        controlador.iniciar();
    }
}