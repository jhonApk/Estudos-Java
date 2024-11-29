package com.devjhon.maratonajava.introducao;

public class OperadoresAritimeticos03 {
    public static void main(String[] Args){
        //Operadores aritimeticos +, -, /, %, *
        soma();
        subtracao();
        divisao();
        multiplicacao();
        resto();
    }

    public static void  soma(){
        int numero1 = 10;
        int numero2 = 20;

        double resultado = numero1 + numero2;
        System.out.println(resultado);
    }

    public static void subtracao(){
        double num1 = 10.5;
        float num2 = 5.5f;
        double result = num1 - num2;
        System.out.println(result);
    }

    public static void divisao(){
        int num1 = 10;
        float num2 = 2.5f;
        float result = num1 / num2;
        System.out.println(result);
    }

    public static void multiplicacao(){
        int num1 = 5;
        int num2 = 5;
        int result = num1 * num2;
        System.out.println(result);
    }

    public static void resto(){
        double n1 = 5;
        double n2 = 2;
        double result = n1 % n2;
        System.out.println(result);
    }


}
