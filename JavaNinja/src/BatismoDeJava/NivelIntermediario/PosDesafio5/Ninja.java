package BatismoDeJava.NivelIntermediario.PosDesafio5;

public abstract class Ninja implements EstrategiaDeBatalha{

        String nome;
        String aldeia;
        int idade;
        int numeroDeMissoesConcluidas;
        NivelNinja rank;

        public Ninja() {

        }


        //TODO: O NINJA TEM QUE FAZER OBRIGATORIAMENTE
        final public void tacarKunai() {
            System.out.println("Eu sou um método da classe mãe");
        }

        //contrutor basico
        public Ninja(String nome, String aldeia, int idade) {
            this.nome = nome;
            this.aldeia = aldeia;
            this.idade = idade;
        }

        //TODO: Construtor mais completo
        //sobrecarga de metodos
        public Ninja(String nome, String aldeia, int idade , int numeroDeMissoesConcluidas ,NivelNinja rank) {
            this(nome, aldeia, idade);
            this.rank = rank;
            this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        }

        //TODO: METODOS GERAIS, todos os ninjas vão ter
        public void ataqueEspecial(){
            System.out.println("Meu nome é: " + nome + ". E este é o meu ataque especial");
        }

        //sobrescrevendo os metodos de interface
        @Override
        public void estrategiaDeBatalhaNinja () {
            System.out.println("Meu nome é: " + nome + "! E esta é a minha estratégia de batalha");
        }

        public void inteligenciaDeCombate () {
            System.out.println("Meu nome é: " + nome + "! E esta é a minha inteligencia de combate");
        }

        public void inteligenciaDeCombate(int qi) {
            if(qi > 150) {
                System.out.println("Seu QI de combate é: " + qi + "\nVocê é um gênio de combate!");
            } else if (qi >= 130) {
                System.out.println("Seu QI é: " + qi + "\nVocê é um ninja promissor");
            }
            else {
                System.out.println("Seu QI é: " + qi + "\nVocê precisa treinar mais suas estrategias");
            }
        }

        public void imprimirNinja(Ninja ninja) {
            System.out.println("---------------- Ninja ----------------");
            System.out.println("Nome: " + ninja.nome);
            System.out.println("Aldeia: " + ninja.aldeia);
            System.out.println("Idade: " + ninja.idade);
            System.out.println("Numero de missões concluidas: " + ninja.numeroDeMissoesConcluidas);
            System.out.println("Rank: " + ninja.rank);
        }


}
