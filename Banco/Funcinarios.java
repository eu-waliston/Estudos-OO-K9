package Banco;

public class Funcinarios {
    String nome;
    double salario;
    static double pisoSalarial;

    void aumentoSalario(double aumento) {
        this.salario += aumento;
    }

    //Para acessar um atributo de classe usamos o nome da classe que o mesmo fora declarad
    //Funcionarios.pisosalari8al = 2000;

    static void reajustePisoSalarial(double taxa) {
        Funcinarios.pisoSalarial += Funcinarios.pisoSalarial * taxa;
    }

    //Pra acessar tambem usamos
    //Funcionario.reajustaPisoSalarial(0.1);
}
