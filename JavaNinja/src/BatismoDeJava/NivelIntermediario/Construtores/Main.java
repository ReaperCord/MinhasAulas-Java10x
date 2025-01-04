package BatismoDeJava.NivelIntermediario.Construtores;

public class Main {

    public static void main(String[] args) {

        //no args constructor
        /*Hokages Hashirama = new Hokages();
        Hashirama.nome = "Hashirama";
        Hashirama.idade = 74;
        Hashirama.vivoMorto = false;*/

        //all args constructor
        Hokages Tobirama = new Hokages("Tobirama Senju", "Aldeia da Folha", 1.80, 45, false);
        System.out.println(Tobirama.nome + "\n" + Tobirama.aldeia + "\n" + Tobirama.idade + "\n" + Tobirama.altura + "\n" + Tobirama.vivoMorto + "\n");
    }
}
