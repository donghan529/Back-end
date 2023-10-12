package exam;

import java.util.Scanner;

public class Ex60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int car = 170;
        System.out.print("a터널 높이: ");
        int a = sc.nextInt();
        System.out.print("b터널 높이: ");
        int b = sc.nextInt();
        System.out.print("c터널 높이: ");
        int c = sc.nextInt();
        if(a<=car) {
            System.out.println("CRASH "+ a);
        } else if(b<=car) {
            System.out.println("CRASH "+ b);
        } else if(c<=car) {
            System.out.println("CRASH "+ c);
        } else {
            System.out.println("PASS");
        }
    }
}
