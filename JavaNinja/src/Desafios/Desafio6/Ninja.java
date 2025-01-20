package Desafios.Desafio6;

public class Ninja {

    private String nome;
    private int idade;
    private String vila;

    //Construtores

    public Ninja(String nome, int idade, String vila) {
        this.nome = nome;
        this.idade = idade;
        this.vila = vila;
    }

    //Getters&Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getVila() {
        return vila;
    }

    public void setVila(String vila) {
        this.vila = vila;
    }


    @Override
    public String toString() {
        return "\n" + "Nome: " + nome + "\nIdade: " + idade + "\nVila: " + vila + "\n";
    }
}

