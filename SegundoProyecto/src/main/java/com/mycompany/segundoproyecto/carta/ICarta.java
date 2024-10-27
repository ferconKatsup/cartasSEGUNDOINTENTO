/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.segundoproyecto.carta;

/**
 *
 * @author fer
 */
public interface ICarta {
    String getNombre();
    void setNombre(String nombre);

    String getTipo();
    void setTipo(String tipo);

    int getPuntosVida();
    void setPuntosVida(int puntosVida);

    int getCostoRetirada();
    void setCostoRetirada(int costoRetirada);
}
