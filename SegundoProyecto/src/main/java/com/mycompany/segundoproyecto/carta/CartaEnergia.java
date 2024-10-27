/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundoproyecto.carta;

/**
 *
 * @author fer
 */
public class CartaEnergia extends Carta {
    private int energia;

    // Constructor
    public CartaEnergia(String nombre, String tipo, int puntosVida, int costoRetirada, int energia) {
        super(nombre, tipo, puntosVida, costoRetirada);
        this.energia = energia;
    }

    // Getters y setters
    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
}
