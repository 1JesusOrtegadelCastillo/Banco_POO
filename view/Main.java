package com.company.view;

import com.company.controller.Cliente;
import com.company.controller.Ejecutivo;
import com.company.model.Caja;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Jesus", "Ortega", 28, "4152313587964078");
        Ejecutivo ejecutivo = new Ejecutivo("Pedro", "Martinez",35,"BMX020558", "A1");
        Caja caja = new Caja();

        caja.retirar(cliente, ejecutivo, 10500);



    }
}
