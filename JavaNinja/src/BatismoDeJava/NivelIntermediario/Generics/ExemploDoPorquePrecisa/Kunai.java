package BatismoDeJava.NivelIntermediario.Generics.ExemploDoPorquePrecisa;

public class Kunai {
    private String nome;

    //construtores
    public Kunai() {

    }

    public Kunai(String nome) {
        this.nome = nome;
    }

    //Getters&Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //toString
    @Override
    public String toString() {
        return "Tipo de kunai: " + nome;
    }
}
