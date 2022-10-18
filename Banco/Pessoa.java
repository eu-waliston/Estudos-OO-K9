package Banco;

public class Pessoa {
    String rg;
    int cpf;

    //Sobrecarga de construtores
    Pessoa(String rg) {
        this.rg = rg;
    }
    Pessoa(int cpf) {
        this.cpf = cpf;
    }
}
