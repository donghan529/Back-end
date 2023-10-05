package a1004;

import java.util.Scanner;

public class A1004_17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean bank = true;
        int bank1 = 0;
        while (bank) {
            System.out.println("--------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("--------------------------------------");
            System.out.print("선택> ");

            int strNum = Integer.parseInt(scanner.nextLine());

            switch (strNum) {
                case 1:
                    System.out.print("예금액>");
                    bank1 += Integer.parseInt(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("출금액>");
                    bank1 -= Integer.parseInt(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("잔고>");
                    System.out.println(bank1);
                    break;
                case 4:
                    System.out.println("프로그램 종료");

            }

            if (strNum == 4) {
                break;
            }

        }
        scanner.close();
    }

}
