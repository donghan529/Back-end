package exam.Ex66;

import java.util.Scanner;

public class Ex70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("시작 값(a)");
        int a = sc.nextInt();
        System.out.println("등비의 값(r)");
        int r = sc.nextInt();
        System.out.println("정수(n)");
        int n = sc.nextInt();
        int toTal = a;
        for(int i = 1;i<n;i++) {
            toTal = toTal*r;
        }
        System.out.println(toTal);
        sc.close();
    }
}
