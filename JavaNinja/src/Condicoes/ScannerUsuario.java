package Condicoes;
import java.util.Scanner;

public class ScannerUsuario {

    /*
    O Scanner é uma forma de trazer o usuário para dentro da aplicação;
    Objetivo: O usuário vai criar um ninja e nós vamos validar os dados.
    */

    public static void main(String[] args) {
        //abre o Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        //recebe o nome do ninja
        System.out.println("Digite o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();


        System.out.println("O nome do seu ninja é: "+nomeDoNinja);

        //recebe a idade do ninja

        System.out.println("Escreva aqui a idade do seu ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();

        System.out.println("A idade do seu ninja é: "+idadeDoNinja+" anos");


        //tratamento de dados
        if(idadeDoNinja >= 18) {
            System.out.println("Seu ninja é maior de idade e pode ir em missões fora da aldeia");
        }
        else {
            System.out.println("Seu ninja não pode sair da vla ainda! Ele precisa de mais experiência");
        }

        //sempre feche o Scanner
        caixaDeTexto.close();

    }
}
