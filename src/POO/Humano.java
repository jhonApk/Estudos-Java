package POO;

public class Humano {
    String nome;
    int idade;
    double altura;
    String corDosOlhos;

    public Humano(String nome, int idade, double altura, String corDosOlhos){
        super();
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.corDosOlhos = corDosOlhos;
    }


    public void falar(){
        System.out.println("Olá, eu sou o " + nome );
        System.out.println("Tenho " + idade + " anos" );
        System.out.println("Minha altura é " + altura);
        System.out.println("A cor dos meus olhos são " + corDosOlhos);
    }


    public void comer(){
        System.out.println("Comendo....");
    }

    public void andar(){
        System.out.println("Andando...");
    }
}
