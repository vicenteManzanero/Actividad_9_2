/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.opciones;

import main.taller.Box;
import main.taller.Taller;
import main.util.GestorIO;
import main.util.Intervalo;

/**
 *
 * @author jrmd
 */
public abstract class OpcionTaller extends Opcion{
    
    protected Taller taller;

    public OpcionTaller(String titulo, Taller taller) {
        super(titulo);
        this.taller = taller;
    }
    // para controlar los minimos y maximos a la hora de calcular el precio
    protected double getValorDouble(String nombre, int min, int max) {
        
        GestorIO gestorIO = new GestorIO();
        boolean error;
        double valor;

        do {
            gestorIO.out("¿"+nombre+"? ["+min+"-"+max+"]:");
            valor = gestorIO.inDouble();
            error = !new Intervalo(min, max).incluye(valor);
            if (error) {
                gestorIO.out("Error!!! Debe ser un valor " + nombre + "válido");
            }
        } while (error);
        
        return valor;
    }
    //lo mismo pero en vez de un doble , para un enteero
    protected int getValorInt(String nombre, int min, int max) {
        
        GestorIO gestorIO = new GestorIO();
        boolean error;
        int valor;

        do {
            gestorIO.out("¿"+nombre+"? ["+min+"-"+max+"]:");
            valor = gestorIO.inInt();
            error = !new Intervalo(min, max).incluye(valor);
            if (error) {
                gestorIO.out("Error!!! Debe ser un valor " + nombre + "válido");
            }
        } while (error);
        
        return valor;
    }
    
    
    
}
