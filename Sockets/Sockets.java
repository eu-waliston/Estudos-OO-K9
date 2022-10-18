package Sockets;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Sockets {
    Socket socket = new Socket ("184.72.247119", 1000);
    PrintStream saida = new PrintStream(socket.getOutputStream());
    Scanner entrada = new Scanner(socket.getInputStream());

    public Sockets() throws IOException {
    }


    ServerSocket serverSocket = new ServerSocket(1000);
    Socket socketF2 = serverSocket.accept();


}
