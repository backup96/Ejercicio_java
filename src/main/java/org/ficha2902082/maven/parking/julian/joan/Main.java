package org.ficha2902082.maven.parking.julian.joan;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.time.*;
import org.ficha2902082.maven.parking.julian.joan.entities.TipoDocumento;
import org.ficha2902082.maven.parking.julian.joan.entities.TipoVehiculo;
import org.ficha2902082.maven.parking.julian.joan.entities.Carro;
import org.ficha2902082.maven.parking.julian.joan.entities.Cliente;
import org.ficha2902082.maven.parking.julian.joan.entities.Cupo;
import org.ficha2902082.maven.parking.julian.joan.entities.Registro;

public class Main {
    public static void main(String[] args) {
        Cupo cupito1 = new Cupo('A',1.3,2.3);
        Cupo cupito2 = new Cupo();
        cupito2.letra = 'B';
        cupito2.ancho = 1.3;
        cupito2.largo = 2.3;
        Carro carrito1 = new Carro("MSN-119",TipoVehiculo.CARRO);
        Carro carrito2 = new Carro("BRR-556",TipoVehiculo.ECOLINE);
        Carro carrito3 = new Carro("ABC-123",TipoVehiculo.MOTO);
        Cliente clientecito1 = new Cliente("Shaggy", "Rogerts", TipoDocumento.CC ,1019763603L, 3142142104L);
        Cliente clientecito2 = new Cliente(" :]", ":l", TipoDocumento.TI ,123456789L, 3101010101L);
        clientecito1.addCar(carrito1);
        clientecito2.addCar(carrito3);
        clientecito2.addCar("BRR-556",TipoVehiculo.ECOLINE);

        List<Registro> misregiRegistros = new ArrayList<>();
        Registro r1 = new Registro(
            LocalDate.of(2024, Month.FEBRUARY, 22), 
            LocalTime.of(4, 38, 1), 
            LocalDate.of(2024, Month.FEBRUARY, 23), 
            LocalTime.of(4, 40, 1), 
            43200.00, 
            clientecito1.misCarros.get(0),
            clientecito1,
            cupito1);
            Registro r2 = new Registro(
                LocalDate.of(2024, Month.FEBRUARY, 22), 
                LocalTime.of(8, 30, 0), 
                LocalDate.of(2024, Month.FEBRUARY, 22), 
                LocalTime.of(10, 30, 0), 
                3600.00, 
                clientecito2.misCarros.get(0),
                clientecito2, 
                cupito2);
        misregiRegistros.add(r1);
        misregiRegistros.add(r2);

        //recorrer la lista de registros
        for( Registro r: misregiRegistros ){
            System.out.println( "Placa: " + r.carro.placa + "|" + "Cliente:" + r.cliente.nombre + "|" + "letra:" + r.cupo.letra + "|" + r.valor + "|" + "Fecha Inicio: " + r.fechaInicio.toString() + "|");

        } 

    }

}
