package Apendice.Exercicios.Server;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10000);

        Scanner entrada = new Scanner(socket.getInputStream());

        String linha = entrada.nextLine();

        System.out.println(linha);

    }
}
