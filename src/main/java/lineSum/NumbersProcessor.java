package lineSum;

import java.util.ArrayList;
import java.util.List;

public class NumbersProcessor {


  public List<String> processNumbers(List<String> linesFromContainingNumbers) {
    List<String> results = new ArrayList<>();
    for (String line : linesFromContainingNumbers) {
      results.add(processLine(line));
    }
    return results;
  }

  private String processLine(String line) {
    List<Integer> integerFromLine = new ArrayList<>();

    String result = "";
    int sum = 0;
    for (String number : line.split("[ ]+")) {
      if ("".equals(number)) {
        continue;
      }
      Integer value = Integer.valueOf(number);
      sum += value;
      result += value + "+";
    }
    return result.substring(0, result.length() - 1) + "=" + sum;

  }

}


