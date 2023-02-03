package structured;

import java.util.HashMap;
import java.util.Map;

public class FileContent {
  private String introduction;
  private Map<String, String> list;
  private String body;

  public FileContent() {
    this.list = new HashMap<String, String>();
  }

  public void setIntroduction(String newIntroduction) {
    this.introduction = newIntroduction;
  }

  public void addToList(String key, String value) {
    this.list.put(key, value);
  }

  public void setBody(String newBody) {
    this.body = newBody;
  }

  @Override
  public String toString() {
    StringBuffer buffer = new StringBuffer();

    buffer.append(String.format("%s\n", this.introduction));

    this.list.entrySet().forEach(entry -> {
      buffer.append(String.format("%s: %s\n", entry.getKey(), entry.getValue()));
    });

    buffer.append("\n");

    if (this.body != null) {
      buffer.append(this.body);
    }

    return buffer.toString();
  }

  public static void main(String[] args) {
    FileContent content = new FileContent();
    content.setIntroduction("hello cruel world");
    content.addToList("hi", "you");
    content.setBody("This is the body");

    System.out.println(content);
  }
}
