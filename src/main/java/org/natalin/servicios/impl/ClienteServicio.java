package org.natalin.servicios.impl;

import org.natalin.entidades.Cliente;
import org.natalin.entidades.Cuenta;

import java.util.Scanner;



public class ClienteServicio {


    Scanner read = new Scanner(System.in);
    SucursalServicio sucursalServicio = new SucursalServicio();

    public Cliente crearCliente() {

        Cliente cliente = new Cliente();

        System.out.println("Ingrese su nombre");
        cliente.setNombre(read.nextLine());

        System.out.println("Ingrese su apellido");
        cliente.setApellido(read.nextLine());

        System.out.println("Ingrese su número de documento");
        cliente.setDocumento(read.nextLine());

        sucursalServicio.mostrarSucursalesConClave();

        System.out.println("Qué sucursal desea elegir?");
        String opcion = read.nextLine();

/*        if(opcion)
        switch (opcion){

            case"":

                break;




        }*/


        return cliente;

    }


}
