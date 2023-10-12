package exam;

import java.util.Scanner;

public class Ex57_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 메뉴를 고르세요.");
        int select1 = sc.nextInt();
        System.out.println("두 번째 메뉴를 고르세요.");
        int select2 = sc.nextInt();
        int sum = 0;
        switch (select1) {
            case 1:
                sum += 400;
                break;
            case 2:
                sum += 340;
                break;
            case 3:
                sum += 170;
                break;
            case 4:
                sum += 100;
                break;
            case 5:
                sum += 70;
                break;
        }
        switch (select2) {
            case 1:
                sum += 400;
                break;
            case 2:
                sum += 340;
                break;
            case 3:
                sum += 170;
                break;
            case 4:
                sum += 100;
                break;
            case 5:
                sum += 70;
                break;
        }
        if(sum>=500) {
            System.out.println("angry");
        }else if(sum<=500) {
            System.out.println("no angry");
        }
    }
}
