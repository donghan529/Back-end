package exam;

import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt() - 30;

            if (num2 < -1) {
                System.out.println((num1 - 1) + " " + (num2 + 60));
            } else {
                System.out.println(num1 + " " + num2);
            }
        

    }
}
