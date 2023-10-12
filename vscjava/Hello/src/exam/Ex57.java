package exam;

import java.util.Scanner;

public class Ex57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 메뉴를 고르세요.");
        int select1 = sc.nextInt();
        System.out.println("두 번째 메뉴를 고르세요.");
        int select2 = sc.nextInt();
        int[] food = { 400, 340, 170, 100, 70 };
        int total = food[select1-1]+food[select2-1];
        System.out.println(total);
        if(total>=500) {
            System.out.println("angry");
        } else if (total<=500) {
            System.out.println("no angry");
        }
        sc.close();
    }
}
