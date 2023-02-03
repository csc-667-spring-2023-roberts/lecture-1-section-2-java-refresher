package structured;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class Reader extends StructuredReader {

  public Reader(String path) throws FileNotFoundException {
    this.reader = new BufferedReader(new FileReader(path));
  }

  public static void main(String[] args) throws IOException {
    Reader reader = new Reader(Paths.get("resources", "data.txt").toString());

    System.out.println(reader.read());
  }
}