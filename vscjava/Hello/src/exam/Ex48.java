package exam;

import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민등록번호 7자리를 입력하세요. ex6610172");
        String num = sc.nextLine();
        String first = num.substring(0, 2);
        String xy = num.substring(6);
        System.out.println(xy);
        int age = 12-Integer.parseInt(first)+101;
        int xy1234 = Integer.parseInt(xy);
        System.out.println(age);
        if(xy1234==1) {
            System.out.println("성별정보가 " + xy1234 + "이므로, 19" + first + "년생, "+ age + "살이다");
        } else if (xy1234==3) {
            System.out.println("성별정보가 " + xy1234 + "이므로, 20" + first + "년생, "+ age + "살이다");
        } else if (xy1234==2) {
            System.out.println("성별정보가 " + xy1234 + "이므로, 19" + first + "년생, "+ age + "살이다");
        } else if (xy1234==4) {
            System.out.println("성별정보가 " + xy1234 + "이므로, 20" + num + "년생, "+ age + "살이다");
        } else {
            System.out.println("잘못입력하셨습니다.");
        }
    }
}
