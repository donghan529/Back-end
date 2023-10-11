package exam;

import java.util.Scanner;

public class Ex58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("직선의 길이 a");
        int a = sc.nextInt();
        System.out.println("직선의 길이 b");
        int b = sc.nextInt();
        System.out.println("직선의 길이 c");
        int c = sc.nextInt();
        if(c<(a+b)) {
            System.out.println("yes");
        } else{
            System.out.println("no");
        }
    }
}
