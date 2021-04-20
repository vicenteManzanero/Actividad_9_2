/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.opciones;

import main.util.GestorIO;

/**
 *
 * @author jrmd
 */
public abstract class Opcion {
    private String titulo;

    public Opcion(String titulo) {
        this.titulo = titulo;
    }

    public void mostrar(int numOpcion) {
        GestorIO gestorIO = new GestorIO();
        gestorIO.out("\n" + numOpcion + "." + titulo);
    }
   
    
    public abstract void ejecutar();
    
    
}
