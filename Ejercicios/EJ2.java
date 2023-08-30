package Ejercicios;

import java.util.ArrayList;

public class EJ2{
 public static void main(String[] args) {



 ArrayList<String> cadenas = new ArrayList<String>();



        cadenas.add("Hola");
        cadenas.add("Like");
        cadenas.add("A");
        cadenas.add("Capo");
        cadenas.add("Video");



 for ( int i = 0; i < cadenas.size();i++){
            if ( cadenas.get(i).charAt(0) == 'L' ){ //* letra especifica *//
 System.out.println(cadenas.get(i));
            }
 }



 }
}