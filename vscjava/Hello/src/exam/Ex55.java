package exam;

import java.util.Scanner;

public class Ex55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scroe = sc.nextInt();
        if(scroe>=90) {
            System.out.println("A");
        } else if (scroe>=80) {
            System.out.println("B");
        } else if (scroe>=70) {
            System.out.println("C");
        } else if (scroe>=60) {
            System.out.println("D");
        }else if (scroe<60) {
            System.out.println("F");
        } else {
            System.out.println("입력되는 정수는 0~100이다.");
        }
        sc.close();
    }
}
