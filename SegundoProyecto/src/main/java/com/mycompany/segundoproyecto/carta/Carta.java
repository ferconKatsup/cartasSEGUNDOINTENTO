/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundoproyecto.carta;

import java.io.Serializable;

/**
 *
 * @author fer
 */
public abstract class Carta implements ICarta, Serializable{
    protected String nombre;
    protected String tipo;
    protected int puntosVida;
    protected int costoRetirada;
    protected Carta siguienteCarta;

    // Constructor
    public Carta(String nombre, String tipo, int puntosVida, int costoRetirada) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.puntosVida = puntosVida;
        this.costoRetirada = costoRetirada;
    }

    // Getters y setters
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int getPuntosVida() {
        return puntosVida;
    }

    @Override
    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    @Override
    public int getCostoRetirada() {
        return costoRetirada;
    }

    @Override
    public void setCostoRetirada(int costoRetirada) {
        this.costoRetirada = costoRetirada;
    }
}
