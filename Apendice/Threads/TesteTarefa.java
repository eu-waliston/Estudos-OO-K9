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

        //Controlando a eecução das tarefas
        //A clasase thread conta com um set de metodos para controlar a ordem da execução das nossas tarefas

        //Sleep()
        //Durante a execução de uma tarefa, ao usar o sleep(), a mesma ficara pausada pelo tempo que for passado para o mesmo
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }

        //Thread.start();
        //join()
        //Uma tarefa pode pedir para esperar o termino de outra thread para continuar a execução atraves do método join()
        //try {
        //    Thread.join();
        //} catch (InterruptedException e) {
        //
        //}


    }
}
