/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.clientes;

import java.util.Arrays;

/**
 *
 * @author ciclost
 */
public class ListaClientes {

    protected Cliente[] clientes;

    public ListaClientes() {

        clientes = new Cliente[0];
    }

    public void mete(Cliente cli) {
        clientes = Arrays.copyOf(clientes, clientes.length + 1);
        clientes[clientes.length - 1] = cli;
    }

    public boolean vacia() {
        return this.clientes.length == 0;
    }
    //tengo que conseguir que pasandole el codigo
    //me devuelva el cliente para poder hacerlo
    //socio aunque no se si se hace aqui o en creartajetasocio
    public boolean contieneMatricula(int codigo){
        for (int i = 0; i < clientes.length; i++) {
            if(clientes[i].tieneEsta(codigo)){
                return true;
            }
        }
        
        return false;
    }

}
