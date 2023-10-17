package exam.Ex66;

import java.util.Scanner;

public class Ex69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("시작 값(a)");
        int a = sc.nextInt();
        System.out.println("등차 값(d)");
        int d = sc.nextInt();
        System.out.println("정수(n)");
        int n = sc.nextInt();
        int sum = a;
        for (int i = 1; i < n; i++) {
            sum = sum+d;
        }
        System.out.println(sum);
    }
}
