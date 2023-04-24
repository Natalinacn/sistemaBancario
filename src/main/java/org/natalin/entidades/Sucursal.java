package org.natalin.entidades;

import java.util.HashMap;
import java.util.Map;

public class Sucursal {

    private Integer numeroSucursal;
    private String direccion;
    private String telefono;
    //private Map<Integer, Sucursal> mapaSucursales;

    public Sucursal() {
    }

    public Sucursal(Integer numeroSucursal, String direccion, String telefono) {
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.telefono = telefono;

    }

    public Integer getNumeroSucursal() {
        return numeroSucursal;
    }

    public void setNumeroSucursal(Integer numeroSucursal) {
        this.numeroSucursal = numeroSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    @Override
    public String toString() {
        return "Sucursal{" +
                "numeroSucursal=" + numeroSucursal +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
