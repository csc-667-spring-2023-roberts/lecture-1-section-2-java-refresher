package structured;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class SocketReader extends StructuredReader {
  public SocketReader(Socket socket) throws IOException {
    this.reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
  }
}
