package BatismoDeJava.NivelIntermediario.PosDesafio5;

public class Uzumaki extends Ninja implements EstrategiaDeBatalha {

    public Uzumaki() {}

    public Uzumaki(String nome, String aldeia, int idade) { super(nome, aldeia, idade); }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void ataqueEspecial () {
        System.out.println("RASSSENGAAAAAAAAAAN!");
    }
}
