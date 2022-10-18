package exercicios.oo;

public class Conta {
    double saldo;
    Agencia agencia;

    void depositar(double valor) {
        this.saldo += valor;
    }

    void sacar(double valor) {
        this.saldo -= valor;
    }

    void imprimeExtrato() {
        System.out.println("---- Extrato da Conta -----");
        System.out.println("Saldo R$" + saldo);
    }

    void tranfere(double valor) {
        this.saldo -= valor;
    }
}
