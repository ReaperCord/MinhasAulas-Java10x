package Desafios.Desafio4;

public class NinjaBasico implements Ninja {
    String nome;
    String aldeia;
    String habilidade;
    int idade;

    //para a super
    public NinjaBasico() {
        String nome;
        String aldeia;
        int idade;
    }

    //normal
    public NinjaBasico(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }


    public void habilidadeComum(){
        habilidade = "Ataque com Kunai";
        System.out.println(habilidade);
    }


    //utilizando interface
    @Override
    public void mostrarInformacoes() {
        System.out.println("nome: " + nome + "\naldeia: " + aldeia + "\nidade: " + idade);
    }

    @Override
    public void executarHabilidade() {

        habilidade = "Você não vai fugir!\n ...atirando kunai";
        System.out.println(habilidade);
        System.out.println("--------------------------------------------\n");
    }
}
