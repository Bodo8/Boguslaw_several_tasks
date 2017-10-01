package lineSum.lineSumTest;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import lineSum.FileProcessor;
import lineSum.FileReader;
import lineSum.FileSaver;
import lineSum.NumbersProcessor;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.util.Arrays;
import java.util.List;

public class FileProcessorTest {

  @Test
  public void fileProcessor() throws Exception {
    //given
    final NumbersProcessor numbersProcessor = mock(NumbersProcessor.class);
    final FileReader fileReader = mock(FileReader.class);
    final FileSaver fileSaver = mock(FileSaver.class);
    final FileProcessor fileProcessor = new FileProcessor(numbersProcessor, fileReader, fileSaver);
    ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);

    final String filePath = "src/main/resources/numberList.txt";
    String filePathSave = "src/main/resources/numbersAndSum.txt";
    final List<String> inputNumbers = Arrays.asList("1    2   3");

    when(fileReader.readFromFile(any(String.class))).thenReturn(inputNumbers);
    when(numbersProcessor.processNumbers(inputNumbers)).thenReturn(Arrays.asList("1+2+3"));

    //when
    List<String> result = fileProcessor.processFile(filePath, filePathSave);

    //then
    assertEquals("1+2+3", result.get(0));

    verify(numbersProcessor, times(1)).processNumbers(inputNumbers);
    verify(fileReader).readFromFile(captor.capture());
    verifyNoMoreInteractions(fileReader, numbersProcessor);

    String actualPath = captor.getValue();
    assertEquals(filePath, actualPath);
  }

}