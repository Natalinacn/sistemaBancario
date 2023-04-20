package org.natalin;

import org.natalin.entidades.Cuenta;
import org.natalin.servicios.impl.CuentaServicio;

public class Main {
    public static void main(String[] args) {

        CuentaServicio cuentaServicio = new CuentaServicio();

        Cuenta cuenta1 = cuentaServicio.crearCuenta();
        Cuenta cuenta2 = cuentaServicio.crearCuenta();


        cuentaServicio.depositar(1000.0, cuenta1);
        cuentaServicio.trasferir(cuenta1, cuenta2, 500.0);

































/*
        CuentaServicio objCuentaServ1 = new CuentaServicio();
        CuentaServicio objCuentaServ2 = new CuentaServicio();


        Cuenta cuentaNaty = new Cuenta();
        Cuenta cuentaAriel = new Cuenta();

        objCuentaServ1.depositar(1000.0, cuentaNaty);

        System.out.println(objCuentaServ1.saldoDisponible(cuentaNaty));
        System.out.println(objCuentaServ2.saldoDisponible(cuentaAriel));

        objCuentaServ1.trasferir(cuentaNaty, cuentaAriel, 500.0);


        System.out.println(objCuentaServ1.saldoDisponible(cuentaNaty));
        System.out.println(objCuentaServ2.saldoDisponible(cuentaAriel));



*/


    }

}