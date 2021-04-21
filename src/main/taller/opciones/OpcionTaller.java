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
}