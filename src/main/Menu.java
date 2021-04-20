/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import main.taller.opciones.Opcion;
import main.util.GestorIO;
import main.util.Intervalo;

/**
 *
 * @author jrmd
 */
class Menu {
    
    private Opcion[] opciones;
    private int numOpciones;
    
    public Menu() {
        this.opciones = new Opcion[50];
        this.numOpciones = 0;
    }
    //cada vex que añado una oocion la asignamos a una posicion del array
    //y incrementa la variable numopciones
    public void añadir(Opcion opcion) {
        opciones[numOpciones] = opcion;
        numOpciones++;
    }
    //pinta el menu en la pantalla
    public void mostrar(){
        for (int i= 0; i < numOpciones;i++) {
            opciones[i].mostrar(i+1);
        }
    }
    // pregunta al usuario el numero de opcion entre 1 y numopciones
    //
    public Opcion getOpcion() {
        GestorIO gestorIO = new GestorIO();
        int opcion;
        boolean error;
        do {
            gestorIO.out("\nOpción? [1-"+numOpciones+"]: ");
            opcion = gestorIO.inInt();
            error = !new Intervalo(1, numOpciones).incluye(opcion);
            if (error){
                gestorIO.out("Error!!! La opción debe ser entre 1 y "+ numOpciones);
            }
        } while (error);
        return opciones[opcion-1];
    }
    
    
    
}
