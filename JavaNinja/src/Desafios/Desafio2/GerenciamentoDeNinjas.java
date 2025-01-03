package Desafios.Desafio2;
import java.util.Scanner;

/*
    O usuário tem que poder cadastrar um ninja
    Tem que ver uma lista de ninjas cadastrados
    O usuário tem que poder encerrar o programa a qualquer momento

*/
public class GerenciamentoDeNinjas{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //criando array
        final int NUMERO_MAX = 10;
        String[] ninjas = new String[NUMERO_MAX];

        //contadores
        int ninjasCadastrados = 0;
        int opcaoUsuario = 0;

        while (opcaoUsuario != 3) {

            System.out.println("--------------- Sistema de gerenciamento de ninjas da aldeia da folha ---------------");
            System.out.println("1. Cadastrar Ninjas");
            System.out.println("2. Consultar Ninjas cadastrados");
            System.out.println("3. Sair");
            System.out.println(" ");
            System.out.println("Escolha uma opção: ");
            opcaoUsuario = scanner.nextInt();
            scanner.nextLine();




            switch (opcaoUsuario) {
                case 1: {
                    if(ninjasCadastrados < NUMERO_MAX) {

                        System.out.println("Nome do ninja a ser cadastrado: ");
                        String nomeNinja = scanner.nextLine();

                        ninjas[ninjasCadastrados] = nomeNinja;

                        //somando nomes a lista
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso!");

                    }
                    else{
                        System.out.println("Lista de ninjas está cheia! Nenhuma nova inscrição será aceita até o próxima turma");
                    }

                    break;
                }

                case 2: {
                    if(ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja cadastrado! Parece que o Itachi passou o rodo em geral de novo");
                    }
                    else{
                        System.out.println("--------------- Lista de ninjas cadastrados ---------------");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }

                    break;
                }

                case 3: {

                    System.out.println("O sistema está sendo fechado...");
                    break;
                }

                default: {
                    System.out.println("Valor inserido invalido, tente novamente");
                    break;
                }

            }


        }
    }
}
