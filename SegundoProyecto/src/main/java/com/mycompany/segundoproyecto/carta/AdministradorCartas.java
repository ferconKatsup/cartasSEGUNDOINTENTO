/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundoproyecto.carta;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author fer
 */
public class AdministradorCartas {
    
    public static void guardarCarta(Carta carta) throws IOException {
        try (FileOutputStream fos = new FileOutputStream("cartas/"+carta.nombre+".bin"); 
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(carta);
        }
    }
    
    public static Carta recuperarCarta(File cartaArchivo) throws IOException, ClassNotFoundException {
        Carta carta;
        try (FileInputStream fis = new FileInputStream(cartaArchivo); 
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            carta = (Carta) ois.readObject();
        }
        return carta;
    }
    
    public static Carta[] obtenerCartas() throws IOException, ClassNotFoundException {
        File folder = new File("cartas");
        AdministradorCartas.crearFolderSiNoExiste(folder);
        File[] listaDeArchivos = folder.listFiles();
        if(listaDeArchivos != null) {
            Carta[] listaDeCartas = new Carta[listaDeArchivos.length];
            for (int i = 0; i < listaDeArchivos.length; i++) {
                listaDeCartas[i] = AdministradorCartas.recuperarCarta(listaDeArchivos[i]);
            }
            return listaDeCartas;
        }
        return new Carta[0];
    }
    
    public static void crearCartas(Carta[] cartas) throws IOException {
        File folder = new File("cartas");
        AdministradorCartas.crearFolderSiNoExiste(folder);
        for (Carta carta : cartas) {
            AdministradorCartas.guardarCarta(carta);
        }
    }
    
    private static void crearFolderSiNoExiste(File folder) {
        if(!folder.exists()) {
            folder.mkdirs();
        }
    }
    
}