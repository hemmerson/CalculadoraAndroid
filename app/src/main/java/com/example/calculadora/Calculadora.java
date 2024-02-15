package com.example.calculadora;

public class Calculadora {

    public Double soma(Double numero1, Double numero2){
        return numero1 + numero2;
    }

    public Double subtracao(Double numero1, Double numero2){
        return numero1 - numero2;
    }

    public Double multiplicacao(Double numero1, Double numero2){
        return numero1 * numero2;
    }

    public Double divisao(Double numero1, Double numero2){
        return numero1 / numero2;
    }

    public Double potencia(Double numero1, Double numero2){
        /**
         *  Método que retorn o numero1 elevado ao numero2
         */
        return Math.pow(numero1, numero2);
    }

    public Double raizQuadrada(Double numero){
        return Math.sqrt(numero);
    }
}
