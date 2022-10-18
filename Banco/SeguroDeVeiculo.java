package Banco;



public class SeguroDeVeiculo  extends Servico{

    //SEGURO DE VEICULO
    private Veiculo veiculo;
    private double valorDoSeguroDeVeiculo;
    private double franquia;

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public double getValorDoSeguroDeVeiculo() {
        return valorDoSeguroDeVeiculo;
    }

    public void setValorDoSeguroDeVeiculo(double valorDoSeguroDeVeiculo) {
        this.valorDoSeguroDeVeiculo = valorDoSeguroDeVeiculo;
    }

    public double getFranquia() {
        return franquia;
    }

    public void setFranquia(double franquia) {
        this.franquia = franquia;
    }

    public double calculaTaxa() {
       return 5 + this.veiculo.getValor() * 0.05;
    }
}
