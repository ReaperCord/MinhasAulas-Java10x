package BatismoDeJava.NivelBasico;

public class Arrays {
    public static void main(String[] args) {

        String[] ninja = new String[6];
        int[] idades = new int[2];
        boolean[] verdaderoFalso = new boolean[2];

        //nomes
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hataque";

        //idade
        idades[0] = 16;
        idades[1] = 16;


        //boolean

       /* System.out.println(ninja[1]);
        System.out.println(idades[0]);
        System.out.println(verdaderoFalso[0]);*/

        //redeclarações de arrays
        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Senju";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tsunade Senju";
        ninja[5] = "Kakashi Hataque";
        ninja[6] = "Naruto Uzumaki";

        //loop para percorrer array
        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }


    }
}
