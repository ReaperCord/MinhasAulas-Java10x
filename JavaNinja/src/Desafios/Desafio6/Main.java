package Desafios.Desafio6;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        LinkedList<Ninja> listaNinja = new LinkedList<>();
        listaNinja.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        listaNinja.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listaNinja.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listaNinja.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listaNinja.add(new Ninja("Gaara", 17, "Areia"));
        listaNinja.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listaNinja.add(new Ninja("Temari", 18, "Areia"));

        System.out.println("___________ Mostrar Ninja ____________");
        for (Ninja ninja : listaNinja) {
            System.out.println(ninja);
        }

        System.out.println("___________ Adicionar na lista ____________");
        listaNinja.addFirst(new Ninja("Figurante 8", 18, "Aldeia da Folha"));

        for (Ninja ninja : listaNinja) {
            System.out.println(ninja);
        }

        System.out.println("___________ Remover da lista ____________");
        listaNinja.removeFirst();

        for (Ninja ninja : listaNinja) {
            System.out.println(ninja);
        }


        System.out.println("___________ procura por indice ____________");
        Ninja quartoNinja = listaNinja.get(4);
        System.out.println("O quarto ninja é: " + quartoNinja);


        System.out.println("___________ Ordenando por nome ____________");
        listaNinja.sort(Comparator.comparing(Ninja::getNome));

        for (Ninja ninja : listaNinja) {
            System.out.println(ninja);
        }

        System.out.println("___________ Ordenando por idade____________");
        listaNinja.sort(Comparator.comparing(Ninja::getIdade));

        for (Ninja ninja : listaNinja) {
            System.out.println(ninja);
        }

        System.out.println("___________ Ordenando por Vila ____________");
        listaNinja.sort(Comparator.comparing(Ninja::getVila));

        for (Ninja ninja : listaNinja) {
            System.out.println(ninja);
        }



    }
}
