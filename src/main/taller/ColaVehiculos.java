/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller;

import main.taller.tiposvehiculos.Vehiculo;
import java.util.Arrays;
import main.util.GestorIO;

/**
 *
 * @author jrmd
 */
public class ColaVehiculos extends ListaVehiculos{
    
    public ColaVehiculos() {
        
        super();
    }
    
    public Vehiculo saca() {
        assert !vacia();
        
        Vehiculo vehiculo = vehiculos[0];
        
        for (int i = 1; i < vehiculos.length; i++) {
            this.vehiculos[i-1] = this.vehiculos[i];
        }
        
        vehiculos = Arrays.copyOf(vehiculos, vehiculos.length - 1);
        
        return vehiculo;
    }
    
    public void mostrar() {
        GestorIO gestorIO = new GestorIO();
        if (!this.vacia()){
            gestorIO.out("\nCola Inicial:");
            for (Vehiculo vehiculo : vehiculos) {
                gestorIO.out("\n"+vehiculo);
            }
        }
    }
    
}
