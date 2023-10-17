package exam.Ex66;

import java.util.Scanner;

public class Ex67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 1 && num <= 100) {
            for (int i = num; i >= 1; i--) {
                System.out.print(i + " ");
            }
        }
        // while(num!=0){
        // System.out.print(num--);
        // }

        // System.out.print("카운트 다운 시작할 숫자를 입력하세요: ");
        // int i = num;

        // while (i > 0) {
        // try {
        // Thread.sleep(500);
        // } catch (InterruptedException e) {
        // System.out.println(e.getMessage());
        // }
        // System.out.print(i + " ");
        // i--;
        // }
        // System.out.println("종료합니다.");
    }
}
