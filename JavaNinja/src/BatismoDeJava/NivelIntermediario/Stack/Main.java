package BatismoDeJava.NivelIntermediario.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //array
        // Arrays são estáticos e tem referência de memória prévia
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto Uzumaki";

        System.out.println("_________________ String _________________");
        for (String s : ninjasArray) {
            System.out.println("Ninja: " + s);
        }

        //lista
        // Listas são dinâmicas e o seu tamanho aumenta e diminui conforme a necessidade
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");

        System.out.println("_________________ List _________________");
        System.out.println("Ninjas:" + ninjasList);

        //Stack
        // O último elemento a entrar em uma stack é obrigatoriamente o primeiro a sair
        //Métodos próprios do Stack:
        // Push() Coloca um elemento na pilha;
        // Pop() Retira um elemento da pilha;
        // Peek() Verifica qual o próximo elemento da pilha;
        // Size() Verifica o tamanho da pilha, a quantidade de elementos.
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.push("Naruto Uzumaki");
        ninjaStack.push("Sasuke Uchiha");
        ninjaStack.push("Hinata Hyuuga");
        ninjaStack.push("Neji Hyuuga");
        ninjaStack.push("Sakura Haruno");

        System.out.println("_________________ Stack _________________");
        System.out.println("Ninjas:" + ninjaStack);
        ninjaStack.pop();
        System.out.println("Ninjas: " + ninjaStack);
        System.out.println("Próximo ninja da stack: " + ninjaStack.peek());
        System.out.println("Tamanho da stack: " + ninjaStack.size());



    }
}
