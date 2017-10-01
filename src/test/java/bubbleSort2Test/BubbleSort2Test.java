package bubbleSort2Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import bubbleSort2.BubbleSort2;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class BubbleSort2Test {

  @Test
  public void shouldReturnSortArray13WhenTab13Passed() throws Exception {
    //given
    BubbleSort2 bubble = new BubbleSort2();
    ArrayList<Integer> testModel = new ArrayList<>(
        Arrays.asList(getArrayOfNumbersOfSize13ToSort()));
    Collections.sort(testModel);
    //when
    List<Integer> bubbleSortList = new ArrayList<>(
        bubble.sortArrayAndReturnSortedArrayList(getArrayOfNumbersOfSize13ToSort()));
    //than
    assertThat(testModel, is(bubbleSortList));
  }

  @Test
  public void shouldReturnSortArray15WhenTab15Passed() throws Exception {
    ///given
    BubbleSort2 bubble = new BubbleSort2();
    ArrayList<Integer> testModel = new ArrayList<>(
        Arrays.asList(getArrayOfNumbersOfSize15ToSort()));
    Collections.sort(testModel);
    //when
    List<Integer> bubbleSortList = new ArrayList<>(
        bubble.sortArrayAndReturnSortedArrayList(getArrayOfNumbersOfSize15ToSort()));
    //than
    assertThat(testModel, is(bubbleSortList));
  }

  public Integer[] getArrayOfNumbersOfSize13ToSort() {
    return new Integer[]{5, 8, 7, 24, 9, 12, 15, 3, 28, 41, 88, 53, 44};
  }

  public Integer[] getArrayOfNumbersOfSize15ToSort() {
    return new Integer[]{23, 24, 88, 302, 67, 34, 89, 99, 222, 456, 445, 778, 4578, 54, 77};
  }
}
