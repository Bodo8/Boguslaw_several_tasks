package bubbleSort2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BubbleSort2 {

  public List<Integer> sortArrayAndReturnSortedArrayList(Integer[] tab) {
    int min = 0;
    int controlPlace = 0;
    for (int i = tab.length; i > 0; i--) {

      for (int j = 0; j < ((tab.length - 1) - controlPlace); j++) {
        swapPlaceTabToSort(tab, j);
      }
      controlPlace++;
    }
    return Arrays.stream(tab).collect(Collectors.toList());
  }

  private void swapPlaceTabToSort(Integer[] tab, int j) {
    int x1 = tab[j];
    int x2 = tab[j + 1];
    if (x1 > x2) {
      tab[j] = x2;
      tab[j + 1] = x1;
    }
  }
}


