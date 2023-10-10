package exam;

import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 1~7");
        int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("enjoy");
            } else if (num % 2 == 1) {
                System.out.println("oh my god");
            } else {
                System.out.println("1~7값 입력하세요.");
            }
        // switch (num) {
        //     case 1:
        //         System.out.println("oh my god");
        //         break;
        //     case 2:
        //         System.out.println("enjoy");
        //         break;
        //     case 3:
        //         System.out.println("oh my god");
        //         break;
        //     case 4:
        //         System.out.println("enjoy");
        //         break;
        //     case 5:
        //         System.out.println("oh my god");
        //         break;
        //     case 6:
        //         System.out.println("enjoy");
        //         break;
        //     case 7:
        //         System.out.println("oh my god");
        //         break;
        //     default:
        //         System.out.println("1~7값 입력하세요.");
        // }
        sc.close();
    }
}
