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
public class Coche extends TransportePersonas{
    
    private static final double PRECIO_POR_PLAZA = 1.5;
    
    public Coche(int numPlazas, String matricula, String modelo, int potencia, int cilindros) {
        super(numPlazas, matricula, modelo, potencia, cilindros, PRECIO_POR_PLAZA);
    }
}
