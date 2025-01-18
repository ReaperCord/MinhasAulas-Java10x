package BatismoDeJava.NivelIntermediario.GettersAndSetters;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------------ Clan Uzumaki ------------------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", 16, 14,1.87);
        System.out.println("Nome do ninja: " + naruto.getNome());
        naruto.setNome("Naruto Namikaze Uzumaki");
        System.out.println("Nome do ninja: " + naruto.getNome());

        System.out.println("------------------ Clan Uchiha ------------------");
        Uchiha sasuke = new Uchiha("Sasuke", 16, 14, 1.85);
        System.out.println("Nome do ninja: " + sasuke.getNome());
        sasuke.setNome("Sasuke Uchiha");
        System.out.println("Nome do ninja: " + sasuke.getNome());



    }
}
