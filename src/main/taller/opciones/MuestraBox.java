/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.opciones;

import main.taller.Taller;


/**
 *
 * @author jrmd
 */
public class MuestraBox extends OpcionTaller{

    public MuestraBox(Taller taller) {
        super("Mostrar box", taller);
    }

    @Override
    public void ejecutar() {
        taller.getBox().mostrar();
                    
    }
    
    
}
