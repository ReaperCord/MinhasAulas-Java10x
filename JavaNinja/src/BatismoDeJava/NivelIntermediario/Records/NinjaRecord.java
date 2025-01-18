package BatismoDeJava.NivelIntermediario.Records;

public record NinjaRecord(String nome, String email, int telefone) {





    @Override
    public String toString() {
        return "Ninja{" +
                "nome= " + nome + "\n"
                + "email= " + email + "\n"
                + "telefone= " + telefone +
                "}";
    }
}
