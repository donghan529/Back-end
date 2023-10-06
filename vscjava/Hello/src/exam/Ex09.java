package exam;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        // 키보드로 입력한 정수값을 그대로 출력하는 프로그램을 작성해보자.

        Scanner scanner = new Scanner(System.in);
        float num1 = scanner.nextFloat();
        System.out.print(num1);
        double num2 = scanner.nextDouble(); //double형 실수
        System.out.print(num2);
        scanner.close();
    }
}
