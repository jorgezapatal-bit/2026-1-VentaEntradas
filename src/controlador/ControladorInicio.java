package controlador;

import general.Sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.UsuarioArreglo;
import vista.frmIniciar;

public class ControladorInicio {
    private UsuarioArreglo modelo;
    private frmIniciar vista;

    // El constructor recibe el arreglo y la ventanita
    public ControladorInicio(UsuarioArreglo modelo, frmIniciar vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        // ¡Aquí le damos vida al botón!
        this.vista.btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 1. Leemos lo que el usuario escribió
                String dni = vista.txtDni.getText();
                String pass = vista.txtContrasena.getText();
                
                // 2. Buscamos en nuestra "Base de Datos" global
                Sistema.usuarioConectado = modelo.ingresar(dni, pass);
                
                // 3. Validamos si lo encontró o no
                if (Sistema.usuarioConectado != null) {
                    JOptionPane.showMessageDialog(vista, "¡Bienvenido al sistema de Conciertos!");
                    // vista.dispose(); // Cierra esta ventana
                    // Aquí luego abriremos la ventana principal de compras
                } else {
                    JOptionPane.showMessageDialog(vista, "Error: DNI o contraseña incorrectos", "Aviso", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    
    // Método para arrancar y centrar la ventana
    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
