package TiposDeDados;

public class DadosNaoPrimitivos {
    /*
            1 - Dados primitivos são dados que não conseguem conter métodos de maneira padrão.

            2 - Dados não primitivos são tipos de dados que pode receber métodos para fazer alterações sem que seja mudado o seu escopo

            Dados não primitivos: String, Class, Array, enum

            Objetivo da aula: Criar um ninja e atribuir métodos a ele.
    */


    public static void main(String[] args) {
        //Tudo que for publicado dentro do PSVM será compilado pelo java!
        String nome = "Naruto Uzumaki";
        String nomeUppercase = nome.toUpperCase(); //ToUppercase vai colocar tudo em CAPSLOCK

        System.out.println("Este é o nome normal: "+nome);
        System.out.println("Este é o nome em caixa alta: "+nomeUppercase);
    }
}
