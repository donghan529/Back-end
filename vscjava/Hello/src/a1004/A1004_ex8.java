package a1004;

import java.util.Scanner;

public class A1004_ex8 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요.> ");
        int strNum = Integer.parseInt(scanner.nextLine());

        if(strNum%2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }

    }
}
