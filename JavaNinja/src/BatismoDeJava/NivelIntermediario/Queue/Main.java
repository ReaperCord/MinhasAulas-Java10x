package BatismoDeJava.NivelIntermediario.Queue;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //array
        String[] ninjasArray = new String[5];

        System.out.println("_________________ String _________________");


        //lista
        List<String> ninjasList = new ArrayList<>();

        System.out.println("_________________ List _________________");


        //Stack
        Stack<String> ninjaStack = new Stack<>();

        System.out.println("_________________ Stack _________________");


        //Queue
        Queue<String> ninjaQueue = new LinkedList<>();
        ninjaQueue.add("Naruto");
        ninjaQueue.add("Sasuke");
        ninjaQueue.add("Sakura");
        ninjaQueue.add("Kakashi");
        ninjaQueue.add("Shikamaru");


        System.out.println("_________________ Queue _________________");
        System.out.println("Ninjas na fila: " + ninjaQueue);

        //revendo o head da fila
        ninjaQueue.poll();
        System.out.println("Ninjas na fila: " + ninjaQueue);

        //visualizando o Head
        System.out.println("Ninja no head: " + ninjaQueue.peek());

        //Não da para tirar ninguém a não ser o head

        //esvaziando a fila
        ninjaQueue.poll();
        ninjaQueue.poll();
        ninjaQueue.poll();
        ninjaQueue.poll();

        //Verificando se ainda tem gente na fila
        if (ninjasList.isEmpty()) {
            System.out.println("A fila está vazia!");
        }




    }
}
