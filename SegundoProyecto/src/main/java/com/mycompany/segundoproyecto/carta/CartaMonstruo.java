/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundoproyecto.carta;

/**
 *
 * @author fer
 */
public class CartaMonstruo extends Carta {
    private String habilidad;
    private int danoAtaque;

    // Constructor
    public CartaMonstruo(String nombre, String tipo, int puntosVida, int costoRetirada, String habilidad, int danoAtaque) {
        super(nombre, tipo, puntosVida, costoRetirada);
        this.habilidad = habilidad;
        this.danoAtaque = danoAtaque;
    }

    // Getters y setters
    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public int getDanoAtaque() {
        return danoAtaque;
    }

    public void setDanoAtaque(int danoAtaque) {
        this.danoAtaque = danoAtaque;
    }
}

