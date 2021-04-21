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
    private static int codig=1;
    private int codigo;
    private boolean esVip;
    private boolean tieneCarnet;

    public Cliente(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.esVip = false;
        this.tieneCarnet = false;
        this.codigo=codig;
        codig++;
        
    }

    public void setEsVip(boolean esVip) {
        this.esVip = esVip;
    }

    public void setTieneCarnet(boolean tieneCarnet) {
        this.tieneCarnet = tieneCarnet;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString() {
        return "Cliente" + "nombre=" + nombre + ", telefono=" + telefono + ", esVip=" + esVip + ", tieneCarnet=" + tieneCarnet + '}';
    }
    
    
    
    
    
}
