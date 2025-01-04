package BatismoDeJava.NivelIntermediario.AulaPolimorfismo;

public class Uzumaki extends Ninja {

    String clan;

    public void reservaDeChakara() {
        System.out.println("Eu sou um Uzumaki, e tenho uma reserva de chakara fora do normal");
    }

    @Override
    public void ninjutsu() {
        System.out.println("meu nome é "+ nome + " " + clan + " " + "RASENGAN!!");
    }




}
