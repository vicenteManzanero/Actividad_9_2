/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller;

import main.taller.tiposvehiculos.Vehiculo;
import main.util.GestorIO;

/**
 *
 * @author jrmd
 */
public class Box {

    private int id;
    private FaseRevision[] fasesRevision;

    private static final String[] TITULOS_FASES = new String[]{
        "1(Seguridad)",
        "2(Sistema eléctrico)",
        "3(Humos)",
        "4(Frenos y dirección)"
    };
    private static final int NUM_FASES = 4;

    public Box(int id) {
        this.id = id;
        this.fasesRevision = new FaseRevision[NUM_FASES];
        for (int i = 0; i < this.fasesRevision.length; i++) {
            this.fasesRevision[i] = new FaseRevision(TITULOS_FASES[i]);
        }
    }

    public boolean estaLibre() {
        return !this.fasesRevision[0].hayVehiculo();
    }

    private boolean esPrimeraFase(int indiceFase) {
        return indiceFase == 0;
    }

    public void mete(Vehiculo vehiculo) {
        fasesRevision[0].asigna(vehiculo);
    }
    //si no esta en la primera fase , asigna el vehiculo a la fase siguiente
    //van pasando de fase dentro de un box
    //
    public void pasaVehiculosDeFase(ColaVehiculos colaPendientes) {
        
        if (fasesRevision[fasesRevision.length - 1].hayVehiculo()) {
            fasesRevision[fasesRevision.length - 1].asignaVehiculoA(colaPendientes);
        }
        
        for (int i = fasesRevision.length - 1; i > 0; i--) {
            if (!esPrimeraFase(i)) {
                this.fasesRevision[i - 1].asignaVehiculoA(this.fasesRevision[i]);
            }
        }

        this.fasesRevision[0].desasignaVehiculo();
    }
    //muestra el numero de box y la fase de revision
    public void mostrar() {
        GestorIO gestorIO = new GestorIO();
        gestorIO.out("\nBox:" + id + "\n----");
        for (FaseRevision faseRevision : fasesRevision) {
            faseRevision.mostrar();
        }
    }
}
