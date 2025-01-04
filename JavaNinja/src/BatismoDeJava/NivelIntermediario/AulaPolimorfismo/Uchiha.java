package BatismoDeJava.NivelIntermediario.AulaPolimorfismo;

public class Uchiha extends Ninja {

    String clan;

    public void sharinganAtivado(){
        String Sharingan = "Sharingan!";
        System.out.println(Sharingan);
    }

    @Override
    public void ninjutsu() {
        System.out.println("meu nome é "+ nome + " " + clan + " " + "Jutso! BOLA DE FOGO!!!");
    }
}
