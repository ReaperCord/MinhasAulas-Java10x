package BatismoDeJava.NivelBasico;

public class Array2 {
    public static void main(String[] args) {
        //array simples
        String[] ninjasSimples = new String[3];
        ninjasSimples[0] = "Naruto Uzumaki";
        ninjasSimples[1] = "Sakura Haruno";
        ninjasSimples[2] = "Sasuke Uchiha";

        for (int i = 0; i < ninjasSimples.length; i++) {
            System.out.println(ninjasSimples[i]);
        }

        System.out.println("------------------ Fim do simples ------------------");
        System.out.println("------------------- começo 2D --------------------");
        //array 2D - sim isso mesmo array 2D, é uma array de array, como essa porra funciona abaixo:
        String[][] ninjasAldeias = new String[3][3];

        ninjasAldeias[0][0] = "Konoha";
        ninjasAldeias[0][1] = "Naruto Uzumaki";
        ninjasAldeias[0][2] = "Sasuke Uchiha";

        ninjasAldeias[1][0] = "Nevoa";
        ninjasAldeias[1][1] = "Zabuza da nevoa";
        ninjasAldeias[1][2] = "Haku";

        ninjasAldeias[2][0] = "Areia";
        ninjasAldeias[2][1] = "Gaara";
        ninjasAldeias[2][2] = "Temari";

        for (int i = 0; i < ninjasAldeias.length; i++) {
            for (int j = 0; j < ninjasAldeias[i].length; j++) {
                System.out.println(ninjasAldeias[i][j]);
                System.out.println("--------------------");
            }

        }





    }
}
