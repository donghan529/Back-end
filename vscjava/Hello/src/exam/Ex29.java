package exam;

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        //세 정수 a, b, c가 입력되었을 때, even(짝)/odd(홀)을 출력해보자.

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요>");
        int a = sc.nextInt();
        System.out.println("정수를 입력하세요>");
        int b = sc.nextInt();
        System.out.println("정수를 입력하세요>");
        int c = sc.nextInt();
        if(a%2==0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        if(b%2==0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        if(c%2==0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        sc.close();
    }
}
