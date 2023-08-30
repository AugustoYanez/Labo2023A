package Banco;

import Personas.Cliente;

public class Cheque {
    Cliente emitidor;

    Cliente recibidor;

    int monto;


    public Cheque(Cliente emitidor, Cliente recibidor, int monto) {
        this.emitidor = emitidor;
        this.recibidor = recibidor;
        this.monto = monto;
    }

    public Cliente getEmitidor() {
        return emitidor;
    }

    public void setEmitidor(Cliente emitidor) {
        this.emitidor = emitidor;
    }

    public Cliente getRecibidor() {
        return recibidor;
    }

    public void setRecibidor(Cliente recibidor) {
        this.recibidor = recibidor;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
}
