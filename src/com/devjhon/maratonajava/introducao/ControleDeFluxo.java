package com.devjhon.maratonajava.introducao;

public class ControleDeFluxo {
    public static void main(String[] args) {
        ifElse();
        switchCase();
    }



    public static void ifElse(){
        int idade = 18;

        if (idade >= 18){
            System.out.println("Entrada liberada");
        }else {
            System.out.println("Entrada negada");
        }

        Boolean acompanhada = true;

        if (!acompanhada){ //verifica se é verdadeiro
            // ! -> estou negando ou seja o positivo se torna negativo e vice e versa
            System.out.println("Entrada liberada");
        }else {
            System.out.println("Entrada negada");
        }

    }




    public static void switchCase(){
        int mes = 1;
        switch (mes){
            case 1: System.out.println("Janeiro");
                break;
            case 2: System.out.println("Fevereiro");
                break;
            case 3: System.out.println("Março");
                break;
        }
    }
}
