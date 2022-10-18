package exercicios.Static;

public class Funcionarios {

    int pisoSalarial;

     int  reajusteSalarial() {
        double ajuste = (pisoSalarial / 100) * 0.5;

        return (int) ajuste;
    }
}
