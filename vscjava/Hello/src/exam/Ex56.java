package exam;

import java.util.Scanner;

public class Ex56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 윷 상태(0: 뒤집어지지 않은 상태, 1: 뒤집어진 상태)");
        int num1 = sc.nextInt();
        System.out.println("두번째 윷 상태(0: 뒤집어지지 않은 상태, 1: 뒤집어진 상태)");
        int num2 = sc.nextInt();
        System.out.println("세번째 윷 상태(0: 뒤집어지지 않은 상태, 1: 뒤집어진 상태)");
        int num3 = sc.nextInt();
        System.out.println("네번째 윷 상태(0: 뒤집어지지 않은 상태, 1: 뒤집어진 상태)");
        int num4 = sc.nextInt();
        int sum = num1 + num2 + num3 + num4;
        if (sum == 4) {
            System.out.println("윷");
        } else if (sum == 3) {
            System.out.println("걸");
        } else if (sum == 2) {
            System.out.println("개");
        } else if (sum == 1) {
            System.out.println("도");
        } else if(sum==0) {
            System.out.println("모");
        } else {
            System.out.println("잘못입력했습니다.");
        }
    }
}
