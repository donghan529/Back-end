package exam;

import java.util.Scanner;

public class Ex46_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] tunnelHArray = new int[3];

        for (int i = 0; i <= 2; i++) {
            tunnelHArray[i] = sc.nextInt();
            if (tunnelHArray[i] <= 170) {
                System.out.println("PASS");
            } else {
                System.out.println("CRASH");
            }
        }
        sc.close();
    }
}
