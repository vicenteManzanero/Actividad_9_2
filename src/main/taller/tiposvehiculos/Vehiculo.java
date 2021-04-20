/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.tiposvehiculos;

import java.util.regex.Pattern;

/**
 *
 * @author jrmd
 */
public abstract class Vehiculo {

    private String matricula;
    private String modelo;
    protected int potencia;
    protected int cilindros;
    
    public static final double PRECIO_BASE = 15;
    public static final String PATRON_MATRICULA = "\\d{4}[A-Z]{3}";

    public Vehiculo(String matricula, String modelo, int potencia, int cilindros) {
        assert Pattern.matches(PATRON_MATRICULA, matricula);

        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
        this.cilindros = cilindros;
    }
    
    public Vehiculo(String matricula, String modelo, int cilindros) {
        assert Pattern.matches(PATRON_MATRICULA, matricula);

        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = 0;
        this.cilindros = cilindros;
    }
   
    public boolean tieneEsta(String matricula) {
        assert matricula != null;
        return this.matricula.equals(matricula);
    }   
    
    @Override
    public String toString() {
        return "Matricula:" + matricula + " Modelo:" + modelo;
    }
    
    protected double precioBase() {
        return PRECIO_BASE * cilindros;
    }
    
    public double calcularPrecio() {
        return precioBase();
    }
    
    public String getMatricula(){
        return this.matricula;
    }
}
