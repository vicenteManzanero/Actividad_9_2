/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.tiposvehiculos;

/**
 *
 * @author jrmd
 */
public class Furgoneta extends TransporteCarga{
    
    public Furgoneta(double pma, String matricula, String modelo, int cilindros) {
        super(pma, matricula, modelo, cilindros);
    }

    @Override
    public double calcularPrecio() {
        return super.calcularPrecio();
    }
    
}
