package exam;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇시?(1~24)");
        int hour = sc.nextInt();
        System.out.println("몇분?(0~60)");
        int minute = sc.nextInt();
        System.out.println(hour+":"+minute);
        sc.close();
    }
}
