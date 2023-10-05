package a1004;

import java.util.Scanner;

public class A1004_ex34_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] num = new int[size];

        for (int i = 0; i < num.length; i++) {

            num[i] = scanner.nextInt();
            
        }

        for (int i = 0; i < num.length; i++) {

            System.out.println(num[i]);

        }
        scanner.close();
    }
}
