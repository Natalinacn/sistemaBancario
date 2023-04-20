package org.natalin.servicios.impl;

import org.natalin.entidades.Cuenta;
import org.natalin.servicios.ICuentaServicio;

import java.util.Scanner;

public class CuentaServicio implements ICuentaServicio {

    Scanner read = new Scanner(System.in);
    ClienteServicio clienteServicio = new ClienteServicio();

    public Cuenta crearCuenta(){

        Cuenta cuenta = new Cuenta();
        cuenta.setSaldo(0.00);
        cuenta.setNumeroDeCuenta((int) (Math.random()*1000+1));
        cuenta.setCliente(clienteServicio.crearCliente());

        System.out.println("Si desea crear una cuenta corriente marque 1");
        System.out.println("Si desea crear una caja de ahorro marque 2");
        String opcion = read.nextLine();

        switch (opcion){

            case "1":
                System.out.println("Usted ha creado una CUENTA CORRIENTE");
                cuenta.setEsCuentaCorriente(true);
                break;
            case "2":
                System.out.println("Usted a creado una CAJA DE AHORRO");
                cuenta.setEsCajaDeAhorros(true);
        }

        System.out.println(cuenta);

        return cuenta;
    }


    @Override
    public Double saldoDisponible(Cuenta cuenta) {
        System.out.println("El saldo de la cuenta es: " + cuenta.getSaldo());
        return cuenta.getSaldo();

    }

    @Override
    public void depositar(Double monto, Cuenta cuenta) {

        Double saldoTotal = cuenta.getSaldo() + monto;
        cuenta.setSaldo(saldoTotal);

    }

    @Override
    public void retirar(Double monto, Cuenta cuenta) {
        if (cuenta.getSaldo() >= monto) {
            cuenta.setSaldo(cuenta.getSaldo() - monto);
            System.out.println("Usted retiró " + monto + " con éxito");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void trasferir(Cuenta cuentaOrigen, Cuenta cuentaDestino, Double monto) {
        if (monto <= cuentaOrigen.getSaldo()) {
            cuentaOrigen.setSaldo(cuentaOrigen.getSaldo() - monto);
            cuentaDestino.setSaldo(cuentaDestino.getSaldo() + monto);
            System.out.println("Usted trasfirió desde la cuenta " + cuentaOrigen + "el monto " + monto + " pesos con éxito" + " a la cuenta " + cuentaDestino);
        } else {
            System.out.println("Saldo insuficiente");
        }

    }


}

