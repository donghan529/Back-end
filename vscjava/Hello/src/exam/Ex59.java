package exam;

import java.util.Scanner;

public class Ex59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();
        int num6 = sc.nextInt();
        int num7 = sc.nextInt();
        System.out.println("----------------------------");
        int lottoNum1 = sc.nextInt();
        int lottoNum2 = sc.nextInt();
        int lottoNum3 = sc.nextInt();
        int lottoNum4 = sc.nextInt();
        int lottoNum5 = sc.nextInt();
        int lottoNum6 = sc.nextInt();
        int[] lotto = { num1, num2, num3, num4, num5, num6, num7 };
        int[] lottoNum = { lottoNum1, lottoNum2, lottoNum3, lottoNum4, lottoNum5, lottoNum6 };
        int total = 0;
        int bns = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (lotto[i] == lottoNum[j]) {
                    total++;
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            if (lotto[6] == lottoNum[i]) {
                bns++;
            }
        }
        if (total == 6) {
            System.out.println("1등");
        } else if (total == 5 && bns == 1) {
            System.out.println("2등");
        } else if (total == 5 && bns == 0) {
            System.out.println("3등");
        } else if (total == 4) {
            System.out.println("4등");
        } else if (total == 3) {
            System.out.println("5등");
        } else if (total <= 2) {
            System.out.println("꽝");
        }

    }
}
