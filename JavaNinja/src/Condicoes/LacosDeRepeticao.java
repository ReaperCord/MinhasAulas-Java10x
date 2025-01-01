package Condicoes;


/*
Laços de repitção, vão repetir infinitaente ou até atingirmos o paramêtro desejado
-> While
    while (condição) {
        equanto a condição for verdadeira o código vai continuar rodando
    }

-> For
    for () {
    }

*/
public class LacosDeRepeticao {
    public static void main(String[] args) {

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        /*
        while (numeroDeClones <= numeroMaximoDeClones) {
            numeroDeClones++;
            System.out.println("O naruto fez " + numeroDeClones + " clones da sombra");

        }*/

        for (int i = 0; i <= numeroMaximoDeClones; i++) {
            System.out.println("O Naruto fez " + i + " clones da sombra");

        }
    }
}
