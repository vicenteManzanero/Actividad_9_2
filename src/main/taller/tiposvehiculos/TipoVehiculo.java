/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.tiposvehiculos;

import main.util.Intervalo;

/**
 *
 * @author jrmd
 */
public enum TipoVehiculo {
    COCHE, FURGONETA, MICROBUS, CAMION, NADA;
    
    public static final TipoVehiculo tipoSegunIndice(int indice) {
        
        assert new Intervalo(1,4).incluye(indice);
        
        switch(indice) {
            case 1:
                return COCHE;
            case 3:
                return FURGONETA;
            case 2:
                return MICROBUS;
            case 4:
                return CAMION;
        }
        
        return NADA;
    }
    
    @Override
    public String toString() {
        switch(this) {
            case COCHE:
                return "Coche";
                
            case FURGONETA:
                return "Furgoneta";
                
            case MICROBUS:
                return "Microbús";
                
            case CAMION:
                return "Camión";
        }
        
        return null;
    }
}
