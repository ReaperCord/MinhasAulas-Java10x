package Desafios.Desafio5;

public abstract class ContaBancaria {
    String nome;
    String tipoConta;
    double saldo;


    public ContaBancaria() {
    }

    public ContaBancaria(String nome, String tipoConta, double saldo) {
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.nome = nome;
    }



    public String verNome() {
        return nome;
    }

    public String verificarSaldo() {
        return "Saldo: " + this.saldo;
    }

    public String verTipoConta() {
        return tipoConta;
    }

}
