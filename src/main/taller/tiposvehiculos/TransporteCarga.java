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
public abstract class TransporteCarga extends Vehiculo{
    
    private double pma;

    private static final int INCREMENTO_PRECIO_MENOS_10_CILINDROS = 3;
    private static final int INCREMENTO_PRECIO_MAS_10_CILINDROS = 4;
    
    public TransporteCarga(double pma, String matricula, String modelo, int potencia, int cilindros) {
        super(matricula, modelo, potencia, cilindros);
        this.pma = pma;
    }
    
    public TransporteCarga(double pma, String matricula, String modelo, int cilindros) {
        super(matricula, modelo, cilindros);
        this.pma = pma;
    }

    @Override
    public double calcularPrecio() {
        double precio = super.calcularPrecio(); 
        
        if (this.cilindros < 10) {
            precio += INCREMENTO_PRECIO_MENOS_10_CILINDROS * pma;
        }
        else {
            precio += INCREMENTO_PRECIO_MAS_10_CILINDROS * pma; 
        }
        
        return precio;
    }
    
    
    
}
