package structured;

import java.io.BufferedReader;
import java.io.IOException;

public abstract class StructuredReader {
  protected BufferedReader reader;

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
}
