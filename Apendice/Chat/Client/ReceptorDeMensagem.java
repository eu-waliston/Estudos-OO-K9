package Apendice.Chat.Client;

import java.util.Scanner;

public class ReceptorDeMensagem {
    private Scanner entrada;
    private TelaBKTChat telaK19Chat;

    public ReceptorDeMensagem(Scanner entrada, TelaBKTChat telaK19Chat) {
        this.entrada = entrada;
        this.telaK19Chat = telaK19Chat;
    }

    public void run() {
        while (this.entrada.hasNextLine()) {
            String mensagem = this.entrada.nextLine();
            this.telaK19Chat.adicionaMensagem(mensagem);
        }
    }

    public void aguardaMensagem() {

    }
}
