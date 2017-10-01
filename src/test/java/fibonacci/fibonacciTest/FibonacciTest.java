package fibonacci.fibonacciTest;

import static org.junit.Assert.assertEquals;

import fibonacci.Fibonacci;
import org.junit.Test;


public class FibonacciTest {

  @Test
  public void shouldReturn2When3Passed() throws Exception {
    long number = new Fibonacci().calculateFibonacci(3);
    assertEquals(2, number);
  }

  @Test
  public void shouldReturnMinusOneWhen0Passed() throws Exception {
    long number = new Fibonacci().calculateFibonacci(0);
    assertEquals(-1, number);
  }

  @Test
  public void shouldReturn6765When19Passed() throws Exception {
    long number = new Fibonacci().calculateFibonacci(20);
    assertEquals(6765, number);
  }

  @Test
  public void shouldReturn1779979416004714189When89Passed() throws Exception {
    long number = new Fibonacci().calculateFibonacci(89);
    assertEquals(1779979416004714189L, number);
  }

  @Test
  public void shouldReturn7540113804746346429When92Passed() throws Exception {
    long number = new Fibonacci().calculateFibonacci(92);
    assertEquals(7540113804746346429L, number);
  }
}