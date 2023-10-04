package a1004;

import java.util.Scanner;

public class A1004_ex35 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("0~100 중 한 개 입력");
        int num = scanner.nextInt();
        int b = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1) {
                continue;
            }
            b += i;
        }
        System.out.println(b);
    }
}
