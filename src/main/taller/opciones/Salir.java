/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.opciones;

import main.ITV;

/**
 *
 * @author jrmd
 */
//recibe una referencia al programa principal
public class Salir extends Opcion{
    private ITV itv;
    public Salir(ITV itv) {
        super("Salir del programa");
        this.itv = itv;
    }
    //lama a finalizar de itv (pone fin a true)
    @Override
    public void ejecutar() {
        itv.finalizar();
    }
    
}
