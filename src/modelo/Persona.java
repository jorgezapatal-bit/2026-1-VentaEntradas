package modelo;

import excepciones.TarjetaInvalidaException;

public abstract class Persona {
    private String nombres;
    private String apellidos;
    private String dni;
    private String contrasena; // Fíjate que está sin 'ñ'

    public Persona(String nombres, String apellidos, String dni, String contrasena) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.contrasena = contrasena;
    }

    public abstract boolean registrarTarjeta() throws TarjetaInvalidaException;
    public abstract boolean eliminarTarjeta();
    public abstract boolean anularVenta();
    public abstract boolean comprar();

    // Getters y Setters
    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }
    
    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }
    
    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }
    
    // AQUÍ ESTÁN LOS GETTERS Y SETTERS DE LA CONTRASEÑA
    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }
}