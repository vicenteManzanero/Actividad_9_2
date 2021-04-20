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
public class Microbus extends TransportePersonas {
    
    private static final double PRECIO_POR_PLAZA = 2;
    
    public Microbus(int numPlazas, String matricula, String modelo, int cilindros) {
        super(numPlazas, matricula, modelo, cilindros, 0, PRECIO_POR_PLAZA);
    }

    @Override
    public double calcularPrecio() {
        return super.calcularPrecio();
    }
}
