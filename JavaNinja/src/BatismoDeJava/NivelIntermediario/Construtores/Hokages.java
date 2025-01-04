package BatismoDeJava.NivelIntermediario.Construtores;

public class Hokages {

    String nome;
    String aldeia;
    double altura;
    int idade;
    boolean vivoMorto;


    //all agrs constructor
    /*public Hokages(String nome, int idade, boolean vivoMorto) {
        this.nome = nome;
        this.idade = idade;
        this.vivoMorto = vivoMorto;
    }*/

    //da pra criar um construtor automaticamente com o alt + ins ex:
    public Hokages(String nome, String aldeia, double altura, int idade, boolean vivoMorto) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.altura = altura;
        this.idade = idade;
        this.vivoMorto = vivoMorto;
    }
}
