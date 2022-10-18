package exercicios.Static;

public class Conta {
    //ATRIBUTOD DE CLASSE
    static int contador;
    int numero;
    //Construtor
    Conta() {
        Conta.contador++;
        this.numero = Conta.contador;
    }

    static void zerarContador() {
        Conta.contador = 0;
    }
}
