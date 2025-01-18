package BatismoDeJava.NivelIntermediario.Records;

public class Main {
    public static void main(String[] args) {

        Ninja cadastro1 = new Ninja("Naruto Uzumaki", "naruto@konoha.com", 33341232);
        System.out.println(cadastro1);
        System.out.println("Nome do cadastro: " + cadastro1.getNome());

        System.out.println("_____________________ Agora com records ____________________");
        NinjaRecord sasuke = new NinjaRecord("Sasuke Uchiha", "sasuke@konoha.com", 999999);
        System.out.println(sasuke);
        System.out.println("Nome cadastrado: " + sasuke.nome());


    }
}
