package BatismoDeJava.NivelIntermediario.Generics.ComGenerics;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {

    private List<T> equipamentos;

    //Construtores
    public BolsaGenerica() {
        equipamentos = new ArrayList<T>();
    }

    public BolsaGenerica(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    //metodos
    public void adicionarEquipamento(T equipamentoGenerico) {
        equipamentos.add(equipamentoGenerico);
    }

    //G&S
    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString() {
        return "Bolsa de equipamentos: " + equipamentos.toString();
    }
}
