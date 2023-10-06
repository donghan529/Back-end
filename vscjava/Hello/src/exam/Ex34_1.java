package exam;

import java.util.Scanner;

public class Ex34_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.print("숫자를 입력해주세요>");
            int num = sc.nextInt();
            if (num != 0) {
                System.out.println(num);
                continue;
            } else {
                System.out.println(num + " 종료");
                break;
            }
        }
        sc.close();
    }
}
