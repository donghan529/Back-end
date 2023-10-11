package exam;

import java.util.Scanner;

public class Ex54_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a값을 입력하세요.");
        int a = sc.nextInt();
        System.out.println("b값을 입력하세요.");
        int b = sc.nextInt();
        int x = 0;
        if(b%a==0) {
            x = b/a;
            System.out.println(a+" * " + x  + "= "+b);
        }else if(a%b==0) {
            x= a/b;
            System.out.println(b+" * " + x + "= "+a);
        } else{
            System.out.println("none");
        }
    }
}
