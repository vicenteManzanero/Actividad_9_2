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
public class PasoDeFase extends OpcionTaller {

    public PasoDeFase(Taller taller) {
        super("Pasar de fase vehículos en box", taller);
        this.taller = taller;
    }

    @Override
    public void ejecutar() {
        GestorIO gestorIO = new GestorIO();
        taller.getBox().pasaVehiculosDeFase(taller.getColaPendientes());
        gestorIO.out("Vehículos desplazados de fase correctamente");
    }
}
