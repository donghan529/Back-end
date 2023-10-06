package exam;

import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        /*
         * 정수가 순서대로 입력된다.
         * (-2147483648 ~ 2147483647, 단 개수는 알 수 없다.)
         * 
         * 0이 아니면 입력된 정수를 출력하고
         * 0이 입력되면 출력을 중단해보자.
         */
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("숫자를 입력해주세요>");
            int num = scanner.nextInt();
            if (num != 0) {
                System.out.println(num);
                continue;
            } else {
                System.out.println(num + "종료");
                break;
            }
        }
        scanner.close();
    }
}
