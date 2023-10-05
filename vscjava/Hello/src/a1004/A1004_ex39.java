package a1004;

import java.util.Scanner;

public class A1004_ex39 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if(num1 < num2) {
            if(num1 <= num3){
                System.out.println(num1);
            } else {
                System.out.println(num3);
            }
        } else if(num2<=num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }
        scanner.close();
    }
}
