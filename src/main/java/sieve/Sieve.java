package sieve;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Sieve {

  public List<Integer> calculateSieve(int arraySize) {
    Integer[] tab = new Integer[arraySize];

    for (int i = 0; i < arraySize; i++) {
      tab[i] = i;
    }
    for (int x = 2; x < arraySize; x++) {
      int index = x;
      while (true) {
        index += x;
        if (index < arraySize) {
          tab[index] = -1;
        } else {
          break;
        }
      }
    }

    return Arrays.stream(tab).filter(number -> number > 1).collect(Collectors.toList());
  }

  public static void main(String... args) {
    new Sieve().calculateSieve(23);

  }
}
