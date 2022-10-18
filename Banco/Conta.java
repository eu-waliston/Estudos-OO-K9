package Banco;

abstract class Conta {
    double saldo;
    double limite;
    int numero;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    private double c;

    public Conta(double saldo, double limite, int numero) {
        this.saldo = saldo;
        this.limite = limite;
        this.numero = numero;
    }

    public Conta() {

    }

    boolean deposita(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    void imprimeExtrato() {

        // TODO  Logica para gerar um extrato dos ultimos 15 dias
        this.imprimeExtrato(15);
        System.out.println("----- Extrato -----");
        System.out.println("Saldo R$" + this.saldo);
        System.out.println("Limite R$" + this.limite);
    }

    void imprimeExtrato(int dias) {
        // TODO  Logica para gerar um extrato com uma quantidade variavel de dias
    }

    void tranfere(double valor) {
        this.saldo -= valor;
    }

    public void saca(double valor) {
        this.saldo += valor;
        this.descontoTarifa();
    }
    private double descontoTarifa() {
        this.saldo -= 0.1;
        return 0;
    }


    public abstract void imprimirExtrastoDEtalhado();

}
