import java.util.Scanner;

class SumOfTwo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] numList = input.split(" ");
        System.out.println(Integer.parseInt(numList[0]) + Integer.valueOf(numList[1]));
        sc.close();
    }
}