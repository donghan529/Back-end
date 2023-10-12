package exam;

import java.util.Scanner;

public class ex59_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lottoNumber = new int[7];
        int[] myLotto = new int[6];
        int count = 0;
        boolean bns = false;
        for (int i = 0; i < lottoNumber.length; i++) {
            lottoNumber[i] = sc.nextInt();
        }
        for (int i = 0; i < myLotto.length; i++) {
            myLotto[i] = sc.nextInt();
        }
        for (int i = 0; i < lottoNumber.length; i++) {
            for (int j = 0; j < myLotto.length; j++) {
                if (i < lottoNumber.length - 1) {
                    if (lottoNumber[i] == myLotto[j]) {
                        count++;
                    }
                } else {
                    if (lottoNumber[i] == myLotto[j]) {
                        bns = true;
                    }
                }
            }
        }
        switch (count) {
            case 3:
                System.out.println("5");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                if (bns == false)
                    System.out.println("3");
                else
                    System.out.println("2");
                break;
            case 6:
                System.out.println("1");
                break;
            default:
                System.out.println("0");
        }
    }
}
