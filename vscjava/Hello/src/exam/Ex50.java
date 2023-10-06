package exam;

import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("신장을 입력하세요.");
        float num1 = scanner.nextFloat();
        System.out.println("몸무게를 입력하세요.");
        float num2 = scanner.nextFloat();
        float bmi = num2 / ((num1 / 100) * (num1) / 100);

        if (bmi < 18.5) {
            System.out.println("저체중");
        } else if (bmi >= 18.5 && bmi <= 23) {
            System.out.println("정상체중");
        } else if (bmi>23) {
            System.out.println("비만");
        }
        System.out.printf("%.1f", bmi);
    }
}
