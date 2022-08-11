
package com.mycompany.buenaspracticaspooc2;

import java.time.LocalDate;
import java.time.LocalTime;


public class Cancion {
        //titulo, identificador, fecha, duración, genero, caratula y una descripción corta.
        private String title;
        private int id;
        private LocalDate date;
        private LocalTime duration;
        private Genres genre;
        private String cover;
        private String info;
    
        public Cancion(String title, int id, LocalDate date, LocalTime duration, Genres genre, String cover, String info) {
            this.title = title;
            this.id = id;
            this.date = date;
            this.duration = duration;
            this.genre = genre;
            this.cover = cover;
            this.info = info;
        }
    
        //Create a public constructor with only id
        public Cancion(int id) {
            this.id = id;
        }
    
        //Getters and setters for all the attributes
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
    
    // Create a method to print a song
    public void printSong() {
        System.out.println("Titulo: " + title);
        System.out.println("ID: " + id);
        System.out.println("Fecha: " + date);
        System.out.println("Duración: " + duration);
        System.out.println("Género: " + genre);
        System.out.println("Carátula: " + cover);
        System.out.println("Descripción: " + info);
    }
}
