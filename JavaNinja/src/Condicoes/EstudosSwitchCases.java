package Condicoes;
import java.util.Scanner;

    /*
        SwitchCases: Servem para casos especificos;
        Objetivos: Pedir para um usuário selecionar um ninja.
    */


public class EstudosSwitchCases {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Escolha um dos ninjas:");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sakura Haruno");
        System.out.println("3 - Sasuke Uchiha");

        System.out.println("Escolha o numero do seu personagem: ");
        int escolhaDoUsuario = scn.nextInt();
        System.out.println("Você escolheu o ninja: " + escolhaDoUsuario);

        //reação a escolha do usuário

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usuário escolheu o Naruto Uzumaki");
                System.out.println("Fez mais que certo! Datebayo!");
                break;

            case 2:
                System.out.println("O usuário escolheu a Sakura Haruno");
                System.out.println("Você não sabia? Mulher tem que ser forte para sobreviver!");
                 break;

            case 3:
                System.out.println("O usuário escolheu o Sasuke Uchiha");
                System.out.println("Eu vou vingar o meu clã, e matar um certo alguém...");
                break;

            default:
                System.out.println("Você não digitou uma resposta válida! Escolha um dos ninjas listados anteriormente");
        }

        scn.close();

    }
}
