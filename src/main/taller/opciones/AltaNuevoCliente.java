/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.opciones;

import main.clientes.Cliente;
import main.clientes.ListaClientes;
import main.clientes.TipoCliente;
import main.taller.Taller;
import main.util.GestorIO;
import main.util.Intervalo;

/**
 *
 * @author ciclost
 */
public class AltaNuevoCliente extends OpcionTaller {

    public AltaNuevoCliente(Taller taller) {
        super("Dar de alta un nuevo cliente", taller);
    }

    @Override
    public void ejecutar() {
        GestorIO gestorIO = new GestorIO();
        Cliente cliente = this.registrarNuevoCliente();
            //ListaClientes.mete(this.registrarNuevoCliente());
            gestorIO.out("Cliente añadido correctamente,");
            informarCodigoYConfirmacion(cliente);
        
    }

    private Cliente registrarNuevoCliente() {
        TipoCliente tipo = getTipoCliente();
        switch (tipo) {
            case VIP:
                return new Cliente(getNombreCliente(), getTelefono(0, 999999999), tipo.VIP);

            case SOCIO:
                return new Cliente(getNombreCliente(), getTelefono(0, 999999999), tipo.SOCIO);

            case NORMAL:
                return new Cliente(getNombreCliente(), getTelefono(0, 999999999), tipo.NORMAL);

        }
        return null;
    }

    private String getNombreCliente() {
        GestorIO gestorIO = new GestorIO();
        gestorIO.out("Introduce el nombre del cliente:");
        return gestorIO.inString();
    }

    private int getTelefono(int min, int max) {
        return getValorInt("Introduce el telefono de contacto", min, max);
    }

    /*
    private void hacerVip(Cliente cli){
        GestorIO gestorIO = new GestorIO();
        
        int opcion=0;
        
        do{
        gestorIO.out("¿Quieres hacer vip al cliente?\n(Pulsa 1 para hacerlo):");
        opcion=gestorIO.inInt();
        }while(opcion!=1);
        if(opcion==1) cli.setEsVip(true);
        
        
    }
     */
    private TipoCliente getTipoCliente() {
        GestorIO gestorIO = new GestorIO();
        boolean error;
        int opcion;

        do {
            gestorIO.out("¿Que tipo de cliente vas a registrar?\n [1:Vip, 2:Socio, 3:Normal]:");
            opcion = gestorIO.inInt();
            error = !new Intervalo(1, 3).incluye(opcion);
            if (error) {
                gestorIO.out("Error!!! Debe ser un tipo válido");
            }
        } while (error);
        return TipoCliente.tipoSegunIndice(opcion);
    }

    private void informarCodigoYConfirmacion(Cliente cli) {

        GestorIO gestorIO = new GestorIO();
        gestorIO.out("El cliente " + cli.getNombre() + "ha sido dado de alta correctamente.\nSu codigo es :" + cli.getCodigo());

    }

}
