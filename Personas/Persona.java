package Personas;

import  Fecha.Fecha;
import Objetos.Plato;
import Sistemas.SistemasPesarseAltura.Medida;

import java.util.HashMap;


public abstract class   Persona {

    public  String nombre;
    public  String apellido;

    public int dni;
    public   String direccion;
    public  Fecha nacimiento;
    public  int edad;
    HashMap<Fecha, Medida> registro = new HashMap<Fecha, Medida>();



    public HashMap<Fecha, Medida> getRegistro() {
        return registro;
    }

    public void setRegistro(HashMap<Fecha, Medida> registro) {
        this.registro = registro;
    }

    public Persona(){
        this.nombre = " Persona 1";
        this.direccion = " Argentina ";
        this.edad = 30;
        this.registro = new HashMap<Fecha, Medida>();
    }

    public Persona(String nombre, String direccion, int edad, HashMap<Fecha, Medida> registro, int kcalsconsumidas ){
        this.nombre = " Persona 1";
        this.direccion = " Argentina ";
        this.edad = 30;
        this.registro = new HashMap<Fecha, Medida>();
    }

   // constructor para paso
    public Persona(String nombre, String apellido, int dni, Fecha nacimienton){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
    }


    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Persona(String nombre, String direccion, int edad){
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
    }

    public Persona (String nombre, Fecha nacimiento){



    }
    public String getNombre(){

        return nombre;

    }
    public Fecha getNacimiento() {
        return nacimiento;
    }

    public String getDireccion(){

        return direccion;

    }
    public int getEdad(){

        return edad;

    } public String getApellido() {
        return apellido;
    }



    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setNacimiento(Fecha nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String mostrarDatos(){
        String Datos = "Nombre: " + nombre +" Direccion: "+ direccion + " Edad: "+ edad;
        return Datos;
    }

    public void agregarMedidas(Fecha fechamedidas, int peso, int altura){
        Medida medidas1 = new Medida(peso,altura);
        registro.put(fechamedidas, medidas1);
    }

    public Medida medidasEnFecha(Fecha fechaMedidas){
        return registro.get(fechaMedidas);
    }

    public int promedioPesoEnAño(Fecha fechaParametro1){

        int pesoglobal = 0;
        int contadorPesos = 0;
        int promedio = 0;

        for ( Fecha xFecha : registro.keySet()) {
            if ( (registro.get(xFecha.año) != null) && (xFecha.getAño() ==fechaParametro1.getAño()) ){
                contadorPesos++;
                pesoglobal = pesoglobal + registro.get(xFecha).peso;
            }
            else {
                System.out.println("No se encontro el año. ");
            }
        }
        promedio = pesoglobal / contadorPesos;
        return  promedio;

    }

    public int promedioAlturaEnAño(Fecha fechaParametro){
        int alturaglobal = 0;
        int contadorAlturas = 0;
        int promedio = 0;
        for ( Fecha xFecha : registro.keySet()) {
            if ( (registro.get(xFecha.año) != null) && (xFecha.getAño() ==fechaParametro.getAño()) ){
                contadorAlturas++;
                alturaglobal = alturaglobal + registro.get(xFecha).altura;
            }
            else {
                System.out.println("No se encontro el año. ");
            }
        }
        promedio = alturaglobal / contadorAlturas;
        return  promedio;
    }

}