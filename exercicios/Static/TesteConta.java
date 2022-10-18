package exercicios.Static;

public class TesteConta {
    public static void main(String[] args) {
        System.out.println(Conta.contador);
        Conta conta = new Conta();
        System.out.println("Numero da primeira conta: " + conta.numero);
        System.out.println(Conta.contador);
        Conta conta2 = new Conta();
        System.out.println("Numero da primeira conta: " + conta2.numero);
        System.out.println(Conta.contador);


        Conta.zerarContador();
        System.out.println(Conta.contador);
    }
}
