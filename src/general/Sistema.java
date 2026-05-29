package general;

import modelo.ZonaArreglo;
import modelo.UsuarioArreglo;
import modelo.Usuario;

public class Sistema {
    // Estas variables son public y static para acceder a ellas desde cualquier parte
    public static UsuarioArreglo usuarios = new UsuarioArreglo(100);
    public static Usuario usuarioConectado = null;
    public static ZonaArreglo zonas = new ZonaArreglo(4); // Solo hay 4 zonas disponibles
}