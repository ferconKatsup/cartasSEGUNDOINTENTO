/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundoproyecto;

import com.mycompany.segundoproyecto.jugador.Cpu;
import com.mycompany.segundoproyecto.jugador.JugadorHumano;

/**
 *
 * @author fer
 */
public class Juego {
   
    private JugadorHumano jugadorHumano;
    private Cpu cpu;

    public Juego(JugadorHumano jugadorHumano, Cpu cpu) {
        this.jugadorHumano = jugadorHumano;
        this.cpu = cpu;
    }

    public JugadorHumano getJugadorHumano() {
        return jugadorHumano;
    }

    public Cpu getCpu() {
        return cpu;
    }
    
    
    
}
