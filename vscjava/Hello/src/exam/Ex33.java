package exam;

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        /*
         * 월을 나타내는 정수 한개(1~12)가 입력될 때 계절이 출력되도록 해보자.
         * 예
         * 월 : 계절
         * 12, 1, 2 : winter
         * 3, 4, 5 : spring
         * 6, 7, 8 : summer
         * 9, 10, 11 : fall
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("원하시는 달을 입력하세요>");
        int month = scan.nextInt();
        // switch (month) {
        // case 12:
        // case 1:
        // case 2:
        // System.out.println("winter");
        // break;
        // case 3:
        // case 4:
        // case 5:
        // System.out.println("spring");
        // break;

        // case 6:
        // case 7:
        // case 8:
        // System.out.println("summer");
        // break;

        // case 9:
        // case 10:
        // case 11:
        // System.out.println("fall");
        // break;
        if (month == 3 || month==4 || month == 5) {
            System.out.println("spring");
        } else if (month == 6 || month ==7 || month == 8) {
            System.out.println("summer");
        } else if (month ==9 || month ==10 || month ==11) {
            System.out.println("fall");
        } else {
            System.out.println("winter");
        }
        System.out.println("------------------------------------");
        if (month >= 3 && month <= 5) {
            System.out.println("spring");
        } else if (month >= 6 && month <= 8) {
            System.out.println("summer");
        } else if (month >=9 && month <=11) {
            System.out.println("fall");
        } else {
            System.out.println("winter");
        }
        scan.close();
    }

}
