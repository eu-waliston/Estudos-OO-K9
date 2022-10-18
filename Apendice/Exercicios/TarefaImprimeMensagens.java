package Apendice.Exercicios;

public class TarefaImprimeMensagens implements Runnable {

    //Defina uma tarefa para imprimir mensagens na tela.
    private String msg;

    public TarefaImprimeMensagens(String msg) {
        this.msg = msg;
    }

    public void run() {
        for (int i = 0; i < 100000; i++) {
            System.out.println(i + " : " + this.msg);
        }
    }

    public static void main(String[] args) {
        //Crie tarefas e associe-as com threads para executá-las.
        TarefaImprimeMensagens tarefa1 = new TarefaImprimeMensagens("K19");
        TarefaImprimeMensagens tarefa2 = new TarefaImprimeMensagens("Java");
        TarefaImprimeMensagens tarefa3 = new TarefaImprimeMensagens("Web");
        Thread thread1 = new Thread(tarefa1);
        Thread thread2 = new Thread(tarefa2);
        Thread thread3 = new Thread(tarefa3);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
