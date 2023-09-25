import SistemaIntercambio.*;


import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class main{
    public static void main(String[] args){

        Revista r1 = new Revista(1,"hola",2006,LocalDate.of(2006,01,01));
        Pantalon p1 = new Pantalon(Color.AZUL, Material.ALGODON,"zara",false,5,5,5);
        HashSet<Prestable> hashetPrest = new HashSet<>();
        Sistema sistema = new Sistema(hashetPrest);
        sistema.addElemento(r1); // si se presta la revista
        sistema.addElemento(p1); // no se presta el pantalon por tenes manchas o roturas
    }}