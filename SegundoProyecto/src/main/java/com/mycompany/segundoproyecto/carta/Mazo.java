/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundoproyecto.carta;

/**
 *
 * @author fer
 */
public class Mazo {
    private int numeroCartas;

    private Carta primeraCarta;

    //Carta 1 Monstruo 10 agregarCarta(carta, primeraCarta)
    //Carta 2 Monstruo 20 agregarCarta(carta, primeraCarta)
    //Carta 3 Monstruo 30 agregarCarta(carta, primeraCarta)

    public Carta obtenerPrimeraCarta(){
        Carta primera = primeraCarta;
        primeraCarta=primeraCarta.siguienteCarta;
        return primera;
    }

    public void agregarCarta(Carta cartaAGuardar, Carta referenciaCarta){
        if (referenciaCarta == null){
            referenciaCarta=cartaAGuardar;
        }else{
            agregarCarta(cartaAGuardar,referenciaCarta.siguienteCarta);
        }

    }
}
