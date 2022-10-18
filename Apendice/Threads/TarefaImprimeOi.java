package Apendice.Threads;

public class TarefaImprimeOi implements  Runnable{
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println("OI");
        }
    }
}
