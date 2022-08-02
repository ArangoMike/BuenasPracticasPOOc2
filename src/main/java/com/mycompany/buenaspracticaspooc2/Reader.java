package com.mycompany.buenaspracticaspooc2;

import java.util.Scanner;

public class Reader { //Clase de leer, mejorada para no depender de throws.
    public Scanner sc = new Scanner(System.in);//Es public para que sea visible en toda la clase.
    
    //Constructor
    public Reader() {
        //
    }
    /**
     * @param question
     * @return
     */
    public String readString(String question) {//Método para leer un string.
        System.out.println(question);
        return sc.nextLine();
    }

    /**
     * @param question
     * @return
     */
    public int readInt(String question) {//Método para leer un int.
        System.out.println(question);
        return sc.nextInt();
    }

    /**
     * @param question
     * @return
     */
    public double readDouble(String question) {//Método para leer un double.
        System.out.println(question);
        return sc.nextDouble();
    }

    /**
     * @param question
     * @return
     */
    public float readFloat(String question) {//Método para leer un float.
        System.out.println(question);
        return sc.nextFloat();
    }

    /**
     * @param question
     * @return
     */
    public long readLong(String question) {//Método para leer un long.
        System.out.println(question);
        return sc.nextLong();
    }

    /**
     * @param question
     * @return
     */
    public boolean readBoolean(String question) {//Método para leer un boolean.
        System.out.println(question);
        return sc.nextBoolean();
    }

    /**
     * @param question
     * @return
     */
    public char readChar(String question) {//Método para leer un char.
        System.out.println(question);
        return sc.next().charAt(0);
    }

    /**
     * @param question
     * @return
     */
    public byte readByte(String question) {//Método para leer un byte.
        System.out.println(question);
        return sc.nextByte();
    }

    /**
     * @param question
     * @return
     */
    public short readShort(String question) {//Método para leer un short.
        System.out.println(question);
        return sc.nextShort();
    }
}
