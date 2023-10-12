package exam.Ex61_Ex65;

import java.util.Scanner;

public class Ex64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > 0 && b > 0) {
            System.out.println(a % b);
        }
    }
}
