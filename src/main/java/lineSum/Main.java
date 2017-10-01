package lineSum;

import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    String filePath = "src/main/resources/numberList.txt";
    String filePathSave = "src/main/resources/numbersAndSum.txt";
    new FileProcessor(new NumbersProcessor(), new FileReader(), new FileSaver())
        .processFile(filePath, filePathSave);
//        processedLines.forEach(System.out::println);
//        new FileSaver().saveToFile(processedLines, filePathSave);
  }
}