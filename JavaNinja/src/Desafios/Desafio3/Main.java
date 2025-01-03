package Desafios.Desafio3;

import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke";
        sasuke.idade = 14;
        sasuke.missao = "Escolta";
        sasuke.dificuldadeMissao = "C";
        sasuke.habilidadeEspecial = "Sharingan";

        Uchiha itachi = new Uchiha();
        itachi.nome = "Itachi";
        itachi.idade = 18;
        itachi.missao = "Assassinato";
        itachi.dificuldadeMissao = "A";
        itachi.habilidadeEspecial = "Sharingan e Suzano'O";

        // imprimindo todos
        sasuke.MostrarHabilidadeEspecial(sasuke);
        itachi.MostrarHabilidadeEspecial(itachi);

    }

}
