package exam;

import java.util.Scanner;

public class Ex54_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ((b % a) == 0) {
            System.out.printf("%d * %d = %d", a,(b/a),b);
        } else if ((a % b) == 0) {
            System.out.printf("%d * %d = %d", b,(a/b),a);
        } else {
            System.out.println("none");
        }
        sc.close();
    }
}
