package BatismoDeJava.NivelIntermediario.PosDesafio5;

public class Main {
    public static void main(String[] args) {

        //OBJ uzumaki
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 16, 12,NivelNinja.GENIN);
        naruto.imprimirNinja(naruto);
        naruto.ataqueEspecial();
        naruto.tacarKunai();
        naruto.inteligenciaDeCombate(162);


        //OBJ uchiha
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 16, 12,NivelNinja.GENIN);
        sasuke.imprimirNinja(sasuke);
        sasuke.ataqueEspecial();
        sasuke.tacarKunai();
        sasuke.inteligenciaDeCombate(144);




        // missoes

        Missoes missao1 = new Missoes("Resgate de cachorro", RankDeMissoes.D);
        missao1.exibirDetalhes();

        Missoes missao2 = new Missoes("Derrotar o demônio da nevoa oculta", RankDeMissoes.A);
        missao2.exibirDetalhes();



    }
}
