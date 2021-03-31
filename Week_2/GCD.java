import java.util.*;

public class GCD {
  private static int gcd(int a, int b){
    int remainder = a%b;
    if(remainder==0)
      return b;
    return gcd(b, remainder);
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    scanner.close();
    System.out.println(gcd(a, b));
  }
}
