package exam;

import java.util.Scanner;

public class Ex46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tunnelH1 = sc.nextInt();
        int tunnelH2 = sc.nextInt();
        int tunnelH3 = sc.nextInt();
        int[] tunnelHArray = { tunnelH1, tunnelH2, tunnelH3 };

        for (int i = 0; i < tunnelHArray.length; i++) {
            if (tunnelHArray[i] <= 170) {
                System.out.println("PASS");
            } else {
                System.out.println("CRASH");
            }
        }
        sc.close();
    }
}
