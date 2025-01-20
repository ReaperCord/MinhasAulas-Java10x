package BatismoDeJava.NivelIntermediario.HashSet;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("______________________ LIST ______________________");
        List<String> ninjas = new ArrayList<String>();
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Sakura Haruno");
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Rock Lee");
        ninjas.add("Temari");
        ninjas.add("Gaara do Deserto");


        System.out.println("Ninjas = " + ninjas);

        System.out.println("______________________ SET: HashSet ______________________");
        //A estrutura de dados SET, quando utilizando o
        // hashset ignora dados duplicados, podem ele não se importa com ordenação
        Set<String> ninjaSet = new HashSet<String>();

        //trazendo outras colections para o set
        ninjaSet.addAll(ninjas);

        /*ninjaSet.add("Naruto Uzumaki");
        ninjaSet.add("Sasuke Uchiha");
        ninjaSet.add("Sakura Haruno");
        ninjaSet.add("Sasuke Uchiha");
        ninjaSet.add("Naruto Uzumaki");*/

        System.out.println("Lista de Ninjas = " + ninjaSet);



        System.out.println("______________________ SET: TreeSet ______________________");
        //treeset → ignora itens duplicados e ordena eles de uma forma lógica
        //quando utilizado com ‘Strings’ utiliza a ordem alfabética
        //Quando utilizado com int será com ordem crescente
        Set<String> ninjasSet = new TreeSet<String>();
        ninjasSet.addAll(ninjas);

        System.out.println("Lista de Ninjas = " + ninjasSet);


    }
}
