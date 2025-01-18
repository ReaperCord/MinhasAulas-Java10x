package BatismoDeJava.NivelIntermediario.GettersAndSetters;

public abstract class Ninja {
    private String nome;
    private int idade;
    private int numeroDeMissoesConcluidas;
    private double altura = 2.10;

   /*
   modo manual
   //Usando getters -> getNomeDaVariavel() {}
    public String getNome() {
        return nome;
    }

    //Usando setter -> setNomeDaVariavel(Tipo nomeVariavel) {this.variavel = variavel}
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }*/

    //getters and setters

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

    public int getNumeroDeMissoesConcluidas() {
        return numeroDeMissoesConcluidas;
    }

    public void setNumeroDeMissoesConcluidas(int numeroDeMissoesConcluidas) {
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //construtores

    public Ninja () {

    }

    public Ninja(String nome, int idade, int numeroDeMissoesConcluidas, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.altura = altura;
    }
}
