package structured;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class Reader {
  private BufferedReader reader;

  public Reader(String path) throws FileNotFoundException {
    this.reader = new BufferedReader(new FileReader(path));
  }

  public FileContent read() throws IOException {
    FileContent content = new FileContent();

    content.setIntroduction(reader.readLine());

    String line = reader.readLine();
    while (line.trim().length() != 0) {
      String[] parts = line.split(": ");

      content.addToList(parts[0], parts[1]);

      line = reader.readLine();
    }

    content.setBody(reader.readLine());

    return content;
  }

  public static void main(String[] args) throws IOException {
    Reader reader = new Reader(Paths.get("resources", "data.txt").toString());

    System.out.println(reader.read());
  }
}