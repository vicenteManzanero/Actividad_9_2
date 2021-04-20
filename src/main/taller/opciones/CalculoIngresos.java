/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.opciones;

import main.taller.ListaVehiculos;
import main.util.GestorIO;

/**
 *
 * @author jrmd
 */
public class CalculoIngresos extends Opcion {

    private ListaVehiculos vehiculosFinalizados;
    
    public CalculoIngresos(ListaVehiculos vehiculosFinalizados) {
        super("Cálculo de ingresos");
        this.vehiculosFinalizados = vehiculosFinalizados;
    }

    @Override
    public void ejecutar() {
        if (!this.vehiculosFinalizados.vacia()) {
            this.vehiculosFinalizados.mostrarPrecio();
        } else {
            new GestorIO().out("No hay vehículos hasta el momento que hayan pasado la revisión");
        }
    }
}
