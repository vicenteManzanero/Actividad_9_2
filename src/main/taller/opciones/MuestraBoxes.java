/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.opciones;

import main.taller.Box;
import main.taller.Taller;

/**
 *
 * @author jrmd
 */
public class MuestraBoxes extends OpcionTaller{

    public MuestraBoxes(Taller taller) {
        super("Mostrar taller completo", taller);
    }

    @Override
    public void ejecutar() {
        taller.getColaInicial().mostrar();
        taller.mostrarBoxes();
    }
    
    
    
    
}
