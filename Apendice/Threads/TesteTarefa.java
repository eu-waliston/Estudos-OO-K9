package Apendice.Threads;

public class TesteTarefa {
    public static void main(String[] args) {
        TarefaImprimeOi imprimeOi = new TarefaImprimeOi();
        TarefaSomaAte100 somaAte100 = new TarefaSomaAte100();

        Thread thread1 = new Thread(imprimeOi);
        Thread thread2 = new Thread(somaAte100);
        System.out.println(thread1);
        System.out.println(thread2);

        Thread threadOI = new Thread(thread1);
        Thread thread100 = new Thread(thread2);
        threadOI.start();
        thread100.start();

    }
}
