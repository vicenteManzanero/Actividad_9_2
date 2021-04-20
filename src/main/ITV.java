/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import main.taller.ListaVehiculos;
import main.taller.Taller;
import main.taller.opciones.CalculoIngresos;
import main.taller.opciones.CalculoYPagoRevisados;
import main.taller.opciones.MuestraBox;
import main.taller.opciones.MuestraBoxes;
import main.taller.opciones.PasoDeFase;
import main.taller.opciones.ReclamacionVehiculo;
import main.taller.opciones.RegistroNuevoVehiculo;
import main.taller.opciones.Salir;

/**
 *
 * @author jrmd
 */
public class ITV {

    private Menu menu;
    private Taller taller;
    private ListaVehiculos vehiculosFinalizados;
    private boolean fin;
    
    public ITV() {
        
        this.fin = false;
        this.taller = new Taller();
        this.vehiculosFinalizados = new ListaVehiculos();
        
        this.menu = new Menu();
        this.menu.añadir(new RegistroNuevoVehiculo(taller));
        this.menu.añadir(new ReclamacionVehiculo(taller));
        this.menu.añadir(new PasoDeFase(taller));
        this.menu.añadir(new MuestraBox(taller));
        this.menu.añadir(new MuestraBoxes(taller));
        this.menu.añadir(new CalculoYPagoRevisados(taller, vehiculosFinalizados));
        this.menu.añadir(new CalculoIngresos(vehiculosFinalizados));
        this.menu.añadir(new Salir(this));
    }
    
    
    private void comenzar() {
        
        do {
            menu.mostrar();
            menu.getOpcion().ejecutar();
          
        } while (!fin);
    }
    
    public void finalizar(){
        this.fin = true;
    }

    public static void main(String[] args) {
        new ITV().comenzar();
    }
    

}
