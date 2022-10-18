package exercicios.encapsulamento;

public class Teste {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();

        func.setNome("Osvaldo");
        func.setSalario(11.200);

        System.out.println(func.getNome());
        System.out.println(func.getSalario());

    }
}
