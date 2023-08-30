package Banco;

import Personas.Cliente;

public class Cuenta_bancaria {

    Cliente titular;

    int cbu;

     int numeroCuenta;

    String alias;

    int saldo;

    public Cuenta_bancaria(){

        titular = new Cliente();
        cbu = 239230;
        numeroCuenta = 1;
        alias = "sol";
        saldo = 100;

    }
    public Cuenta_bancaria(Cliente titular, int cbu, int numeroCuenta, String alias, int saldo) {
        this.titular = titular;
        this.cbu = cbu;
        this.numeroCuenta = numeroCuenta;
        this.alias = alias;
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getCbu() {
        return cbu;
    }

    public void setCbu(int cbu) {
        this.cbu = cbu;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }




}
