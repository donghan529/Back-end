package a0927;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A0927_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
        // 사용자에게 메시지를 출력해서 점수 입력 받기
        System.out.print("점수를 입력하세요: ");
        int score = scanner.nextInt();

        // 입력 받은 점수에 따라 학점계산
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("학점 : " + grade);

        // scanner.close();
        }catch(InputMismatchException e) {
            System.out.println("올바른 숫자를 입력하세요.");
        }finally{
            scanner.close();
        }
    }
    }


