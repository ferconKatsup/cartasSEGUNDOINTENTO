/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundoproyecto.carta;

/**
 *
 * @author fer
 */
public class CartaHechizo extends Carta {
    private String efecto;

    // Constructor
    public CartaHechizo(String nombre, String tipo, int puntosVida, int costoRetirada, String efecto) {
        super(nombre, tipo, puntosVida, costoRetirada);
        this.efecto = efecto;
    }

    // Getters y setters
    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }
}
