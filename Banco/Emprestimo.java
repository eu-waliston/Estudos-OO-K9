package Banco;


public class Emprestimo  extends  Servico{

    // EMPRESTIMO
    private double valor;
    private double taxa;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double claculaTaxaDeEmprestimo() {
        return this.valor * 0.1;
    }

    public double calculaTaxa() {
        return 5 +  this.valor * 0.1;
    }
}
