package com.example.animals;

public class Conejo {

    private String nombre;
    private Double altura;
    private Double peso;
    private String colorPelaje;
    private String genero;
    private String raza;
    private Integer edad;
    public Conejo(String nombre, Double altura, Double peso, String colorPelaje, String genero, String raza, Integer edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.colorPelaje = colorPelaje;
        this.genero = genero;
        this.raza = raza;
        this.edad = edad;
    }
    public double calcularTamano() {
        return (peso / altura)*100;
    }
    public void roer() {
        System.out.println("Roer, roer...");
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public String getColorPelaje() {
        return colorPelaje;
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
    public void setEdad(Integer edad) {
        this.edad = edad;
    }


}
