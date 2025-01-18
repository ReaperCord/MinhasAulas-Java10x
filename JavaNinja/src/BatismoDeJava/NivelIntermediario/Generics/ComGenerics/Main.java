package BatismoDeJava.NivelIntermediario.Generics.ComGenerics;

public class Main {
    public static void main(String[] args) {

        EquipamentosNinja Kunai1 = new EquipamentosNinja("Kunai de ferro");
        EquipamentosNinja Kunai2 = new EquipamentosNinja("Kunai explosiva");
        EquipamentosNinja Shuriken = new EquipamentosNinja("Shuriken de ferro");
        EquipamentosNinja Pergaminho = new EquipamentosNinja("Pergaminho de invocação");

        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.adicionarEquipamento(Kunai1);
        bolsaGenerica.adicionarEquipamento(Kunai2);
        bolsaGenerica.adicionarEquipamento(Shuriken);
        bolsaGenerica.adicionarEquipamento(Pergaminho);

        System.out.println(bolsaGenerica);

    }
}
