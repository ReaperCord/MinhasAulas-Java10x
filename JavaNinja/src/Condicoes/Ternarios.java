package Condicoes;

public class Ternarios {
    public static void main(String[] args) {

        /*
        Ternários são maneiras de reduzir o código
        variavel = (Condição) ? valor verdadeiro : valor falso;

        */

        short numeroDeMissoes = 11;
        String nivel = (numeroDeMissoes >= 10) ? "Este ninja tem mais de 10 missões" : "Este ninja tem menos de 10 missões";
        System.out.println(nivel);

    }
}
