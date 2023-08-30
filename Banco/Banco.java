package Banco;

import Personas.Cliente;


import java.util.ArrayList;

public class Banco {

ArrayList<Cuenta_bancaria> cuentas;
ArrayList<Cliente> clientes;

public Banco (){
    cuentas = new ArrayList<Cuenta_bancaria>();
    clientes = new ArrayList<Cliente>();
}
    public Banco(ArrayList<Cuenta_bancaria> cuentas, ArrayList<Cliente> clientes) {
        this.cuentas = cuentas;
        this.clientes = clientes;
    }

    public ArrayList<Cuenta_bancaria> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta_bancaria> Cuentas) {
        this.cuentas = Cuentas;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void devolverCbu (Cliente cliente1 ){
       Cliente cvuCliente = new Cliente();
    for (Cuenta_bancaria i : cuentas){
        if (  i.getTitular().getCuil() == cliente1.getCuil() ){
            cvuCliente = i.getTitular();
        }
    }
        System.out.println("El cliente con cuil: " + cliente1.getCuil() + "Su cbu es: " + cvuCliente);

    }


    public void devolverTitular( Cuenta_bancaria cuenta1){
Cliente titular = new Cliente();
        for (Cuenta_bancaria i : cuentas){
           if ( i.getNumeroCuenta() == cuenta1.getNumeroCuenta()){
               titular = i.getTitular();
           }
        }

        System.out.println(" El nombre y apellido del titular con numero de cuenta " + cuenta1.getNumeroCuenta() + "es : " + titular.getNombre() + titular.apellido);

    }

    public Cliente masJoven(){

 Cliente masjoven = cuentas.get(0).titular;
        for ( int j = 1; j < cuentas.size(); j++ ){
        for (Cuenta_bancaria i : cuentas){
           Cliente actual = cuentas.get(j).titular;
            if ( actual.getEdad() < masjoven.getEdad() ){
              masjoven = actual;
            }
        }
        }
        return masjoven;
    }






    
}
