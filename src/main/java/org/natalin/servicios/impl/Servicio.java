package org.natalin.servicios.impl;

import org.natalin.entidades.Cuenta;
import org.natalin.entidades.Sucursal;

import java.util.HashMap;
import java.util.Map;

public class Servicio {

    SucursalServicio sucursalServicio = new SucursalServicio();
    CuentaServicio cuentaServicio = new CuentaServicio();
    private HashMap<Integer, Sucursal> mapaSucursales = new HashMap<>();


    public void crearSucursal(){

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
        System.out.println("Transfiriendo dinero de la " + cuenta1.getNumeroDeCuenta() + " a la cuenta " + cuenta2.getNumeroDeCuenta());
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


    }


}
