import java.util.HashMap;
import java.util.Scanner;

public class Fibonacci {
  static HashMap<Integer, Long> fibonacciMap = new HashMap<>();
  public static void initMap(){
    fibonacciMap.put(0, Long.valueOf(0));
    fibonacciMap.put(1, Long.valueOf(1));
  }
  private static long calcFib(int n) {
    if(fibonacciMap.containsKey(n))
      return fibonacciMap.get(n);
     
    Long tempValue = calcFib(n - 1) + calcFib(n - 2);
    fibonacciMap.put(n, tempValue)  ;
    return tempValue;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    initMap();
    System.out.println(calcFib(n));
    in.close();
  }
}
