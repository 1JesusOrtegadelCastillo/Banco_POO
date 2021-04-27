package com.company.controller;

public class Cliente extends Persona {
    private String numeroCuenta;

    public Cliente (String nombre, String apellido, int edad, String numeroCuenta){
        super(nombre, apellido, edad);
    }

    public String getNumeroCuenta(){
        return numeroCuenta;
    }

}
