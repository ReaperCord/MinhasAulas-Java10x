package BatismoDeJava.NivelIntermediario.PosDesafio5;

public class Missoes {
    private String nome;
    private RankDeMissoes rank;

    //metodo para mostrar mais informações
    public void exibirDetalhes (){
        System.out.println("Nome da missão: " + nome + "\nRank: " + rank + "\nDescrição: " + rank.getDescricao() + "\nDificuldade: " + rank.getDificuldade());

    }

    public Missoes(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }
}
