package org.natalin.entidades;

public class Cuenta {

    private Double saldo;
    private Integer numeroDeCuenta;
    private Sucursal sucursal;
    private Cliente cliente = new Cliente();
    private boolean esCuentaCorriente;
    private boolean esCajaDeAhorros;

    public Cuenta() {
    }

    public Cuenta(Double saldo, Integer numeroDeCuenta, Sucursal sucursal, Cliente cliente,
                  boolean esCuentaCorriente, boolean esCajaDeAhorros) {
        this.saldo = saldo;
        this.numeroDeCuenta = numeroDeCuenta;
        this.sucursal = sucursal;
        this.cliente = cliente;
        this.esCuentaCorriente = esCuentaCorriente;
        this.esCajaDeAhorros = esCajaDeAhorros;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Integer getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(Integer numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isEsCuentaCorriente() {
        return esCuentaCorriente;
    }

    public void setEsCuentaCorriente(boolean esCuentaCorriente) {
        this.esCuentaCorriente = esCuentaCorriente;
    }

    public boolean isEsCajaDeAhorros() {
        return esCajaDeAhorros;
    }

    public void setEsCajaDeAhorros(boolean esCajaDeAhorros) {
        this.esCajaDeAhorros = esCajaDeAhorros;
    }

    @Override
    public String toString() {
        return "Cuenta{"+
                " numeroDeCuenta=" + numeroDeCuenta +
                ", sucursal=" + sucursal +
                ", cliente=" + cliente +
                ", esCuentaCorriente=" + esCuentaCorriente +
                ", esCajaDeAhorros=" + esCajaDeAhorros +
                '}';
    }
}