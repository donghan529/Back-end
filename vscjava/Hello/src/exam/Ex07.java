package exam;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        //키보드로 입력한 정수값을 그대로 출력하는 프로그램을 작성해보자.
        //Scanner scanner = new Scanner(System.in);
        //상단 import java.unit.Scanner;
        //상단에 import가 안나올때는 Alt + Shift + O
        Scanner scanner = new Scanner(System.in); 
        int num = scanner.nextInt();
        System.out.println(num);
        scanner.close();
    }
}
