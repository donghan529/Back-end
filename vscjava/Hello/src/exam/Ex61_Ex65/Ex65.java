package exam.Ex61_Ex65;

import java.util.Scanner;

public class Ex65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<10 && a>0) {
            for(int i=a;i<10;i++) {
                if(i%3 == 0) { //i==3 || i==6 || i==9
                    System.out.printf("%s ","X");
                } else {
                    System.out.printf("%d ", i);
                }
                
            }
        }
    }
}
