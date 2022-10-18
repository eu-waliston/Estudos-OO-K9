package exercicios.Static;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionarios funcionarios = new Funcionarios();
        int piso = funcionarios.pisoSalarial = 520;
        int reajuste = funcionarios.reajusteSalarial();
        System.out.println("O Piso salaral do Fncionario é: R$" + piso);
        System.out.println("O reajuste será de : R$" + reajuste);

    }
}
