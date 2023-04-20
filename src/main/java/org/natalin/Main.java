package org.natalin;

import org.natalin.entidades.Cuenta;
import org.natalin.servicios.impl.CuentaServicio;
import org.natalin.servicios.impl.SucursalServicio;

public class Main {
    public static void main(String[] args) {

        SucursalServicio sucursalServicio = new SucursalServicio();


        CuentaServicio cuentaServicio = new CuentaServicio();

        sucursalServicio.crearSucursal();
        sucursalServicio.mostrarSucursales();

/*
        Cuenta cuenta1 = cuentaServicio.crearCuenta();
        Cuenta cuenta2 = cuentaServicio.crearCuenta();


        cuentaServicio.depositar(1000.0, cuenta1);
        cuentaServicio.trasferir(cuenta1, cuenta2, 500.0);
*/




    }

}