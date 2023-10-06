package exam;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 문자를 입력 >");
        String str1 = scanner.next(); //next() -> space bar 인식
        System.out.print("두번째 문자를 입력 >");
        String str2 = scanner.next();

        System.out.print(str2+" "+str1);
        scanner.close();
    }
}
