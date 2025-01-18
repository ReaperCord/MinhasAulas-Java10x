package BatismoDeJava.NivelIntermediario.Generics.ExemploDoPorquePrecisa;

public class Main {
    public static void main(String[] args) {

        Kunai kunai1 = new Kunai("Normal");
        Kunai kunai2 = new Kunai("Explosiva");
        Kunai kunai3 = new Kunai("Agua");

        BolsaKunai bolsaKunai = new BolsaKunai();
        bolsaKunai.adicionarKunai(kunai1);
        bolsaKunai.adicionarKunai(kunai2);
        bolsaKunai.adicionarKunai(kunai3);

        System.out.println(bolsaKunai);


    }
}
