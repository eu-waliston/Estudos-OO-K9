package Apendice.Threads;

public class TarefaSomaAte100 implements Runnable {
    @Override
    public void run() {
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i;
        }
        System.out.println(soma);
    }
}
