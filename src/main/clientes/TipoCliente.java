/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.clientes;

import main.util.Intervalo;

/**
 *
 * @author jrmd
 */
public enum TipoCliente {
    VIP, SOCIO, NORMAL, NADA;

    public static final TipoCliente tipoSegunIndice(int indice) {

        assert new Intervalo(1, 3).incluye(indice);

        switch (indice) {
            case 1:
                return VIP;
            case 2:
                return SOCIO;
            case 3:
                return NORMAL;
        }

        return NADA;
    }

    @Override
    public String toString() {
        switch (this) {
            case VIP:
                return "Vip";

            case SOCIO:
                return "Socio";
            case NORMAL:
                return "normal";

        }

        return null;
    }
}
