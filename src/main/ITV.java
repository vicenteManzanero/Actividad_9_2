/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import main.clientes.ListaClientes;
import main.taller.ListaVehiculos;
import main.taller.Taller;
import main.taller.opciones.AltaNuevoCliente;
import main.taller.opciones.CalculoIngresos;
import main.taller.opciones.CalculoYPagoRevisados;
import main.taller.opciones.CrearTarjetasSocio;
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
    private ListaVehiculos vehiculosFinalizados; //aqui se meten todos los vehiculos que han pagado
    private ListaClientes  clientesRegistrados; //para ir metiendo los clientes que se van registrando
    private boolean fin; // para salir

    public ITV() {

        this.fin = false;
        this.taller = new Taller();
        this.vehiculosFinalizados = new ListaVehiculos();
        this.clientesRegistrados = new ListaClientes();

        this.menu = new Menu();
        this.menu.añadir(new AltaNuevoCliente(taller));
        this.menu.añadir(new CrearTarjetasSocio(taller));
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

    //lo pone a true para que termine el bucle
    public void finalizar() {
        this.fin = true;
    }

    public static void main(String[] args) {
        new ITV().comenzar();
    }

}
