package lineSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

  public List<String> readFromFile(String filePath) throws IOException {
    List<String> listLineStr = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new java.io.FileReader(filePath))) {
      while (br.ready()) {
        listLineStr.add(br.readLine());
      }
    }
    return listLineStr;
  }
}
