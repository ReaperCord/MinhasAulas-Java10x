package BatismoDeJava.NivelIntermediario.PosDesafio5;

public class Uchiha extends Ninja implements EstrategiaDeBatalha{
    public Uchiha() {}

    public Uchiha(String nome, String aldeia, int idade) { super(nome, aldeia, idade); }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void ataqueEspecial () {
        System.out.println("KATON! JUTSU BOLA DE FOGO!");
    }
}
