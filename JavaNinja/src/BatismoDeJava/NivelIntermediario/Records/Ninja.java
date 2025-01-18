package BatismoDeJava.NivelIntermediario.Records;

import java.util.Objects;

public class Ninja {
    private final String nome;
    private final String email;
    private final int telefone;


    public Ninja(String nome, String email, int telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

/*    public void setNome(String nome) {
        this.nome = nome;
    }*/

    public String getEmail() {
        return email;
    }

/*    public void setEmail(String email) {
        this.email = email;
    }*/

    public int getTelefone() {
        return telefone;
    }

/*    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }*/

    //core calsses assunto para proxiams aulas
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ninja ninja = (Ninja) o;
        return getTelefone() == ninja.getTelefone() && Objects.equals(getNome(), ninja.getNome()) && Objects.equals(getEmail(), ninja.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getEmail(), getTelefone());
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nome= " + nome + "\n"
                + "email= " + email + "\n"
                + "telefone= " + telefone +
                "}";
    }
}
