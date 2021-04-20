/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.opciones;

import main.taller.ListaVehiculos;
import main.taller.Taller;
import main.taller.opciones.Opcion;
import main.taller.tiposvehiculos.Vehiculo;
import main.util.GestorIO;

/**
 *
 * @author jrmd
 */
public class CalculoYPagoRevisados extends Opcion {

    private Taller taller;
    private ListaVehiculos vehiculosFinalizados;
    
    public CalculoYPagoRevisados(Taller taller, ListaVehiculos vehiculosFinalizados) {
        super("Calcular y pagar vehículo revisado");
        this.taller = taller;
        this.vehiculosFinalizados = vehiculosFinalizados;
    }

    @Override
    public void ejecutar() {
        
        GestorIO gestorIO = new GestorIO();
        
        if (!taller.getColaPendientes().vacia()) {
            Vehiculo vehiculo = taller.getColaPendientes().saca();
            gestorIO.out("\nEl vehículo " + vehiculo + " ha pagado " + vehiculo.calcularPrecio());
            this.vehiculosFinalizados.mete(vehiculo);
        } else {
            gestorIO.out("No hay vehículos en la cola de pendientes de pago");
        }
    }
    
}
