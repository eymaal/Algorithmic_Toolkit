package Week_3;

import java.util.Scanner;

public class Change {
    private static int getChange(int amount) {
        int[] changeArray = new int[] {10,5,1};
        int count = 0;
        int temp = amount;
        for(int i = 0; i < 3; i++){
            if(temp<=0) break;
            count += (temp/changeArray[i]);
            temp -=  ((temp/changeArray[i])*changeArray[i]);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));
        scanner.close();
    }
}

