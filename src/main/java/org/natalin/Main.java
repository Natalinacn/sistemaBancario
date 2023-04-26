package org.natalin;

import org.natalin.servicios.impl.CuentaServicio;
import org.natalin.servicios.impl.MenuServicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        MenuServicio servicio = new MenuServicio();


        servicio.menu();

    }

}
