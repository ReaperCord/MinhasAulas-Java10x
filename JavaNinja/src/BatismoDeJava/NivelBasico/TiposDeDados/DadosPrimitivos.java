package BatismoDeJava.NivelBasico.TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
        /*
            Dados primitivos: int, double, float, char, boolean, short ...
            Objetivo: criar um ninja
         */

        int idade = 16; //valor máximo: 2147483647
        double altura = 1.65;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        Long saldoBancario = 99999L; //Valor máximo: 3 trilhões e caralhada


        System.out.println(idade);
        System.out.println(altura);
        System.out.println(saldoBancario);
        System.out.println(vivoOuMorto);
        System.out.println("O saldo bancário é: R$ "+saldoBancario);


    }
}
