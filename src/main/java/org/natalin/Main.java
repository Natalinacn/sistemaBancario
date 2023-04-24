package org.natalin;

import org.natalin.entidades.Cuenta;
import org.natalin.entidades.Sucursal;
import org.natalin.servicios.impl.CuentaServicio;
import org.natalin.servicios.impl.SucursalServicio;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //SucursalServicio sucursalServicio = new SucursalServicio();
        CuentaServicio cuentaServicio = new CuentaServicio();


        //sucursalServicio.crearSucursal();



        System.out.println("Creando primer cuenta");
        Cuenta cuenta1 = cuentaServicio.crearCuenta();
        System.out.println("Creando segunda cuenta");
        Cuenta cuenta2 = cuentaServicio.crearCuenta();


        cuentaServicio.depositar(1000.0, cuenta1);
        cuentaServicio.saldoDisponible(cuenta1);
        cuentaServicio.depositar(20000.0, cuenta2);
        cuentaServicio.saldoDisponible(cuenta2);


        cuentaServicio.trasferir(cuenta1, cuenta2, 500.0);
        cuentaServicio.saldoDisponible(cuenta1);
        cuentaServicio.saldoDisponible(cuenta2);

        cuentaServicio.retirar(2500.0, cuenta2);
        cuentaServicio.saldoDisponible(cuenta1);
        cuentaServicio.saldoDisponible(cuenta2);


    }

}