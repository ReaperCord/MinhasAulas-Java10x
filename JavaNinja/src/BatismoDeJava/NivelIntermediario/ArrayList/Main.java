package BatismoDeJava.NivelIntermediario.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Array
        //arrays são estáticos, eles nunca alteram de tamanho. Pôs os mesmos são objetos de memória
        String[] ninjasArray = new String[3];

        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";

        System.out.println("------------ Array --------------");

        for (int i = 0; i < ninjasArray.length; i++) {
            System.out.println("Printando array: " + ninjasArray[i]);
        }


        //Listas
        //Listas não são estaticas e podem aumentar e diminuir dinamicamente!
        //As listas tambem recebem metodos proprios

        List<String> ninjasList = new ArrayList<String>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Tobirama Senju");

        System.out.println("------------ Lista --------------");
        System.out.println("Lista de ninjas: " + ninjasList);

        //adicionar na lista
        ninjasList.add("Kakashi Hatake");
        System.out.println("Lista de ninjas: " + ninjasList);

        //remover da lista
        ninjasList.remove("Kakashi Hatake");
        System.out.println("Lista de ninjas: " + ninjasList);

        //trocar elementos
        ninjasList.set(3, "Hashirama Senju");
        System.out.println("Lista de ninjas: " + ninjasList);

        //verificando o tamanho da lista
        System.out.println("Tamanho da lista: " + ninjasList.size());



    }
}
