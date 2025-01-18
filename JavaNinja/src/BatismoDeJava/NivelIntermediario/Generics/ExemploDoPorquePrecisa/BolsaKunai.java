package BatismoDeJava.NivelIntermediario.Generics.ExemploDoPorquePrecisa;

import java.util.ArrayList;
import java.util.List;

public class BolsaKunai {
    private List<Kunai> kunais;

    public BolsaKunai() {
        kunais = new ArrayList<>();
    }

    public void adicionarKunai(Kunai kunai) {
        kunais.add(kunai);
    }

    public List<Kunai> getKunais() {
        return kunais;
    }

    public void setKunais(List<Kunai> kunais) {
        this.kunais = kunais;
    }

    public void removerKunai(Kunai kunai) {
        kunais.remove(kunai);
    }

    @Override
    public String toString() {
        return "Bolsa de kunais: " + kunais.toString();
    }

}
