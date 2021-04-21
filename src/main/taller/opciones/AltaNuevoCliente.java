/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.opciones;

import main.clientes.Cliente;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombreCliente() {
        GestorIO gestorIO = new GestorIO();
        gestorIO.out("¿Nombre del cliente?:");
        return gestorIO.inString();
    }

    public int getTelefono(int min, int max) {
        return getValorInt("Telefono", min, max);
    }
    public void hacerVip(Cliente cli){
        GestorIO gestorIO = new GestorIO();
        
        int opcion=0;
        
        do{
        gestorIO.out("¿Quieres hacer vip al cliente?\n(Pulsa 1 para hacerlo):");
        opcion=gestorIO.inInt();
        }while(opcion!=1);
        if(opcion==1) cli.setEsVip(true);
        
        
    }
    public void informarCodigoYConfirmacion(Cliente cli){
        
        GestorIO gestorIO = new GestorIO();
        gestorIO.out("El cliente "+ cli.getNombre()+ "ha sido dado de alta correctamente.\nSu codigo es :"+ cli.getCodigo());
              
    }
    

}
