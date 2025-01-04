package Desafios.Desafio4;

public class NinjaAvancado extends NinjaBasico implements Ninja {

    String habilidadeEspecial;
    String rank;
    int numeroMissoes;

    public NinjaAvancado(String nome, String aldeia, int idade, String rank, int numeroMissoes) {
        super();
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.rank = rank;
        this.numeroMissoes = numeroMissoes;
    }

    //habilidade especial do ninja avançado
    public void habilidadeEspecial() {
        habilidadeEspecial = "Jutsu bola de fogo!";
        System.out.println(habilidadeEspecial);
    }

    //utilizando interface
    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Rank do ninja: " + rank + "\nNumeros de missões: " + numeroMissoes);

    }

    @Override
    public void executarHabilidade() {
        String habilidade = "Eu sou " + nome + ", então queime!! Katon, JUTSU BOLA DE FOGO!";
        System.out.println(habilidade);
        System.out.println("--------------------------------------------\n");
    }

}


