/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller;

import main.taller.Box;
import main.taller.ColaVehiculos;
import main.taller.tiposvehiculos.Coche;
import main.util.GestorIO;
import main.util.Intervalo;


/**
 *
 * @author jrmd
 */
public class Taller {
    
    private Box[] boxes;
    private ColaVehiculos colaInicial;
    private ColaVehiculos colaPendientesPago;

    public static final int NUM_BOXES = 6;
    
    public Taller() {
        
        this.boxes = new Box[NUM_BOXES];
        for (int i = 0; i < boxes.length; i++) {
            this.boxes[i] = new Box(i + 1);
        }
        
        this.colaInicial= new ColaVehiculos();
        this.colaPendientesPago = new ColaVehiculos();
    }

    public Box[] getBoxes() {
        return boxes;
    }

    public ColaVehiculos getColaInicial() {
        return colaInicial;
    }
    
    public ColaVehiculos getColaPendientes() {
        return colaPendientesPago;
    }
    
    public Box getBox() {
        GestorIO gestorIO = new GestorIO();
        int numBox;
        boolean error;
        do {
            gestorIO.out("¿Número box? [1-"+Taller.NUM_BOXES+"]:");
            numBox = gestorIO.inInt();
            error = !new Intervalo(1,Taller.NUM_BOXES).incluye(numBox);
            if (error){
                gestorIO.out("Error!!! Debe ser un número de box válido");
            }
        } while(error);
        return boxes[numBox - 1];
    }
    
    public void mostrarBoxes() {
        for (Box box : boxes) {
            box.mostrar();
        }
    }
}
