package sieveTest;//import static org.junit..Assert.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import sieve.Sieve;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("deprecation")
@RunWith(JUnitParamsRunner.class)
public class SieveTest {

  @Test
  @Parameters(method = "parameters")
  public void calculateSieve(int arraySize, List<Integer> expected) throws Exception {
    ///given

    //when
    List<Integer> given = new Sieve().calculateSieve(arraySize);

    //than
    assertThat(given, is(expected));
  }


  private Object parameters() throws FileNotFoundException {
    return new Object[]{
        new Object[]{10, Arrays.asList(2, 3, 5, 7)},
        new Object[]{30, Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)},
        new Object[]{104730, (get_10000_PrimeNumbers())}
    };
  }

  private List<Integer> get_10000_PrimeNumbers() throws FileNotFoundException {
    List<Integer> fileData = new ArrayList<>();
    try (Scanner scann = new Scanner(new File("src/main/resources/numberList.txt"))) {

      while (scann.hasNextInt()) {
        fileData.add(scann.nextInt());
      }
    }
    return fileData;
  }
}