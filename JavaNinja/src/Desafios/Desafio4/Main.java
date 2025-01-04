package Desafios.Desafio4;

public class Main {

    public static void main(String[] args) {

        NinjaBasico Naruto = new NinjaBasico("Naruto Uzumaki", "Aldeia da Folha", 16);
        Naruto.mostrarInformacoes();
        Naruto.executarHabilidade();


        NinjaAvancado Kakashi = new NinjaAvancado("Kakashi Hatake", "Aldeia da Folha", 28, "Jounin", 53);
        Kakashi.mostrarInformacoes();
        Kakashi.executarHabilidade();



    }

}
