package exam;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        //입력된 두 정수 a, b 중 큰 값을 출력하는 프로그램을 작성해보자.
        //123
        //356
        // ->356
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요>");
        int a = sc.nextInt();
        System.out.println("정수를 입력하세요>");
        int b = sc.nextInt();
        //삼항 연산자 조건 ? 참 : 거짓
        // int i = ( a > b ) ? a : b;
        // System.out.println(i);
        // if(a<b) {
        //     System.out.println(b);
        // } else {
        //     System.out.println(a);
        // }
        int i = 0;
        if(a>b) {
            i = a;
        } else {
            i = b;
        }
        System.out.println(i);
        sc.close();
    }
}
