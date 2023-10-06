package exam;

import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        /* 정수 한 개를 입력받아 1 부터 그 수까지 짝수의 합을 구해보자. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요>");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                sum += i;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("입력한 숫자는 1부터 " + sum + "까지 더한수: " + sum);
        scanner.close();

    }
}
