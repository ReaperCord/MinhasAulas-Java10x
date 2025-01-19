package BatismoDeJava.NivelIntermediario.LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //Em uma lista encadeada, cada item é chamado de nó
        LinkedList<String> lista = new LinkedList<String>();
        lista.add("Naruto");
        lista.add("Sasuke");
        lista.add("Sakura");

        //visualizando dados
        System.out.println(lista);

        //Adicionando dados
        /*lista.add("Kakashi Hatake");
        System.out.println(lista);*/

        //modificando posição de dados
        lista.add(1, "Kakashi Hatake");
        System.out.println(lista);

        //removendo
        lista.remove(2);
        System.out.println(lista);


    }
}
