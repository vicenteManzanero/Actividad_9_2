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
public class Camion extends TransporteCarga {
    
    private static final double PCTJE_PRECIO_BASE = 0.2;
    private static final int FIJO = 40;
    private static final int ADICIONAL_EXCESO_POTENCIA = 20;
    
    public Camion(double pma, String matricula, String modelo, int potencia, int cilindros) {
        super(pma, matricula, modelo, potencia, cilindros);
    }

    @Override
    public double calcularPrecio() {
        double precio = super.calcularPrecio();
        
        precio += FIJO + this.precioBase() * PCTJE_PRECIO_BASE;
        
        if (this.potencia > 2000) {
            precio += ADICIONAL_EXCESO_POTENCIA;
        }
        
        return precio;
    }
    
}
