package com.company.model;

import com.company.controller.Cliente;
import com.company.controller.Ejecutivo;

public class Caja {
    private int cantidad;

    public void retirar(Cliente cliente, Ejecutivo ejecutivo,  int cantidad){
        System.out.println("Cliente: " + cliente + "atendido por ejecutivo: " + ejecutivo + "desea retirar: " + cantidad);
    }


}
