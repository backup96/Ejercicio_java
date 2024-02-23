package org.ficha2902082.maven.parking.julian.joan.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Registro {

    public LocalDate fechaInicio;
    public LocalTime horaInicio;
    public LocalDate fechaFin;
    public LocalTime horaFin;
    public Double valor;
    
    //Atributo de relacion

    public Carro carro;
    public Cliente cliente;
    public Cupo cupo;
    
    public Registro(LocalDate fechaInicio, LocalTime horaInicio, LocalDate fechaFin, LocalTime horaFin, Double valor,
            Carro carro, Cliente cliente, Cupo cupo) {
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
        this.fechaFin = fechaFin;
        this.horaFin = horaFin;
        this.valor = valor;
        this.carro = carro;
        this.cliente = cliente;
        this.cupo = cupo;

    }      

    
}
