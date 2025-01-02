package NivelIntermediario;

public class Main {
    public static void main(String[] args) {


        //Criar ninja a partir de classeNinja
        Ninja Naruto = new Ninja();
            Naruto.nomeNinja = "Naruto";
            Naruto.aldeiaNinja = "Konoha";
            Naruto.clanNinja = "Uzumaki";
            Naruto.rankNinja = "Gennin";
            Naruto.idadeNinja = 16;

        Ninja Sasuke = new Ninja();
            Sasuke.nomeNinja = "Sasuke";
            Sasuke.aldeiaNinja = "Konoha";
            Sasuke.clanNinja = "Uchiha";
            Sasuke.rankNinja = "Gennin";
            Sasuke.idadeNinja = 16;

            //usando metodos
            String chamandoMetodos = Sasuke.EuSouUmNinja();
            System.out.println(chamandoMetodos);

            //metodos com parametros
            int tempoParaHokage = Sasuke.anosParaSerHokage(70);
            System.out.println("Você tem: " + Sasuke.idadeNinja + ", então falta no mínimo: " + tempoParaHokage + " anos para você se tornar um hokage");



        Ninja Sakura = new Ninja();
            Sakura.nomeNinja = "Sakura";
            Sakura.aldeiaNinja = "Konoha";
            Sakura.clanNinja = "Haruno";
            Sakura.rankNinja = "Gennin";
            Sakura.idadeNinja = 16;

        Ninja Kakashi = new Ninja();
            Kakashi.nomeNinja = "Kakashi";
            Kakashi.aldeiaNinja = "Konoha";
            Kakashi.clanNinja = "Hatake";
            Kakashi.rankNinja = "Jounin";
            Kakashi.idadeNinja = 32;

    }
}
