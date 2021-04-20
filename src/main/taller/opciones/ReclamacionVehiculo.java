/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.opciones;

import main.taller.ColaVehiculos;
import main.taller.Box;
import main.taller.Taller;
import main.util.GestorIO;
import main.util.Intervalo;

/**
 *
 * @author jrmd
 */
public class ReclamacionVehiculo extends OpcionTaller {

    public ReclamacionVehiculo(Taller taller) {
        super("Meter nuevo vehículo a box", taller);
    }

    @Override
    public void ejecutar() {
        GestorIO gestorIO = new GestorIO();
        if (!taller.getColaInicial().vacia()) {
            Box box = taller.getBox();

            if (box.estaLibre()) {
                box.mete(taller.getColaInicial().saca());
                gestorIO.out("Vehículo añadido al box correctamente");
            } else {
                gestorIO.out("Error!! No se pueden meter el vehículo, hay uno en la primera fase del box");
            }
        } else {
            gestorIO.out("Error!!! En la cola no hay vehículos");
        }
    }
    
    

}
