package Banco;

import Personas.Cliente;

import java.util.ArrayList;

public class Cuenta_corriente extends Cuenta_bancaria{

Cuenta_bancaria cuentaPerteneciente;
   public ArrayList<Cheque> cheques;

    public Cuenta_corriente() {
        cuentaPerteneciente = new Cuenta_bancaria();
        cheques = new ArrayList<Cheque>();
    }

    public Cuenta_corriente(Cuenta_bancaria cuentaPerteneciente, ArrayList<Cheque> cheques) {
        this.cuentaPerteneciente = cuentaPerteneciente;
       this.cheques = cheques;
    }

    public Cuenta_bancaria getCuentaPerteneciente() {
        return cuentaPerteneciente;
    }

    public void setCuentaPerteneciente(Cuenta_bancaria cuentaPerteneciente) {
        this.cuentaPerteneciente = cuentaPerteneciente;
    }

    public ArrayList<Cheque> getCheques() {
        return cheques;
    }

    public void setCheques(ArrayList<Cheque> cheques) {
        this.cheques = cheques;
    }
}
