package modelo;

public class UsuarioArreglo {
    private final Usuario[] usuarios;
    private int indice;

    // ¡ESTE ES EL CONSTRUCTOR QUE TE FALTABA!
    public UsuarioArreglo(int tamaño) {
        this.usuarios = new Usuario[tamaño];
        this.indice = 0;
    }

    public boolean add(Usuario u) {
        boolean result = false;
        if (this.indice < this.usuarios.length) {
            this.usuarios[this.indice] = u;
            this.indice++;
            result = true;
        }
        return result;
    }

    public Usuario ingresar(String dni, String contrasena) {
        Usuario result = null;
        for (int i = 0; i < this.indice; i++) {
            if (this.usuarios[i].getDni().equals(dni) && this.usuarios[i].getContrasena().equals(contrasena)) {
                result = this.usuarios[i];
                break;
            }
        }
        return result;
    }
}