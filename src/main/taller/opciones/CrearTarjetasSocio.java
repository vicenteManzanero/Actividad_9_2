/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.opciones;

import main.taller.Taller;
import main.util.GestorIO;

/**
 *
 * @author vicen
 */
public class CrearTarjetasSocio extends OpcionTaller {

    public CrearTarjetasSocio(Taller taller) {
        super("Crear tarjeta de socio", taller);
    }

    @Override
    public void ejecutar() {
        int codigoCliente = solicitarNumeroSocio();
        
    }
    private int solicitarNumeroSocio(){
        GestorIO gestorIO = new GestorIO();
        gestorIO.out("Introduce el codigo de socio del cliente:");
        return gestorIO.inInt();
       
    }
    
    
    
}
