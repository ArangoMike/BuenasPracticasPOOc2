package com.mycompany.buenaspracticaspooc2;

import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        PlayList playlist = new PlayList();
        Scanner in = new Scanner(System.in);
        int op;
        boolean fin = true;

        while (fin == true) {
            System.out.println("---------BIBLIOTECA EL TECHARAN--------------");
            System.out.println("---------------------------------------------");
            System.out.println("--- 1.Biblioteca principal ------------------");
            System.out.println("--- 2.Crear playlist personalizada ----------");
            System.out.println("--- 3.Playlist personalizada ----------------");
            System.out.println("--- 4.Filtrar biblioteca por género ---------");
            System.out.println("--- 5.Filtrar biblioteca por año ------------");
            System.out.println("--- 6.Ordenar biblioteca por duración -------");
            System.out.println("--- 7.Ordenar biblioteca por fecha ----------");
            System.out.println("--- 8.Salir de biblioteca -------------------");
            System.out.println("---------------------------------------------");
            System.out.println("----------ELIJA EL NUMERO DESEADO------------");
            op = in.nextInt();

            switch (op) {
                case 1:
                    biblioteca.imprimirLista();
                    break;
                case 2:
                    playlist.nuevaPlayList();
                    break;
                case 3:
                    playlist.imprimirPlayList();
                    break;
                case 4:
                    biblioteca.filtroGeneros();
                    break;
                case 5:
                    System.out.println("¿Qué año desea filtrar?");
                    op = in.nextInt();
                    biblioteca.imprimirListaAño(op);
                    break;
                case 6:
                    Collections.sort(biblioteca.getCanciones());
                    biblioteca.imprimirLista();
                    break;
                case 7:
                    Collections.sort(biblioteca.getCanciones(), new CompararFecha());
                    biblioteca.imprimirLista();
                    break;
                case 8:
                    fin = false;
                    System.out.println("¡VUELVE PRONTO!");
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
