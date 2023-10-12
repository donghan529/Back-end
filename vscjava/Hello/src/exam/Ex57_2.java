package exam;

import java.util.Scanner;

public class Ex57_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.치즈버거 | 2.야채버거 | 3.우유 | 4.계란말이 | 5.샐러드 |" );
        int cal = 0;
        for(int i=0; i<2; i++) {
            System.out.println("메뉴를 선택하세요>");
            int num = sc.nextInt();
            switch(num) {
                case 1:
                int cheese = 400;
                cal += cheese;
                break;
                case 2:
                int veget =340;
                cal += veget;
                break;
                case 3:
                int milk =170;
                cal += milk;
                break;
                case 4 :
                int egg = 100;
                cal += egg;
                break;
                case 5:
                int salad = 70;
                cal += salad;
                break;
            }
        }
        System.out.println("총 칼로리: " + cal);
        if(cal>=500) {
            System.out.println("angry");
        } else if(cal<=500) {
            System.out.println("no angry");
        }
        sc.close();
    }
}
