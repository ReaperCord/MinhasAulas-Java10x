package BatismoDeJava.NivelBasico.Desafio1;

public class Ninjas {

    String name;
    String mission;
    char missionDifficulty;
    boolean missionStatus;
    int age;


    public static void ImprimirNinjas(Ninjas ninja) {

        //autorizando a missão
        if ((ninja.age <= 15 && (ninja.missionDifficulty == 'D' || ninja.missionDifficulty == 'E')) || (ninja.age > 15 && (ninja.missionDifficulty == 'C' || ninja.missionDifficulty == 'B' || ninja.missionDifficulty == 'A'))) {
            ninja.missionStatus = true;
        } else {
            ninja.missionStatus = false;
        }

        //construtor
        System.out.println("Ninja alocado para missão: " +ninja.name);
        System.out.println("Idade do ninja: " + ninja.age);
        System.out.println("Missão: " + ninja.mission);
        System.out.println("Nivel de dificuldade: " + ninja.missionDifficulty);

        if (ninja.missionStatus == true) {
            System.out.println("Missão autorizada");
        } else {
            System.out.println("Missão não autorizada");
        }

        System.out.println("-----------------------------------------------");

    }


    public static void main(String[] args) {

        //ninjas
        new Ninjas();

        Ninjas naruto = new Ninjas();
        naruto.name = "Naruto Uzumaki";
        naruto.age = 14;
        naruto.mission = "Assassinato";
        naruto.missionDifficulty = 'B';

        Ninjas sasuke = new Ninjas();
        sasuke.name = "Sasuke uchiha";
        sasuke.age = 15;
        sasuke.mission = "Caça a gato";
        sasuke.missionDifficulty = 'E';

        Ninjas sakura = new Ninjas();
        sakura.name = "Sakura Haruno";
        sakura.age = 14;
        sakura.mission = "Ajuda no hospital";
        sakura.missionDifficulty = 'D';

        Ninjas kakashi = new Ninjas();
        kakashi.name = "Kakashi Hatake";
        kakashi.age = 33;
        kakashi.mission = "Assassinato";
        kakashi.missionDifficulty = 'B';

        //Status de conclusão de missão

        ImprimirNinjas(naruto);
        ImprimirNinjas(sakura);
        ImprimirNinjas(sasuke);
        ImprimirNinjas(kakashi);
    }

}
