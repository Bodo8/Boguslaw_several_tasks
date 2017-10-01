package lineSum;


import java.io.IOException;
import java.util.List;

public class FileProcessor {

  private final NumbersProcessor processor;
  private final FileReader fileReader;
  private final FileSaver fileSaver;

  public FileProcessor(NumbersProcessor processor, FileReader fileReader, FileSaver fileSaver) {
    this.processor = processor;
    this.fileReader = fileReader;
    this.fileSaver = fileSaver;
  }

  public List<String> processFile(String filePath, String filePathSave) throws IOException {
    List<String> lines = fileReader.readFromFile(filePath);
    List<String> saveList = processor.processNumbers(lines);
    //fileSaver.saveToFile(saveList, filePathSave);
    return saveList;
  }

}
