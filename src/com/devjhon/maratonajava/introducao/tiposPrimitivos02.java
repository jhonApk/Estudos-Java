package com.devjhon.maratonajava.introducao;

public class tiposPrimitivos02 {
    public static  void main(String[] args){

        exercicio();
    }

    public static void tiposPrimitivos(){
        //java possui os tipos primitivos Int, Double, Float, Long, Boolean, Char, byte, short, string

        int idade = 28;
        double peso = 58.5;
        float altura = 163.5f;
        byte byteS = 127;
        short shot = 32000;
        long numeroGrande = 1000000000;
        boolean verdadeiro = true;
        boolean falso = false;
        char character = 'c';
        String cordas = "Isso é uma string";

        System.out.println(idade);
        System.out.println(peso);
        System.out.println(altura);
        System.out.println(byteS);
        System.out.println(shot);
        System.out.println(numeroGrande);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(character);
        System.out.println(cordas);

    }

    public static void exercicio(){
        String nome = "Marcos";
        double  salario = 2500;
        String endereco = "Rua 14";
        System.out.println("Eu " + nome + ", moro na " + endereco + ", confirmo que recebi o salario de " + salario);
    }

}

