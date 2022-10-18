package exercicios.oo;

public class Fatura {
    double total;

    void adiciona(double valor ) {
        this.total += valor;
    }

    double calcMulta() {
        return this.total * 0.2;
    }

    void imprimiDados() {
        System.out.println("Total: " + this.total);
    }
}
