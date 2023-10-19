package com.example.animals;
public class Perro {

    // inicializacion de atributos

    String nombre;
    Double altura;
    Double peso;
    String colorpelaje;
    String genero;
    String raza;
    Integer edad;

    public Perro(String nombre, Double altura, Double peso,
                 String colorpelaje, String genero, String raza,
                 Integer edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.colorpelaje = colorpelaje;
        this.genero = genero;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getAltura() {
        return altura;
    }

    public Double getPeso() {
        return peso;
    }

    public String getColorpelaje() {
        return colorpelaje;
    }

    public String getGenero() {
        return genero;
    }

    public String getRaza() {
        return raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double calcularTamano() {
        return (this.peso*this.altura)*100;
    }

    public void ladrar () {
        System.out.println(nombre+ " esta LADRANDO ");
    }


}
