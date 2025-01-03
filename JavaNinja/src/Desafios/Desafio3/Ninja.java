package Desafios.Desafio3;

public class Ninja {
    String nome;
    String missao;
    String dificuldadeMissao;
    boolean autorizaçãoDeMissao;
    int idade;


    public void ImprimirNinja(Ninja ninja) {

        //Validando missão
        if ((idade <= 15 && (dificuldadeMissao == "D" || dificuldadeMissao == "E")) || (idade > 15 && (dificuldadeMissao == "C" || dificuldadeMissao == "B" || dificuldadeMissao == "A" || dificuldadeMissao == "S"))) {
            autorizaçãoDeMissao = true;
        } else {
            autorizaçãoDeMissao = false;
        }

        //construtor
        System.out.println("Nome do ninja: " + nome + "\nIdade: " + idade + "\nMissão: " + missao + "\nDificuldade: Rank - " + dificuldadeMissao);

        if (autorizaçãoDeMissao == true) {
            System.out.println("Missão: Autorizada");
        }
        else {
            System.out.println("Missão: Não Autorizada");
        }

    }
}

