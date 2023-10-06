package exam;

import java.util.Scanner;

public class Ex47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("년도를 입력하세요. ex)2012");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        } else {
            System.out.println("no");
        }
    }
}
