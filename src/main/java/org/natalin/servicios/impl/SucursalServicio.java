package org.natalin.servicios.impl;

import org.natalin.entidades.Cuenta;
import org.natalin.entidades.Sucursal;

import java.util.*;

public class SucursalServicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    Sucursal sucursal = new Sucursal();
    List<Sucursal> sucursales = new ArrayList<>();
    private Map<Integer, Sucursal> mapaSucursales = new HashMap<>();


    Cuenta objcuenta = new Cuenta();

    public void crearSucursal() {

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

        agregarSucursalesAlMap();

    }


    //CREAR SUCURSAL
   public void agregarSucursalesAlMap() {

        Integer nuevaClave = mapaSucursales.size() + 1;

        for (Sucursal sucursal : sucursales) {
            mapaSucursales.put(nuevaClave, sucursal);
            nuevaClave++;
        }
        //sucursal.setMapaSucursales(mapaSucursales);
        System.out.println("Las sucursales se ha agregado correctamente");

    }

    //Ahora que cambié el método tengo que cambiar el modo de mostrar las sucursales. Me conviene mostrar
    //recorriendo el hashmap que ya tiene las claves y después usar esas claves para que el usuario use de
    //opción en el switch

    public void mostrarSucursalesConClave() {

        System.out.println("Listado de sucursales");

        for (Map.Entry<Integer, Sucursal> entry : mapaSucursales.entrySet()) {

            System.out.println(entry.getKey() + " " + entry.getValue());

        }
    }


    public void elegirSucursal() {

        System.out.println("Qué sucursal desea elegir? Ingrese el número correspondiente");
        mostrarSucursalesConClave();
        Integer opcion = read.nextInt();
        read.nextLine();

        switch (opcion) {

            case 1:
                System.out.println("Usted eligió la sucursal 1");
                objcuenta.setSucursal(sucursales.get(0));
                break;
            case 2:
                System.out.println("Usted eligió la sucursal 2");
                objcuenta.setSucursal(sucursales.get(1));
                break;
            case 3:
                System.out.println("Usted eligió la sucursal 3");
                objcuenta.setSucursal(sucursales.get(2));
                break;

            default:
                System.out.println("Usted ingresó una sucursal inexistente");

        }


    }



}
