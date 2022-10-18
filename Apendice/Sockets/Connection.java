package Apendice.Sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Connection {
    ServerSocket serverSocket = new ServerSocket(1000);

    public Connection() throws IOException {
        while(true) {
            Socket socket = serverSocket.accept();
        }
    }


}
