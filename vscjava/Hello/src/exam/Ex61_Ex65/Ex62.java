package exam.Ex61_Ex65;

import java.util.Scanner;

public class Ex62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a <= 3 && b <= 20 && c <= 999) {
            if (b < 10 && c < 10) {
                System.out.printf("%d0%d00%d", a, b, c);
            } else if (b < 10 && c < 100 && c>=10) {
                System.out.printf("%d0%d0%d", a, b, c);
            } else if(b<10 && c>=100) {
                System.out.printf("%d0%d%d", a, b, c);
            } else if(b>=10 && c<10) {
                System.out.printf("%d%d00%d", a, b, c);
            } else if(b>=10 && c<100 && c>=10) {
                System.out.printf("%d%d0%d", a, b, c);
            } else {
                System.out.printf("%d%d%d", a,b,c);
            }
        }
    }
}
