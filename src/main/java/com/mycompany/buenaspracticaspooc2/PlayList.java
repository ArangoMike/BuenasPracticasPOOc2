package com.mycompany.buenaspracticaspooc2;

// Imports
import java.util.ArrayList;
import java.util.Scanner;

public class PlayList extends Biblioteca {

    // Creación de ArrayList de canciones para la playlist presonalizada.
    protected ArrayList<Cancion> playList = new ArrayList<>();
    // variable donde se alojara las opciones elejidas por el usuario
    int op;
    // variable usada para llenar el playlist personalizado.
    int desicion = 1;
    // Creación del objeto Scanner
    Scanner in = new Scanner(System.in);

    //Constructor publico sin parametros
    public PlayList() {
        //
    }

    // Creación de metodo para crear el playlist personalizado.
    public void nuevaPlayList() {
        if (desicion == 1) {
            while (desicion == 1) {
                System.out.println("¿Que canción quieres agregar al nuevo Playlist?");
                System.out.println("Indicame su ID");
                op = in.nextInt();

                for (int i = 0; i < canciones.size(); i++) {

                    if (op == canciones.get(i).getId()) {
                        playList.add(canciones.get(i));
                    }
                }

                System.out.println("registro exitoso!");
                System.out.println("¿seguir agregando canciones al nuevo Playlist?");
                System.out.println("Responda 1 para si o 2 para no.");
                desicion = in.nextInt();
            }
        } else {
            System.out.println("Playlist ya creada, eliminala para crear una nueva.");
        }
    }

    // Metodo para Imprimir todos los objetos contenidos en el arrayList.
    public void imprimirPlayList() {

        // Ciclo for para recorrer el ArrayList
        for (int i = 0; i < playList.size(); i++) {

            // Imprimimos en patantalla el contenido de los objetos usando el toString.
            System.out.println((i + 1) + ". ");
            System.out.println(playList.get(i).toString());
        }
    }

    public ArrayList<Cancion> getPlayList() {
        return playList;
    }
}
