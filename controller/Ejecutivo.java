package com.company.controller;

public class Ejecutivo extends Persona {

    private String idEjecutivo;
    private String caja;

    public Ejecutivo(String nombre, String apellido, int edad, String idEjecutivo, String caja){
        super(nombre, apellido, edad);
    }

    public String getIdEjecutivo(){
        return idEjecutivo;
    }

    public String getCaja() {
        return caja;
    }
}
