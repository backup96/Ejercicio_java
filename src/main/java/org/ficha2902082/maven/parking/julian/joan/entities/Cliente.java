package org.ficha2902082.maven.parking.julian.joan.entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    public String nombre;
    public String apellido;
    public TipoDocumento tipoDocumento;
    public Long numeroDocumento;
    public Long celular;
    public List <Carro> misCarros = new ArrayList<Carro>();

    public Cliente(String nombre, String apellido, TipoDocumento tipoDocumento, Long numeroDocumento, Long celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.celular = celular;
    }

    public void addCar(Carro c){
        this.misCarros.add(c);
    } 

    public void addCar( String placa, TipoVehiculo tv ){
        Carro c = new Carro();
        c.placa = placa;
        c.tipoVehiculo = tv; 
        this.misCarros.add(c);
    } 
}
