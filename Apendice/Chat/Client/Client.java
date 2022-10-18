package Apendice.Chat.Client;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("IP DO SERVIDOR", 10000);

        PrintStream saida = new PrintStream(socket.getOutputStream());

        Scanner entrada = new Scanner(socket.getInputStream());

        EmissorDeMensagem emissor = new EmissorDeMensagem(saida);
        TelaBKTChat TelaBKTChat = new TelaBKTChat(emissor);
        ReceptorDeMensagem receptor = new ReceptorDeMensagem(entrada, TelaBKTChat);
        Thread pilha = new Thread((Runnable) receptor);


        pilha.start();

    }
}