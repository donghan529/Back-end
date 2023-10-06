package exam;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        /*
         * 가(A, B, C, D, ...)를 문자로 입력 받아 내용을 다르게 출력해보자.
         * switch case문을 사용하여 구현해보자 
         * 평가내용
         * D : slowly~
         * C : run!
         * B : good!!
         * A : best!!!
         * 나머지문자들 : what?
         */
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'D':
                System.out.println("slowly~");
                break;
            case 'C':
                System.out.println("run");
                break;
            case 'B':
                System.out.println("good!!");
                break;
            case 'A':
                System.out.println("best!!!");
            default:
                System.out.println("what?");
                break;
        }
        sc.close();
    }
}
