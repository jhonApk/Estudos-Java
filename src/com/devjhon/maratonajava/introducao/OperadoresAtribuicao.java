package com.devjhon.maratonajava.introducao;

public class OperadoresAtribuicao {
    public static void main(String[] args) {
        // operadore de atruibuição (=)
        // Operadores de atribuição compostos (+=), (-+), (*=), (/=), (%=)

        int salario = 1000;

        System.out.println(salario += 100); //Adiciona 100
        System.out.println(salario++); //Adiciona 1
        System.out.println(salario--); //subtrai 1
        System.out.println(salario *= 2); //multiplica por 2
        System.out.println(salario /= 2); // Divide por 2
        System.out.println(salario %= 3);// Resto da ivisão "sobra"
    }


}
