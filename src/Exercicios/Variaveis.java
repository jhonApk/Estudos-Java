package Exercicios;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Variaveis {
    public static void main(String[] args) {
        System.out.println("============================= Variveis ===============================");
        System.out.println();
        DiferencaIdade();
    }


    public static void Exec1(){
        System.out.println("Realiando calculo média");

        double mediaFinal;
        double av1 = 10.0;
        double av2 = 6.0;
        double tcc = 5.0;
        double provaSemestral = 7.0;
        boolean alunoxemplar = true;
        int frequencia = 85;


        mediaFinal = provaSemestral * 0.5 +  tcc * 0.3 +((av1 +av2)/2) *0.2;


        if (alunoxemplar == true && frequencia >= 90){
            mediaFinal += 1;
        }else if (alunoxemplar == false || frequencia >= 80){
            mediaFinal += 0.5;
        }else{
            mediaFinal = mediaFinal + 0.0;
        }
        System.out.println("Sua média foi: " + mediaFinal);

    }


    public static void CalculoQuadrado(){
        int lado = 5;

        int area = lado * lado;

        System.out.println(area);
    }

    public static void Triangulo() {
        int alturaTriangulo = 10;
        int baseTriangulo = 15;

        int areaTriangulo  =  baseTriangulo * alturaTriangulo;
        System.out.println(areaTriangulo);
    }


    public static void DiferencaIdade(){

        int baseAno = OffsetDateTime.now().getYear();
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Qual seu nome: ");
        String nome = entrada.next();
        System.out.printf("Qual sua data de nascimento: ");
        int dataNascimento = entrada.nextInt();
        int idade = baseAno - dataNascimento;

        System.out.printf("Olá %s você tem %s anos ", nome, idade );


    }
}






