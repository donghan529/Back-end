package a1004;

import java.util.Scanner;

public class A1004_ex37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();

        for (int i = 0; i <= num1; i++) {
            for (int j = 0; j <= num1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
