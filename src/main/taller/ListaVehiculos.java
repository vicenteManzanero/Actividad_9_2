/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller;

import java.util.Arrays;
import main.taller.tiposvehiculos.Vehiculo;
import main.util.GestorIO;

/**
 *
 * @author jrmd
 */
public class ListaVehiculos {
    
    protected Vehiculo[] vehiculos;
    
    public ListaVehiculos() {
        
        vehiculos = new Vehiculo[0];
    }

    public void mete(Vehiculo vehiculo) {
        vehiculos = Arrays.copyOf(vehiculos, vehiculos.length + 1);
        vehiculos[vehiculos.length - 1] = vehiculo;
    }
    
    public boolean vacia() {
        return this.vehiculos.length == 0;
    }

    public void mostrarPrecio() {
        double precioTotal = 0;
        
        for (Vehiculo vehiculo : vehiculos) {
            double precio = vehiculo.calcularPrecio();
            new GestorIO().out("\nVehículo: " + vehiculo + " Precio: " + precio);
            precioTotal+= precio;
        }
        
        new GestorIO().out("\nTotal: " + precioTotal);
    }
    
    public boolean contieneMatricula(String matricula){
        for(Vehiculo v: vehiculos){
            if(v.tieneEsta(matricula)){
                return true;
            }
        }
        return false;
    }
    
    
}
