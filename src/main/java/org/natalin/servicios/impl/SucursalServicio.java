package org.natalin.servicios.impl;

import org.natalin.entidades.Sucursal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SucursalServicio {

    Scanner read = new Scanner(System.in);
    List<Sucursal> sucursales = new ArrayList<>();

    public List<Sucursal> crearSucursal() {

        System.out.println("Desea crear una nueva sucursal? S/N");
        String opcion = read.nextLine();
        while (opcion.equalsIgnoreCase("S")) {
            Sucursal sucursal = new Sucursal();

            sucursal.setNumeroSucursal((int) (Math.random() * 100) + 1);
            System.out.println("Ingrese la dirección de la sucursal");
            sucursal.setDireccion(read.nextLine());
            System.out.println("Ingrese el teléfono de la sucursal");
            sucursal.setTelefono(read.nextLine());

            sucursales.add(sucursal);

            System.out.println("Desea agreggar una nueva sucursal? S/N");
            opcion = read.nextLine();
        }

        return sucursales;
    }

    public void mostrarSucursales() {

        for (Sucursal aux : sucursales) {

            System.out.println(aux);

        }

    }

}
