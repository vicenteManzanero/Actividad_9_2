/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.clientes;

/**
 *
 * @author ciclost
 */
public class Cliente {

    private String nombre;
    private int telefono;
    private static int codig = 1;
    private int codigo;
    TipoCliente Tipo;

    public Cliente(String nombre, int telefono, TipoCliente Tipo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.codigo = codig;
        this.Tipo = Tipo;
        codig++;

    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", telefono=" + telefono + ", codigo=" + codigo + '}';
    }

    public boolean tieneEsta(int codigo) {
        return this.codigo==codigo;
    }

}
