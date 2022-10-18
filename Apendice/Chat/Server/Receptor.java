package Apendice.Chat.Server;

import java.util.Scanner;

public class Receptor implements Runnable {
    private Scanner entrada;
    private Distribuidor distribuidor;


    public Receptor(Scanner entrada, Distribuidor distribuidor) {
        this.entrada = entrada;
        this.distribuidor = distribuidor;
    }


    public void aguardaMensagens() {

    }

    @Override
    public void run() {
        while (this.entrada.hasNextLine()) {
            String mensagem = this.entrada.nextLine();
            this.distribuidor.distribuiMensagem(mensagem);
        }
    }
}
