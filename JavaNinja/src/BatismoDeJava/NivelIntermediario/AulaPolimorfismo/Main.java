package BatismoDeJava.NivelIntermediario.AulaPolimorfismo;

public class Main {
    public static void main(String[] args) {

        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto";
        Naruto.clan = "Uzumaki";
        Naruto.idade = 16;
        Naruto.reservaDeChakara();
        Naruto.ninjutsu();

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke";
        Sasuke.clan = "Uchiha";
        Sasuke.idade = 16;
        Sasuke.sharinganAtivado();
        Sasuke.ninjutsu();


    }
}
