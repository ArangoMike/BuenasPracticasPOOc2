package com.mycompany.buenaspracticaspooc2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    //Creación protected Arraylist de objeto Canción.
    protected ArrayList<Cancion> canciones = new ArrayList<>();
    // Variable para enumerar las playlist por filtros.
    int n = 0;
    // Variable usada para capturar datos ingresados por usuario.
    int op;
    Scanner in = new Scanner(System.in);

    //Constructor sin parametros
    public Biblioteca() {
        //
        ListaCanciones();
    }

    // Método privado donde se crean las canciones de la biblioteca principal.
    private void ListaCanciones() {

        Cancion song1 = new Cancion(1001);
        song1.setTitle("Traicionera");
        song1.setDate(LocalDate.of(2018, 5, 20));
        song1.setDuration(LocalTime.of(0, 3, 49));
        song1.setGenre(Genres.POP);
        song1.setCover("Traicionera.png");
        song1.setInfo("Canción compuesta por Sebastian Yatra relatando un amor no correspondido\n"
                + " por medio de mentiras y traicion.");
        canciones.add(song1);

        Cancion song2 = new Cancion(1002);
        song2.setTitle("Todo de tí");
        song2.setDate(LocalDate.of(2021, 7, 14));
        song2.setDuration(LocalTime.of(0, 3, 32));
        song2.setGenre(Genres.POP);
        song2.setCover("TodoDeTí.png");
        song2.setInfo("Todo de ti es una canción escrita por Eric Pérez Rovira, José M. Collazo,\n"
                + "Luis J, Rafael E. Pabón Navedo y Raul Alejandro Ocasio en el que se retrata\n"
                + "una nueva forma de hablar de seducción y atracción sexual entre dos personas.\n");
        canciones.add(song2);

        Cancion song3 = new Cancion(1003);
        song3.setTitle("Fly me to the moon");
        song3.setDate(LocalDate.of(1954, 2, 17));
        song3.setDuration(LocalTime.of(0, 3, 49));
        song3.setGenre(Genres.JAZZ);
        song3.setCover("FlymeToTheMoon.png");
        song3.setInfo("«Fly me to the Moon» (lit. Llévame volando a la Luna) es una canción escrita\n"
                + "en 1954 por Bart Howard. Cantada por primera vez por Felicia Sanders en cabarets,\n"
                + "fue titulada originalmente -In Other Words- (lit. En otras palabras). \n");
        canciones.add(song3);

        Cancion song4 = new Cancion(1004);
        song4.setTitle("Conteo Regresivo");
        song4.setDate(LocalDate.of(2003, 8, 04));
        song4.setDuration(LocalTime.of(0, 4, 26));
        song4.setGenre(Genres.SALSA);
        song4.setCover("ConteoRegresivo.png");
        song4.setInfo("“Conteo Regresivo” nos habla de una trágica historia de amor donde sobresalen más\n"
                + " los inconvenientes que los buenos momentos. Conforme pasan los versos el oyente conocerá\n"
                + " los motivos por los que no funcionó la relación\n");
        canciones.add(song4);

        Cancion song5 = new Cancion(1005);
        song5.setTitle("Idilio");
        song5.setDate(LocalDate.of(1993, 02, 7));
        song5.setDuration(LocalTime.of(0, 5, 8));
        song5.setGenre(Genres.SALSA);
        song5.setCover("Idilio.png");
        song5.setInfo("'Idilio' fue escrita en Nueva York a finales de la década de 1930 por el compositor y\n"
                + "guitarrista puertorriqueño Alberto 'Tití' Amadeo. La historia está basada en una anécdota\n"
                + "personal ocurrida al autor en un pueblo de Puerto Rico que por poco termina en un hecho de sangre.\n");
        canciones.add(song5);

        Cancion song6 = new Cancion(1006);
        song6.setTitle("Millones");
        song6.setDate(LocalDate.of(2021, 04, 13));
        song6.setDuration(LocalTime.of(0, 3, 41));
        song6.setGenre(Genres.POP);
        song6.setCover("Millones.png");
        song6.setInfo("cancion escrita y producida por Camilo y Edgar Barrera en la cual se desborda en palabras de amor\n"
                + "dando a entender que se gano la loteria con la mujer que tiene al lado haciendo enfasis en que hay \n"
                + "muchas opciones pero lo eligio a el\n");
        canciones.add(song6);

        Cancion song7 = new Cancion(1007);
        song7.setTitle("Red  Lights");
        song7.setDate(LocalDate.of(2014, 9, 27));
        song7.setDuration(LocalTime.of(0, 4, 22));
        song7.setGenre(Genres.ELECTRONIC);
        song7.setCover("RedLights.png");
        song7.setInfo("«Red Lights» es una canción realizada por el DJ y productor neerlandés Tiësto. Cuenta con la colaboración,\n"
                + "aunque sin acreditar, del cantante y compositor sueco Michel Zitron, quién co-escribió la canción junto a\n"
                + "Wayne Hector, Carl Falk, Rami Yacoub, Måns Wredenberg y el mismo Tiësto\n");
        canciones.add(song7);

        Cancion song8 = new Cancion(1008);
        song8.setTitle("Titanium");
        song8.setDate(LocalDate.of(2011, 1, 24));
        song8.setDuration(LocalTime.of(0, 4, 5));
        song8.setGenre(Genres.ELECTRONIC);
        song8.setCover("titanium.png");
        song8.setInfo("«Titanium» —en español: «Titanio»— es una canción realizada por el disc-jockey y productor discográfico\n"
                + "francés David Guetta, con la colaboración de la cantante australiana Sia; incluida en el quinto álbum de estudio\n"
                + "de Guetta, Nothing but the Beat y el primero de los tres sencillos promocionales del álbum\n");
        canciones.add(song8);

        Cancion song9 = new Cancion(1009);
        song9.setTitle("So What");
        song9.setDate(LocalDate.of(1959, 8, 17));
        song9.setDuration(LocalTime.of(0, 9, 22));
        song9.setGenre(Genres.JAZZ);
        song9.setCover("SoWhat.png");
        song9.setInfo("\" So What \" es la primera pista del álbum de 1959 Kind of Blue del trompetista estadounidense Miles Davis.\n"
                + "Es uno de los ejemplos más conocidos de jazz modal , ambientado en el modo Dorian y compuesto por 16 compases de \n"
                + "D Dorian, seguidos de ocho compases de E ♭ Dorian y otros ocho de D Dorian.\n");
        canciones.add(song9);

        Cancion song10 = new Cancion(1010);
        song10.setTitle("Vida de rico");
        song10.setDate(LocalDate.of(2021, 5, 14));
        song10.setDuration(LocalTime.of(0, 3, 4));
        song10.setGenre(Genres.POP);
        song10.setCover("VidadeRico.png");
        song10.setInfo("«Esta canción me describe y lo que estoy viviendo, que, aunque la estoy cantando hoy, también está siendo cantada\n"
                + "por ese niño de 10 años que se sentaba en el balcón de su casa con sus papás a imaginar la casa, el carro y el futuro\n"
                + "de sus sueños\n");
        canciones.add(song10);

    }

    // Metodo para Imprimir todos los objetos contenidos en el arrayList.
    public void imprimirLista() {

        // Ciclo for para recorrer el ArrayList
        for (int i = 0; i < canciones.size(); i++) {

            // Imprimimos en patantalla el contenido de los objetos usando el toString.
            System.out.println((i + 1) + ". ");
            System.out.println(canciones.get(i).toString());
        }
    }

    // Método para imprimir en pantalla las canciones por género musical especificado.
    public void imprimirListaGeneros(Genres genero) {

        // Ciclo for para recorrer el ArrayList
        for (int i = 0; i < canciones.size(); i++) {

            // Imprimimos en patantalla el contenido de los objetos usando el toString.
            if (canciones.get(i).getGenre() == genero) {
                n = n + 1;
                System.out.println((n) + ". ");
                System.out.println(canciones.get(i).toString());
            }
        }
        n = 0;
    }

    // Metodo para filtrar tipo de genero que se quiera mostrar en pantalla.
    public void filtroGeneros() {
        System.out.println("¿Qué genero deseas filtrar?");
        System.out.println("1.ELECTRONIC");
        System.out.println("2.POP");
        System.out.println("3.SALSA");
        System.out.println("4.JAZZ");
        System.out.println("ELIJA EL NUMERO DESEADO");
        op = in.nextInt();
        switch (op) {
            case 1:
                imprimirListaGeneros(Genres.ELECTRONIC);
                break;
            case 2:
                imprimirListaGeneros(Genres.POP);
                break;
            case 3:
                imprimirListaGeneros(Genres.SALSA);
                break;
            case 4:
                imprimirListaGeneros(Genres.JAZZ);
                break;

            default:
                throw new AssertionError();
        }
    }

    // Metodo para filtrar e imprimir en pantalla por Año.
    public void imprimirListaAño(int año) {

        // Ciclo for para recorrer el ArrayList
        for (int i = 0; i < canciones.size(); i++) {

            // Imprimimos en patantalla el contenido de los objetos usando el toString.
            if (canciones.get(i).getDate().getYear() == año) {
                n = n + 1;
                System.out.println((n) + ". ");
                System.out.println(canciones.get(i).toString());
            }
        }
        if (n == 0) {
            System.out.println("No hay canciones con este año en la biblioteca.");
            System.out.println("");
        }
        n = 0;
    }

    //Getter del Arraylist canciones, devuelve todo el arraylist.
    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

}
