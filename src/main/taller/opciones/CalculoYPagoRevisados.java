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
    //pasa el titulo de la opcion 
    public CalculoYPagoRevisados(Taller taller, ListaVehiculos vehiculosFinalizados) {
        super("Calcular y pagar vehículo revisado");
        this.taller = taller;
        this.vehiculosFinalizados = vehiculosFinalizados;
    }
    //verifica si esta vacia
    //si esta vacia muestra el mensaje del else
    //si hay , lo saca, lo guarda en vehiculo y muestra el vehiculo y lo que ha pagado
    @Override
    public void ejecutar() {
        
        GestorIO gestorIO = new GestorIO();
        
        if (!taller.getColaPendientes().vacia()) {
            Vehiculo vehiculo = taller.getColaPendientes().saca();
            gestorIO.out("\nEl vehículo " + vehiculo + " ha pagado " + vehiculo.calcularPrecio());
            this.vehiculosFinalizados.mete(vehiculo); //lo mete en la lista de vehiculos finalizados
        } else {
            gestorIO.out("No hay vehículos en la cola de pendientes de pago");
        }
    }
    
}
