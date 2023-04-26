package org.natalin.servicios.impl;

import org.natalin.entidades.Cuenta;
import org.natalin.entidades.Sucursal;

import java.util.HashMap;
import java.util.Scanner;

public class MenuServicio {

    SucursalServicio sucursalServicio = new SucursalServicio();
    CuentaServicio cuentaServicio = new CuentaServicio();
    private HashMap<Integer, Sucursal> mapaSucursales = new HashMap<>();
    Scanner read = new Scanner(System.in).useDelimiter("\n");


    public void menu() {

        sucursalServicio.crearSucursal(mapaSucursales);




        System.out.println("---------------------");
        System.out.println("Creando primer cuenta");
        System.out.println("---------------------");
        Cuenta cuenta1 = cuentaServicio.crearCuenta(mapaSucursales);
        System.out.println("---------------------");
        System.out.println("Creando segunda cuenta");
        System.out.println("---------------------");
        Cuenta cuenta2 = cuentaServicio.crearCuenta(mapaSucursales);


        String respuesta;
        do{
        System.out.println("¿Qué operación desea realizar?");
        System.out.println("1 - Depositar dinero");
        System.out.println("2 - Transferir dinero");
        System.out.println("3 - Retirar dinero");
        System.out.println("4 - Consultar saldo");

        int opcion = read.nextInt();


        switch (opcion) {


            case 1:
                System.out.println("¿Cuánto dinero desea depositar?");
                Double monto = read.nextDouble();
                cuentaServicio.depositar(monto, cuenta1);
                cuentaServicio.saldoDisponible(cuenta1);
                break;
            case 2:
                System.out.println("---------------------");
                System.out.println("¿Cuánto dinero desea transferir?");
                monto = read.nextDouble();
                System.out.println("Transfiriendo el monto de " + monto + " pesos desde la cuenta número " + cuenta1.getNumeroDeCuenta() +
                        " \na la cuenta número " + cuenta2.getNumeroDeCuenta());
                System.out.println("---------------------");
                cuentaServicio.trasferir(cuenta1, cuenta2, monto);
                cuentaServicio.saldoDisponible(cuenta1);
                cuentaServicio.saldoDisponible(cuenta2);

                break;
            case 3:
                System.out.println("¿Cuánto dinero desea retirar?");
                monto = read.nextDouble();
                System.out.println("---------------------");
                System.out.println("Retirando dinero de la cuenta ");
                System.out.println("---------------------");
                cuentaServicio.retirar(monto, cuenta1);
            case 4:
                System.out.println("Mostrando saldo disponible de las cuentas");
                System.out.println("---------------------");
                cuentaServicio.saldoDisponible(cuenta1);
                cuentaServicio.saldoDisponible(cuenta2);
                break;

            default:
                System.out.println("Usted ingresó una opción inexistente");

        }

            System.out.println("¿Desea realizar otra operación? S/N");
            respuesta = read.next();


        }while(respuesta.equalsIgnoreCase("S"));

    }






      /*  public void crearSucursal() {

        sucursalServicio.crearSucursal(mapaSucursales);


        System.out.println("---------------------");
        System.out.println("Creando primer cuenta");
        System.out.println("---------------------");
        Cuenta cuenta1 = cuentaServicio.crearCuenta(mapaSucursales);
        System.out.println("---------------------");
        System.out.println("Creando segunda cuenta");
        System.out.println("---------------------");
        Cuenta cuenta2 = cuentaServicio.crearCuenta(mapaSucursales);


        System.out.println("---------------------");
        System.out.println("Depositando saldo en las cuentas");
        System.out.println("---------------------");
        cuentaServicio.depositar(1000.0, cuenta1);
        cuentaServicio.saldoDisponible(cuenta1);
        cuentaServicio.depositar(20000.0, cuenta2);
        cuentaServicio.saldoDisponible(cuenta2);

        System.out.println("---------------------");
        System.out.println("Transfiriendo dinero de la " + cuenta1.getNumeroDeCuenta() +
                " \na la cuenta " + cuenta2.getNumeroDeCuenta());
        System.out.println("---------------------");
        cuentaServicio.trasferir(cuenta1, cuenta2, 500.0);

        System.out.println("---------------------");
        System.out.println("Mostrando saldo disponible de las cuentas");
        System.out.println("---------------------");
        cuentaServicio.saldoDisponible(cuenta1);
        cuentaServicio.saldoDisponible(cuenta2);

        System.out.println("---------------------");
        System.out.println("Retirando dinero de la cuenta ");
        System.out.println("---------------------");
        cuentaServicio.retirar(2500.0, cuenta2);

        System.out.println("---------------------");
        System.out.println("Mostrando saldo disponible de las cuentas");
        System.out.println("---------------------");
        cuentaServicio.saldoDisponible(cuenta1);
        cuentaServicio.saldoDisponible(cuenta2);


    }*/



}
