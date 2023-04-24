package com.ultima.content.models;

public class Quadrado extends Retangulo{

    public Quadrado(double lado1, String cor) {
        super(lado1, cor);
    }

    public Quadrado() {

    }

    @Override
    public double area(){
        return super.getLado1() * super.getLado1();
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado1= " + super.getLado1() +
                ", cor= " + super.getCor() +
                "}";
    }
}
