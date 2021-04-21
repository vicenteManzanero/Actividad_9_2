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
    private String telefono;
    private static int codig=1;
    private int codigo;
    private boolean esVip;
    private boolean tieneCarnet;

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.esVip = false;
        this.tieneCarnet = false;
        this.codigo=codig;
        codig++;
        
    }
    
    public void hacerVip(){
        this.esVip=true;
    }
    public void hacerCarnet(){
        this.tieneCarnet=true;
    }

    @Override
    public String toString() {
        return "Cliente" + "nombre=" + nombre + ", telefono=" + telefono + ", esVip=" + esVip + ", tieneCarnet=" + tieneCarnet + '}';
    }
    
    
    
    
    
}
