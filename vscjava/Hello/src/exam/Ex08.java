package exam;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        // 키보드로 입력한 정수값을 그대로 출력하는 프로그램을 작성해보자.

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str);
        scanner.close();
    }
}
