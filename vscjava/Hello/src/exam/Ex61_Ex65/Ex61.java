package exam.Ex61_Ex65;

import java.util.Scanner;

public class Ex61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        int c = sc.nextInt();
        if (b.equals("+")) {
            System.out.println(a + c);
        } else if (b.equals("-")) {
            System.out.println(a - c);
        } else if (b.equals("*")) {
            System.out.println(a * c);
        } else if (b.equals("/")) {
            if (a > 0 && c > 0) {
                System.out.printf("%.2f",((double)a / (double)c));
            }
        }
    }
}
