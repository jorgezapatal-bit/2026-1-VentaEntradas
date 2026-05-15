/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventaentradas;

/**
 *
 * @author HP
 */
public class Entrada {
    private int numero;
    private String estado;

    public Entrada(int numero, String estado) {
        this.numero = numero;
        this.estado = estado;
    }

    public boolean vender() { return false; }
    public boolean liberar() { return false; }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
