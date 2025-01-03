package BatismoDeJava.NivelIntermediario.POO;


public class Main {

    public static void main(String[] args) {
        //Criar ninja a partir de classeNinja
        /*Ninja Naruto = new Ninja();
        Naruto.nomeNinja = "Naruto";
        Naruto.aldeiaNinja = "Aldeia";
        Naruto.idadeNinja = 16;*/

        /*Ninja Sasuke = new Ninja();
        Sasuke.nomeNinja = "Sasuke";
        Sasuke.aldeiaNinja = "Aldeia";
        Sasuke.idadeNinja = 16;*/

        /*Ninja Sakura = new Ninja();
        Sakura.nomeNinja = "Sakura";
        Sakura.aldeiaNinja = "Aldeia";
        Sakura.idadeNinja = 16;*/

        /*Ninja Kakashi = new Ninja();
        Kakashi.nomeNinja = "Kakashi";
        Kakashi.aldeiaNinja = "Aldeia";
        Kakashi.idadeNinja = 32;*/


        // Construindo com um clan separadamente
        Uchiha Sasuke = new Uchiha();
        Sasuke.aldeiaNinja = "Folha";
        Sasuke.idadeNinja = 16;
        Sasuke.SharinganAtivado();

        Uzumaki Naruto = new Uzumaki();
        Naruto.nomeNinja = "Naruto";
        Naruto.aldeiaNinja = "Folha";
        Naruto.idadeNinja = 16;
        Naruto.ReservaDeChakara();

        Haruno Sakura = new Haruno();
        Sakura.nomeNinja = "Sakura";
        Sakura.aldeiaNinja = "Folha";
        Sakura.idadeNinja = 16;

        Hyuga Hinata = new Hyuga();
        Hinata.nomeNinja = "Hinata";
        Hinata.aldeiaNinja = "Folha";
        Hinata.idadeNinja = 16;
        Hinata.Byakugan();

        Hatake Kakashi = new Hatake();
        Kakashi.nomeNinja = "Kakashi";
        Kakashi.aldeiaNinja = "Folha";
        Kakashi.idadeNinja = 32;
        Kakashi.SharinganDa25DeMarco();













    }
}
