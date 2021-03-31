import java.util.*;

public class FibonacciLastDigit {

    private static int getFibonacciLastDigitNaive(int n) {
        int prev = 0;
        int curr = 1;
        int next = 0;

        if(n<=1)
            return n;

        for(int i = 0;i < n-1; i++){
            next = (prev + curr) % 10;
            prev = curr;
            curr = next;
        }

        return next;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
        scanner.close();
    }
}
