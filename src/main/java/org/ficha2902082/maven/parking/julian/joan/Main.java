package org.ficha2902082.maven.parking.julian.joan;

import org.ficha2902082.maven.parking.julian.joan.entities.TipoDocumento;
import org.ficha2902082.maven.parking.julian.joan.entities.TipoVehiculo;
import org.ficha2902082.maven.parking.julian.joan.entities.Carro;
import org.ficha2902082.maven.parking.julian.joan.entities.Cliente;
import org.ficha2902082.maven.parking.julian.joan.entities.Cupo;
import org.ficha2902082.maven.parking.julian.joan.entities.Empleado;
import org.ficha2902082.maven.parking.julian.joan.entities.Registro;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;

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
        Cliente clientecito2 = new Cliente(" Simon", "Perez", TipoDocumento.TI ,123456789L, 3101010101L);
        clientecito1.addCar(carrito1);
        clientecito2.addCar(carrito3);
        clientecito2.addCar("BRR-556",TipoVehiculo.ECOLINE);

        Empleado empleado1 = new Empleado("Julian", 12457896L);
        Empleado empleado2 = new Empleado("Joan", 69875421L);
        Empleado empleado3 = new Empleado("Cristiansito", 56121995L);

        List<Registro> misregiRegistros = new ArrayList<>();
            Registro r1 = new Registro(
                    LocalDate.of(2024, Month.FEBRUARY, 22), 
                    LocalTime.of(4, 38, 1), 
                    LocalDate.of(2026, Month.AUGUST, 11), 
                    LocalTime.of(6, 35, 0), 
                    43200.00, 
                    clientecito1.misCarros.get(0),
                    clientecito1,
                    cupito1,
                    empleado1
            );

            LocalDate fi1 = LocalDate.of(2023, Month.DECEMBER, 24);
            LocalTime hi1 = LocalTime.of(11, 32, 0);
            LocalDate ff1 = LocalDate.of(2022, Month.OCTOBER, 10);
            LocalTime hf1 = LocalTime.of(8,50, 0);
            Double valorR2 = 50000.00;

            Registro r2 = new Registro (fi1, hi1, ff1, hf1, valorR2, clientecito2.misCarros.get(0), clientecito2, cupito2, empleado2);


            LocalDate fi2 = LocalDate.of(2016, Month.SEPTEMBER, 30);
            LocalTime hi2 = LocalTime.of(6, 15, 0);
            LocalDate ff2 = LocalDate.of(2017, Month.MARCH, 29);
            LocalTime hf2 = LocalTime.of(5,55, 0);
            Double valorR3 = 80000.00;

            Registro r3 = new Registro (ff2, hi2, fi2, hf2, valorR3, carrito2, clientecito2, cupito2, empleado3);

            LocalDate fi3 = LocalDate.of(2012, Month.FEBRUARY, 1);
            LocalTime hi3 = LocalTime.of(12, 15, 0);
            LocalDate ff3 = LocalDate.of(2012, Month.JULY, 11);
            LocalTime hf3 = LocalTime.of(9,59, 0);
            Double valorR4 = 38000.00;

            Registro r4 = new Registro (ff3, hi3, fi3, hf3, valorR4, carrito3, clientecito1, cupito1, empleado1);

            LocalDate fi4 = LocalDate.of(2010, Month.SEPTEMBER, 30);
            LocalTime hi4 = LocalTime.of(6, 15, 0);
            LocalDate ff4 = LocalDate.of(2018, Month.MARCH, 29);
            LocalTime hf4 = LocalTime.of(5,55, 0);
            Double valorR5 = 66000.00;

            Registro r5 = new Registro (ff4, hi4, fi4, hf4, valorR5, carrito1, clientecito2, cupito2, empleado2);

            
            
        misregiRegistros.add(r1);
        misregiRegistros.add(r2);
        misregiRegistros.add(r3);
        misregiRegistros.add(r4);
        misregiRegistros.add(r5);

        //recorrer la lista de registros
        for( Registro r: misregiRegistros ){
            System.out.println( "Placa: " + r.carro.placa + "|" + 
                                "Cliente:" + r.cliente.nombre + " " + r.cliente.apellido + "|" + 
                                "letra:" + r.cupo.letra + "|" +
                                "Valor: " + r.valor + "|" +
                                "Fecha Llgada: " + r.fechaInicio.toString() + "|" +
                                "Fecha Salida: " + r.fechaFin.toString() + "|" +
                                "Hora Llegada: " + r.horaInicio.toString() + "|" +
                                "Hora Salida: " + r.horaFin.toString() + "|" +
                                "Empleado: " + r.empleado.nombre + " " + r.empleado.codigo + "|");

        } 

    }

}
