package BatismoDeJava.NivelBasico.Desafio1;

public class teste1 {


    public static void ImprimirNinjas() {
        String name = "Kakashi Hatake";
        String mission = "Assassinato";
        int age = 14;
        char missionDifficulty = 'C';
        boolean missionStatus;


        if (age <= 15 && (missionDifficulty == 'D' || missionDifficulty == 'E')) {
            missionStatus = true;
            String resultado = missionStatus ? "Concluído" : "Não concluído";

            System.out.println("Missão: " + mission);
            System.out.println("Nivel de dificuldade: " + missionDifficulty);
            System.out.println("Status: " + resultado);

        } else if (age >= 15 && (missionDifficulty == 'C' || missionDifficulty == 'B')) {
            missionStatus = true;
            String resultado = missionStatus ? "Concluído" : "Não concluído";

            System.out.println("Missão: " + mission);
            System.out.println("Nivel de dificuldade: " + missionDifficulty);
            System.out.println("Status: " + resultado);

        } else {
            missionStatus = false;
            String resultado = missionStatus ? "Concluído" : "Não concluído";

            System.out.println("Missão: " + mission);
            System.out.println("Nivel de dificuldade: " + missionDifficulty);
            System.out.println("Status: " + resultado);
            System.out.println("Ninjas menores de 15 anos spo podem participar de missões de nivel C e D");

        }
    }

    public static void main(String [] args ) {



    }
}

