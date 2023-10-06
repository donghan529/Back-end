package exam;

import java.util.Scanner;

public class Ex28 {
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
        System.out.println("정수를 입력하세요>");
        int c = sc.nextInt();
        int[] abc = {a,b,c};
        for(int i=0;i<abc.length;i++) {
            if(abc[i]%2 == 0) {
                System.out.println(abc[i]);
            }
        }
        sc.close();
    }
}
