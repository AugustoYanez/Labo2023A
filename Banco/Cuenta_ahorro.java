package Banco;

import Personas.Cliente;

public class Cuenta_ahorro extends Cuenta_bancaria {

    Cuenta_bancaria cuentaPert;

    public Cuenta_ahorro() {
        cuentaPert = new Cuenta_bancaria();
    }

    public Cuenta_ahorro(Cuenta_bancaria cuentaPert) {
        this.cuentaPert = cuentaPert;
    }

    public Cuenta_bancaria getCuentaPert() {
        return cuentaPert;
    }

    public void setCuentaPert(Cuenta_bancaria cuentaPert) {
        this.cuentaPert = cuentaPert;
    }
}
