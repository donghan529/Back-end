package exam;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        //영문자 한개를 입력받아 아스키코드 10진수값으로 출력하는 프로그램을 작성해보자.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = str.charAt(0);//인덱스 0(첫번째) 문자를 가져옴.
        int num = c;
        System.out.println(num);
        sc.close();
    }
}
