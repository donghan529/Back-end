package a0927;

import java.util.Scanner;

public class A0927_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        scanner.close();

        // if (score >= 90) {
        // System.out.println("점수가 90보다 큽니다.");
        // System.out.println("등급은 A입니다.");
        // } else if (score >= 80) {
        // System.out.println("점수가 80보다 큽니다.");
        // System.out.println("등급은 B입니다.");
        // } else if (score >= 70) {
        // System.out.println("점수가 70보다 큽니다.");
        // System.out.println("등급은 C입니다.");
        // } else if(score>=60) {
        // System.out.println("점수가 70보다 큽니다.");
        // System.out.println("등급은 D입니다.");
        // } else {
        // System.out.println("과락입니다.");
        // System.out.println("등급은 F입니다.");
        // }
    }

}
