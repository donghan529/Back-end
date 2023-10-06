package exam;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력해주세요>");
        int n = scanner.nextInt();
        System.out.println("두번째 숫자를 입력해주세요>");
        int m = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.println(i + ", " + j);
            }
        }
        scanner.close();
    }
}
