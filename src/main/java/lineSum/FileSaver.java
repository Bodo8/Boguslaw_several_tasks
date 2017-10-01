package lineSum;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileSaver {

  public void saveToFile(List<String> list, String filePathSave) throws IOException {

    for (int i = 0; i < list.size(); i++) {
      String listLineToSave = list.get(i);
      try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePathSave, true))) {
        writer.write(listLineToSave);
        writer.newLine();
      }
    }
  }
}
