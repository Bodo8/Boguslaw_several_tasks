package fibonacci;

public class Fibonacci {

  long[] tabFibonac = new long[93];

  public long calculateFibonacci(int n) {
    tabFibonac[0] = 0;
    tabFibonac[1] = 1;
    long startTime = System.nanoTime();
    Long timeCount = 0L;
    for (int i = 2; i < 93; i++) {
      tabFibonac[i] = tabFibonac[i - 1] + tabFibonac[i - 2];
      long estimatedTime = timeCount + (System.nanoTime() - startTime);
      System.out.println("i= " + i + "," + " Fibo: " + tabFibonac[i] + " Time: " + estimatedTime);
    }

    if (n < 1 || n > 92) {
      return -1;
    } else {
      return tabFibonac[n];
    }
  }

  public static void main(String[] args) {
    long number = new Fibonacci().calculateFibonacci(52);
    System.out.println(number);
  }
}
