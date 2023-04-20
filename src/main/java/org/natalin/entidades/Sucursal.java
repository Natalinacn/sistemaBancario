package org.natalin.entidades;

public class Sucursal {

    private Integer numeroSucursal;
    private String localidad;
    private String telefono;
    private String pais;

    public Sucursal() {
    }

    public Sucursal(Integer numeroSucursal, String localidad, String telefono, String pais) {
        this.numeroSucursal = numeroSucursal;
        this.localidad = localidad;
        this.telefono = telefono;
        this.pais = pais;
    }

    public Integer getNumeroSucursal() {
        return numeroSucursal;
    }

    public void setNumeroSucursal(Integer numeroSucursal) {
        this.numeroSucursal = numeroSucursal;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "numeroSucursal=" + numeroSucursal +
                ", localidad='" + localidad + '\'' +
                ", telefono='" + telefono + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
