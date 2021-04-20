/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.opciones;

import java.util.regex.Pattern;
import main.taller.tiposvehiculos.Camion;
import main.taller.tiposvehiculos.Coche;
import main.taller.Taller;
import main.taller.tiposvehiculos.Furgoneta;
import main.taller.tiposvehiculos.Microbus;
import main.taller.tiposvehiculos.TipoVehiculo;
import main.taller.tiposvehiculos.Vehiculo;
import main.util.GestorIO;
import main.util.Intervalo;

/**
 *
 * @author jrmd
 */
public class RegistroNuevoVehiculo extends OpcionTaller {

    
    public RegistroNuevoVehiculo(Taller taller) {
        super("Dar de alta coche y pasar a la cola", taller);
    }

    @Override
    public void ejecutar() {
        GestorIO gestorIO = new GestorIO();
        Vehiculo vehiculo = this.recogerNuevoVehiculo();
        if(taller.getColaInicial().contieneMatricula(vehiculo.getMatricula())){
            gestorIO.out("No se ha podido añadir el vehículo. Ya existe esa matrícula en la cola.");
        }
        else{
            taller.getColaInicial().mete(vehiculo);
            gestorIO.out("Vehículo añadido a la cola");
        }  
    }

    private Vehiculo recogerNuevoVehiculo() {
        
        TipoVehiculo tipo = getTipoVehiculo();
        
        switch (tipo) {
            case COCHE:
               return new Coche(getNumPlazas(2,7), getMatricula(), getModelo(), getPotencia(200, 3000), getCilindros(2,6)); 
            
            case MICROBUS:
               return new Microbus(getNumPlazas(2,20), getMatricula(), getModelo(), getCilindros(2,6)); 
               
            case FURGONETA:
               return new Furgoneta(getPMA(1,10), getMatricula(), getModelo(), getCilindros(4,10));
               
            case CAMION:
               return new Camion(getPMA(1, 20), getMatricula(), getModelo(), getPotencia(1000, 4000), getCilindros(8,16));
            
        }
        return null;
    }
    
    
    private double getPMA(int min, int max) {
        return getValorDouble("PMA", min, max);
    }
    
    private int getNumPlazas(int min, int max) {
        return getValorInt("Número de plazas", min, max);
    }
    
    private int getCilindros(int min, int max) {
        return getValorInt("Cilindros", min, max);
    }
    private int getPotencia(int min, int max) {
        return getValorInt("Potencia", min, max);
    }
    
    private TipoVehiculo getTipoVehiculo() {
        GestorIO gestorIO = new GestorIO();
        boolean error;
        int opcion;

        do {
            gestorIO.out("¿Tipo de vehículo? [1:Coche, 2:Microbús, 3: Furgoneta, 4:Camión]:");
            opcion = gestorIO.inInt();
            error = !new Intervalo(1, 4).incluye(opcion);
            if (error) {
                gestorIO.out("Error!!! Debe ser un tipo válido");
            }
        } while (error);
        return TipoVehiculo.tipoSegunIndice(opcion);
    }

    private String getMatricula() {
        GestorIO gestorIO = new GestorIO();
        String matricula;
        boolean error;
        do {
            gestorIO.out("¿Mátricula? [DDDDLLL]:");
            matricula = gestorIO.inString();
            error = !Pattern.matches(Vehiculo.PATRON_MATRICULA, matricula);
            if (error) {
                gestorIO.out("Error!!! Debe ser una matrícula válida");
            }
        } while (error);
        return matricula;
    }

    private String getModelo() {
        GestorIO gestorIO = new GestorIO();
        gestorIO.out("¿Modelo?:");
        return gestorIO.inString();
    }

}
