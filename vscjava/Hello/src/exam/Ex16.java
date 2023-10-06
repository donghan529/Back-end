package exam;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        //10진수 8진수바꾸기
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //%o는 8진수
        System.out.printf("%o",num);
        //%x는 16진수
        System.out.printf("%x",num);
        sc.close();
    }
}
