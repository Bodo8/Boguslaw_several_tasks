package lineSum.lineSumTest;

import static junit.framework.Assert.assertEquals;

import lineSum.NumbersProcessor;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class NumbersProcessorTest {

  @Test
  public void shouldReturn1plus2plu3equal6When123Passed() throws Exception {

    //given
    NumbersProcessor numbersProcessor = new NumbersProcessor();
    //final NumbersProcessor numbersProcessor = mock(NumbersProcessor.class);
    final List<String> inputNumbers = Arrays.asList("  1    2   3");
    ///when(numbersProcessor.processNumbers(inputNumbers)).thenReturn(Arrays.asList("1+2+3=6"));
    //when
    List<String> resultExpect = numbersProcessor.processNumbers(inputNumbers);

    //then
    assertEquals("1+2+3=6", resultExpect.get(0));
  }

  @Test
  public void shouldReturn353plus359plu367plus373equa1452When353space359spa367spa373Passed()
      throws Exception {
    //given
    NumbersProcessor numbersProcessor = new NumbersProcessor();
    final List<String> inputNumbers = Arrays.asList("  353       359  367     373 ");
    //when
    List<String> resultExpect = numbersProcessor.processNumbers(inputNumbers);
    //then
    assertEquals("353+359+367+373=1452", resultExpect.get(0));
  }

  @Test
  public void shouldReturn4943plus4951plu4957equa14851When4943space4951spa4957Passed()
      throws Exception {
    //given
    NumbersProcessor numbersProcessor = new NumbersProcessor();
    final List<String> inputNumbers = Arrays.asList("  4943    4951        4957 ");
    //when
    List<String> resultExpect = numbersProcessor.processNumbers(inputNumbers);
    //then
    assertEquals("4943+4951+4957=14851", resultExpect.get(0));
  }
}