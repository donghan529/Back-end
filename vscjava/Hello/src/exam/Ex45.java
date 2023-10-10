package exam;

import java.util.Scanner;

public class Ex45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        double discriminant, root1, root2;

        System.out.print("이차방정식의 계수 a를 입력하세요: ");
        a = input.nextDouble();

        System.out.print("이차방정식의 계수 b를 입력하세요: ");
        b = input.nextDouble();

        System.out.print("이차방정식의 상수 c를 입력하세요: ");
        c = input.nextDouble();

        discriminant = b * b - (4 * a * c);

        if (discriminant > 0) {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("방정식의 해는  %.2f\n", root1);
            System.out.printf("방정식의 해는  %.2f\n", root2);
        } else if (discriminant == 0) {
            root1 = -b / (2 * a);
            System.out.println("방정식의 해는(중근) " + root1);
        } else {
            System.out.println("실근이 없습니다.");
        }

        input.close();
    }
}
