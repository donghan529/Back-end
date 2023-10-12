package exam;

import java.util.Scanner;

public class Ex59_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lotto = new int[7];
        int[] myLotto = new int[6];
        int count = 0;
        boolean bns = false;
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = sc.nextInt();
        }
        for (int i = 0; i < myLotto.length; i++) {
            myLotto[i] = sc.nextInt();
        }
        for (int i = 0; i < lotto.length; i++) {
            for (int j = 0; j < myLotto.length; j++) {
                if (i < lotto.length - 1) {
                    if (lotto[i] == myLotto[j]) {
                        count++;
                    }
                } else {
                    if (lotto[i] == myLotto[j]) {
                        bns = true;
                    }
                }
            }
        }
        System.out.println(count);
        if (count == 6) {
            System.out.println("1등");
        } else if (count == 5 && bns == true) {
            System.out.println("2등");
        } else if (count == 5 && bns == false) {
            System.out.println("3등");
        } else if (count == 4) {
            System.out.println("4등");
        } else if (count == 3) {
            System.out.println("5등");
        } else if (count <= 2) {
            System.out.println("꽝");
        }
    }
}
