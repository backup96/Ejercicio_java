package org.ficha2902082.maven.parking.julian.joan.entities;

public class Cupo {

    public char letra;
    public Double largo;
    public Double ancho;
//contructor
//Es un metodo especial de una entidad que se ejecuta automaticamente cuando se crea un objeto
//      |
//      |
//      |
//      V
    public Cupo() {
    }

    public Cupo(char letra, Double largo, Double ancho) {
        this.letra = letra;
        this.largo = largo;
        this.ancho = ancho;
    }
    
}
