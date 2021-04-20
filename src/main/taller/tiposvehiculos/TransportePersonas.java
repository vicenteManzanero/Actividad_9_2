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
public abstract class TransportePersonas extends Vehiculo{
    
    private static final int INCREMENTO_POR_POTENCIA = 10;
    
    protected int numPlazas;
    
    private double precioPorPlaza;

    public TransportePersonas(int numPlazas, String matricula, String modelo, int potencia, int cilindros, double precioPorPlaza) {
        super(matricula, modelo, potencia, cilindros);
        this.numPlazas = numPlazas;
        this.precioPorPlaza = precioPorPlaza;
    }
    
    public TransportePersonas(int numPlazas, String matricula, String modelo, int cilindros) {
        super(matricula, modelo, cilindros);
        this.numPlazas = numPlazas;
    }

    @Override
    public double calcularPrecio() {
        
        double precio = super.calcularPrecio();
        
        if (this.numPlazas > 3) {
            precio += (this.numPlazas - 3) * precioPorPlaza;
        }
        
        if (this.potencia > 1200) {
            precio += INCREMENTO_POR_POTENCIA;
        }
        
        return precio;
    }
    
    
}
