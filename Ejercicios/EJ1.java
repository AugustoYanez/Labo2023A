package Ejercicios;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EJ1 {
    public static void main(String[] args) {

        ArrayList<Integer> Numeros = new ArrayList<Integer>();

        Numeros.add(4);
        Numeros.add(4);
        Numeros.add(4);
        Numeros.add(4);
        Numeros.add(4);
        Numeros.add(4);
        Numeros.add(4);
        Numeros.add(4);
        Numeros.add(4);
        Numeros.add(4);
        Numeros.add(4);
        Numeros.add(4);
        Numeros.add(4);
        Numeros.add(4);
        Numeros.add(4);
        Numeros.add(4);

        int suma = 0;



        for ( int i = 0; i < Numeros.size(); i++){

            suma = suma + Numeros.get(i);


        }

        System.out.println(suma);



    }

}
