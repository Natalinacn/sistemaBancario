package org.natalin.servicios;

import org.natalin.entidades.Cuenta;

public interface ICuentaServicio {

    Cuenta crearCuenta();
    Double saldoDisponible(Cuenta cuenta);

    void depositar(Double monto, Cuenta cuenta);

    public void retirar(Double monto, Cuenta cuenta);

    void trasferir(Cuenta cuentaOrigen, Cuenta cuentaDestino, Double monto);

}
