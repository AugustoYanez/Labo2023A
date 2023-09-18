package Personas;

import  Fecha.Fecha;
import Objetos.Plato;
import Sistemas.SistemasPesarseAltura.Medida;

import java.time.LocalDate;
import java.util.HashMap;


public abstract class Persona {

    private String nombre;
    private String apellido;
    private int dni;
    private LocalDate nacimiento;
    private String mail;

    public Persona(String nombre, String apellido, int dni, LocalDate nacimiento, String mail) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.mail = mail;
    }

    public Persona(String nombre, String apellido, int dni, LocalDate nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
    }

    public Persona(String nombre, int dni, LocalDate nacimiento, String mail) {
        this.nombre = nombre;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.mail = mail;
    }

    public Persona(String nombre, String apellido, int dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}