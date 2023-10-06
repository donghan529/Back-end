package exam;

import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("삼각형의 밑변을 입력해주세요>");
        int a = sc.nextInt();
        System.out.print("삼각형의 높이를 입력해주세요>");
        int b = sc.nextInt();

        System.out.printf("삼각형의 넓이는"+"%.1f",(float)(a*b)/2.0F);
        sc.close();
    }
}
