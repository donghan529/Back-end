package a1004;

import java.util.Scanner;

public class A1004_ex40 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("슬기가 던진 공의 위치>");
        float num1 = scanner.nextFloat();

        if (num1>= 50 && num1<=60) {
            System.out.println("win");
        } else {
            System.out.println("lose");
        }
        scanner.close();
    }
}
