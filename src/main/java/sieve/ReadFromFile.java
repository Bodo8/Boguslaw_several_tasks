package sieve;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class ReadFromFile {


  public static void main(String[] args) throws FileNotFoundException {
    List<Integer> fileData = new ArrayList<>();

    try (Scanner scan = new Scanner(new File("src/main/resources/numberList.txt"))) {
      while (scan.hasNextInt()) {
        fileData.add(scan.nextInt());
        System.out.println(fileData);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}