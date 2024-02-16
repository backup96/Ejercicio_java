package org.ficha2902082.maven.parking.julian.joan;

import org.ficha2902082.maven.parking.julian.joan.entities.Carro;
import org.ficha2902082.maven.parking.julian.joan.entities.Cliente;
import org.ficha2902082.maven.parking.julian.joan.entities.TipoVehiculo;
import org.ficha2902082.maven.parking.julian.joan.entities.TipoDocumento;

public class Main {
    public static void main(String[] args) {
        Carro Lamaquinadelmisterio = new Carro();
        Lamaquinadelmisterio.placa = "BRR-548";
        Lamaquinadelmisterio.tipoVehiculo = TipoVehiculo.ECOLINE;

        Carro carrito2 = new Carro();
        carrito2.placa = "MSN-119";
        carrito2.tipoVehiculo = TipoVehiculo.TAXI;

        Cliente clientecito = new Cliente();
        clientecito.nombre= "Shaggy";
        clientecito.apellido= "Rogerts";
        clientecito.tipoDocumento= TipoDocumento.CC;
        clientecito.numeroDocumento= 106567286L;
        clientecito.celular= 3206545794L;

        Cliente clientecito2 = new Cliente();
        clientecito2.nombre= "John";
        clientecito2.apellido= "Frusciante";
        clientecito2.tipoDocumento= TipoDocumento.CC;
        clientecito2.numeroDocumento= 106567286L;
        clientecito2.celular= 3206545794L;
        //clientecito.addCar(Lamaquinadelmisterio);
        //clientecito.addCar(carrito2);
        clientecito.addCar("BRR-548",TipoVehiculo.ECOLINE);

        clientecito2.addCar("MSN-119",TipoVehiculo.TAXI);

        System.out.println("-----------------------");
        
        System.out.println("Cliente:" + clientecito.nombre + " " +  clientecito.apellido);
        System.out.println("documento:" + clientecito.numeroDocumento);
        System.out.println("Vehiculos:");
        for(Carro c : clientecito.misCarros){
            System.out.println("Placa:" + c.placa);
            System.out.println("Tipo de vehiculo:" + c.tipoVehiculo);
        }

        System.out.println("-----------------------");

        System.out.println("Cliente:" + clientecito2.nombre + " " +  clientecito2.apellido);
        System.out.println("documento:" + clientecito2.numeroDocumento);
        System.out.println("Vehiculos:");
        for(Carro c : clientecito2.misCarros){
            System.out.println("Placa:" + c.placa);
            System.out.println("Tipo de vehiculo:" + c.tipoVehiculo);
        }

        System.out.println("-----------------------");
    }

}
