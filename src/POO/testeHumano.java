package POO;

public class testeHumano {
    public static void main(String[] args) {

        Humano humano1 = new Humano("Marcos", 27, 1.75, "pretos");
        Humano humano2 = new Humano("Babi", 27, 1.54, "Pretos");
        Humano humano3 = new Humano("Mel", 11, 1.60, "Pretos");


        humano1.falar();
        System.out.println("");
        humano2.falar();
        System.out.println("");
        humano3.falar();
    }
}
