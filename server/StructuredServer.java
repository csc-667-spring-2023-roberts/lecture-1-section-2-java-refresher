package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import structured.FileContent;
import structured.SocketReader;

public class StructuredServer {
  public static void main(String[] args) throws IOException {
    ServerSocket server = new ServerSocket(9876);
    System.out.println("Server started...");

    Socket socket = server.accept();
    System.out.println("Received connection...");

    FileContent content = new SocketReader(socket).read();

    System.out.println(content);

    server.close();
  }
}
