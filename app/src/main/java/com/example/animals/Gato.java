package com.example.animals;

public class Gato {

    // Atributos
    private String nombre;
    private int edad;
    private String raza;
    private double peso;
    private String genero;

    // Constructor
    public Gato(String nombre, int edad, String raza, double peso, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.peso = peso;
        this.genero = genero;
    }

    // Métodos
    public void maullar() {
        System.out.println(nombre + " está maullando.");
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }

    public void envejecer() {
        edad++;
        System.out.println(nombre + " ha envejecido un año. Ahora tiene " + edad + " años.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Getter y Setter para la raza
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }


    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Gato [nombre=" + nombre + ", edad=" + edad + ", raza=" + raza + ", peso=" + peso + ", genero=" + genero + "]";
    }
}
