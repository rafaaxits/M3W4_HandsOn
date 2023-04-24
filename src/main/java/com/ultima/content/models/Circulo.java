package com.ultima.content.models;

public class Circulo extends Figura{
    private double raio;
    private static double PI = 3.14;

    public Circulo(double raio, String cor) {
        this.raio = raio;
        super.setCor(cor);
    }

    public Circulo() {

    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return PI * Math.pow(this.raio, 2);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", cor=" + super.getCor() +
                '}';
    }
}
