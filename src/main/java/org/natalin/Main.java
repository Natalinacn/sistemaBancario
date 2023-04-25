package org.natalin;

import org.natalin.entidades.Cuenta;
import org.natalin.entidades.Sucursal;
import org.natalin.servicios.impl.CuentaServicio;
import org.natalin.servicios.impl.Servicio;
import org.natalin.servicios.impl.SucursalServicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Servicio servicio = new Servicio();
        CuentaServicio cuentaServicio = new CuentaServicio();

        servicio.crearSucursal();
        //sucursalServicio.mostrarSucursalesConClave();



    }

}


/*
        System.out.println("¡Bienvenido al banco!");

        System.out.println("Marque 1 si desea crear una cuenta?");
        System.out.println("Marque 2 si desea hacer una depositar dinero");
        System.out.println("Marque 3 si desea hacer una transferencia");
        System.out.println("Marque 4 di desea retirar dinero de su cuenta");

        int opcion = read.nextInt();

        switch (opcion){

            case 1:
                System.out.println("Ha seleccionado crear una cuenta");
                Cuenta cuenta1 = cuentaServicio.crearCuenta();
                break;
            case 2:
                System.out.println("Ha seleccionado hacer un depósito");
                cuentaServicio.depositar(1000, cuenta1);
                break;
            case 3:
                System.out.println("Ha seleccionado hacer una transferencia");
                cuentaServicio.trasferir();
                break;
            case 4:
                System.out.println("Ha seleccionado retirar dinero de su cuenta");
                cuentaServicio.retirar();
                break;
            default:
                System.out.println("Opción inválida");
                break;



        }
*/
