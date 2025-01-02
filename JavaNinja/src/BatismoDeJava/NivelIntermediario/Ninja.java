package BatismoDeJava.NivelIntermediario;

//CRIANDO CA CLASSE
public class Ninja {

    String nomeNinja;
    String aldeiaNinja;
    String clanNinja;
    String rankNinja;
    int idadeNinja;


    //CRIANDO UM METODO PUBLICO PERSONALIZADO
    public void SharinganAtivado() {
        System.out.println("O Sharingan Ativou!");
    }

    //metodo que sempre vai retornar uma string

    public String EuSouUmNinja() {
        return "Oi, eu sou um Ninja";
    }

    //metodos com parametros
    public int anosParaSerHokage (int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - idadeNinja;
    }

}
