package org.natalin.servicios.impl;

import org.natalin.entidades.Sucursal;

import java.util.*;

public class SucursalServicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    List<Sucursal> sucursales = new ArrayList<>();
    Map<Integer, Sucursal> mapaSucursales = new HashMap<>();

    //ESTE MÉTODO SERIA AGREGAR SUCURSAL NUEVA A LA LISTA
/*    public List<Sucursal> crearSucursal() {

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

            System.out.println("Desea agregar una nueva sucursal? S/N");
            opcion = read.nextLine();
        }

        return sucursales;
    }*/


    public void crearSucusal() {

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

            System.out.println("Desea agregar una nueva sucursal? S/N");
            opcion = read.nextLine();
        }


    }



    //CREAR SUCURSAL
    public void agregarSucursalesAlMap(){

        //agregarSucusalesALista();

        Integer nuevaClave = mapaSucursales.size() + 1;

        for (Sucursal sucursal : sucursales) {
            mapaSucursales.put(nuevaClave, sucursal);
            nuevaClave++;
        }

        System.out.println("Las sucursales se ha agregado correctamente");

    }

/*
  public void mostrarSucursalesDesdeLista() {

        for (Sucursal aux : sucursales) {
            System.out.println(aux);
        }

    }*/


    //Ahora que cambié el método tengo que cambiar el modo de mostrar las sucursales. Me conviene mostrar
    //recorriendo el hashmap que ya tiene las claves y después usar esas claves para que el usuario use de
    //opción en el switch

    public void mostrarSucursalesConClave(){

        System.out.println("Listado de sucursales");

        for(Map.Entry<Integer, Sucursal> entry : mapaSucursales.entrySet()){

            System.out.println(entry.getKey() + " " + entry.getValue());

        }
    }



}
