package com.mycompany.buenaspracticaspooc2;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cancion implements Comparable<Cancion> {

    //Título, identificador, fecha, duración, genero, caratula y una descripción corta.
    private String title;
    private int id;
    private LocalDate date;
    private LocalTime duration;
    private Genres genre;
    private String cover;
    private String info;

    // Constructor de la clase cancion con parametros.
    public Cancion(String title, int id, LocalDate date, LocalTime duration, Genres genre, String cover, String info) {
        this.title = title;
        this.id = id;
        this.date = date;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this.info = info;
    }

    //Constructor de la clase canción solo con parametro id.
    public Cancion(int id) {
        this.id = id;
    }

    //Getters y setters para todos los atributos.
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public Genres getGenre() {
        return genre;
    }

    public void setGenre(Genres genre) {
        this.genre = genre;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    // Método compareTo para comparar el atributo duración de la clase canción.
    @Override
    public int compareTo(Cancion o) {
        return o.getDuration().compareTo(duration);
    }

    // Método ToString de la clase Cancion. 
    @Override
    public String toString() {
        return "Título: " + title + "\nID: " + id + "\nFecha: " + date + "\nDuración: " + duration + "\nGénero: " + genre + "\nCarátula: " + cover + "\nDescripción: " + info;
    }
}
