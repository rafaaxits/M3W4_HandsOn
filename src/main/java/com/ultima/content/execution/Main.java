package com.ultima.content.execution;

import com.ultima.content.models.*;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> areaFiguras = new ArrayList<>();
        System.out.println("moving the code to branch dev");
        //Retângulo
        Retangulo figuraR = new Retangulo();
        System.out.println("Digita o lado1 do Retangulo");
        figuraR.setLado1(NumberUtils.toDouble(sc.nextLine()));
        System.out.println("Digita o lado2 do Retangulo");
        figuraR.setLado2(NumberUtils.toDouble(sc.nextLine()));
        System.out.println("Digita a cor do Retangulo");
        figuraR.setCor(sc.nextLine());
        areaFiguras.add(figuraR.area());
        System.out.println("Área do retângulo: " + figuraR.area());

        //Quadrado
        Quadrado figuraQ = new Quadrado();
        System.out.println("Digita o lado do Quadrado");
        figuraQ.setLado1(NumberUtils.toDouble(sc.nextLine()));
        System.out.println("Digita a cor do Quadrado");
        figuraQ.setCor(sc.nextLine());
        areaFiguras.add(figuraQ.area());
        System.out.println("Área do quadrado: " + figuraQ.area());

        //Triangulo
        Triangulo figuraT = new Triangulo();
        System.out.println("Digita a base do Triangulo");
        figuraT.setBase(NumberUtils.toDouble(sc.nextLine()));
        System.out.println("Digita a altura do Triangulo");
        figuraT.setAltura(NumberUtils.toDouble(sc.nextLine()));
        System.out.println("Digita a cor do Triangulo");
        figuraT.setCor(sc.nextLine());
        areaFiguras.add(figuraT.area());
        System.out.println("Área do triângulo: " + figuraT.area());

        //Circulo
        Circulo figuraC = new Circulo();
        System.out.println("Digita o raio do Circulo");
        figuraC.setRaio(NumberUtils.toDouble(sc.nextLine()));
        System.out.println("Digita a cor do Circulo");
        figuraC.setCor(sc.nextLine());
        areaFiguras.add(figuraC.area());
        System.out.println("Área do Círculo: " + figuraC.area() + "\n");

        System.out.println(areaFiguras.toString());
        double maiorArea = NumberUtils.max(areaFiguras.stream().mapToDouble(Number::doubleValue).toArray());
        double minArea = NumberUtils.min(areaFiguras.stream().mapToDouble(Number::doubleValue).toArray());
        System.out.println("Maior Área: " + maiorArea);
        System.out.println("Menor Área: " + minArea);

        switch (areaFiguras.indexOf(maiorArea)){
            case 0:
                System.out.println("Retângulo tem a maior área");
                break;
            case 1:
                System.out.println("Quadrado tem a maior área");
                break;
            case 2:
                System.out.println("Triangulo tem a maior área");
                break;
            case 3:
                System.out.println("Circulo tem a maior área");
                break;
            default:
                System.out.println("Figura com área inválida");
                break;
        }
    }
}
