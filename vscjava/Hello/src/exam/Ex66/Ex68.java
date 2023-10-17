package exam.Ex66;

import java.util.Scanner;

public class Ex68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 0 && num <= 100) {
            for (int i = 0; i <= num; i++) {
                System.out.println(i);
            }
        }
    }
}
