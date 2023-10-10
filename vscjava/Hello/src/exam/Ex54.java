package exam;

import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a*(b/a)==b) {
            System.out.println(a + "*"+ (b/a)+"="+ (a*(b/a)));
        } else if (a % b == 0) {
            System.out.println(b + "*" + (a/b)+"="+(b*(a/b)));
        } else {
            System.out.println("none");
        }

    }
}
