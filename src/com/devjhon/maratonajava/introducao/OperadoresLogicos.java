package com.devjhon.maratonajava.introducao;

public class OperadoresLogicos {
    public static void main(String[] args) {
        //Operadores lógico || - Ou , && - E, != - diferente
        // && As duas condições precisam ser verdadeiras para retornar true
        //||(ou) Apenas uma das condições precisam ser verdadeiras para retornar true
        testeLogico();
    }


    public static void  testeLogico(){
        boolean x = false;
        boolean y = true;



        System.out.println(x == true && y == true); //uma condição é falsa por isso volta (false)
        System.out.println(x == false && y == true);//as duas são verdadeiras (true)
        System.out.println(x == true || y == true);//apeans uma precisa ser verdadeira (true)
        System.out.println(x == true || y == false);//apeans uma precisa ser verdadeira (false)
    }



    public static void teste(){
        int idade = 18;
        double salario = 3400;

        if (idade >= 18 && salario < 3400){
            System.out.println("Os dois precisa ser verdadeiro para retornar true");
        }else if (idade >= 18 || salario < 3800){
            System.out.println("Somente um precisa ser verdadeiro para retornar true");
        }else if( idade != 18){
            System.out.println("Diferente de 18");
        }
    }

}
