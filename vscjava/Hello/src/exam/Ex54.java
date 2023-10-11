package exam;

import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if ((a / b) <= 1 && (b % a) == 0) {
            System.out.println((int) a + "*" + (int) (b / a) + "=" + (int) (a * (b / a)));
        } else if ((a % b) == 0 && (a / b) >= 1) {
            System.out.println((int) b + "*" + (int) (a / b) + "=" + (int) (b * (a / b)));
        } else {
            System.out.println("none");
        }
        sc.close();
    }
}
