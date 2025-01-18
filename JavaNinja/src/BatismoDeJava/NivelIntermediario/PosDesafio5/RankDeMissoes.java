package BatismoDeJava.NivelIntermediario.PosDesafio5;

public enum RankDeMissoes {
    D("Nivel baixo", 2),
    C("Confortavel", 3),
    B("Moderado", 4),
    A("Alto", 5),
    S("Suicida", 12);

    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

}
