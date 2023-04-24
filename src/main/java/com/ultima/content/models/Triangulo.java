package com.ultima.content.models;

public class Triangulo extends Figura{

    private double base;
    private double altura;

    public Triangulo(double base, double altura, String cor) {
        this.base = base;
        this.altura = altura;
        super.setCor(cor);
    }

    public Triangulo() {

    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", cor=" + super.getCor() +
                '}';
    }

    @Override
    public double area() {
        return (this.base * this.altura)/2;
    }
}
