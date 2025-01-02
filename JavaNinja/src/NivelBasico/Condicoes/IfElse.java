package NivelBasico.Condicoes;

public class IfElse {
    public static void main(String[] args) {

        /*
        Usando IF e ELSE
        Objetivo: Passar o ninja de Rank conforme a quantidade de missões completas
        */

        //Ninja Naruto
        String rank;
        String nome = "Naruto Uzumaki";
        int idade = 14;
        boolean hokage = false;
        short numeroMissoes = 20;



        if(numeroMissoes >= 10 && idade > 15) {

            System.out.println("Naruto está pronto para prestar o exame chunnin");

        } else if (numeroMissoes >= 20) {

            System.out.println("Ele poderia ser um jounin mas ele burro que nem uma porta");

        } else {

            System.out.println("Naruto ainda é um merda de um Gennin");
        }

    }
}
