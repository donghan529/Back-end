package exam;

import java.util.Scanner;

public class Ex52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] num1 = {"st","nd","th","th","th","th","th","th","th","th", "th","th","th","th","th","th","th","th","th","th", "st","nd","th","th","th","th","th","th","th","th","st","nd","th","th","th","th","th","th","th","th","st","nd","th","th","th","th","th","th","th","th","st","nd","th","th","th","th","th","th","th","th","st","nd","th","th","th","th","th","th","th","th","st","nd","th","th","th","th","th","th","th","th","st","nd","th","th","th","th","th","th","th","th","st","nd","th","th","th","th","th","th","th","th"};
        
        int num = sc.nextInt();
            if(num>=1 || num<=10) {
                System.out.print(num);  
                System.out.print(num1[num-1]);
            }else if(num>=11 || num<=20) {
                System.out.print(num);  
                System.out.print(num1[(num-1)]);
            }else if(num>=21 || num<=30) {
                System.out.print(num);  
                System.out.print(num1[(num-1)]);
            }else if(num>=31 || num<=40) {
                System.out.print(num);  
                System.out.print(num1[(num-1)]);
            }else if(num>=41 || num<=50) {
                System.out.print(num);  
                System.out.print(num1[(num-1)]);
            }else if(num>=51 || num<=60) {
                System.out.print(num);  
                System.out.print(num1[num-1]);
            }else if(num>=61 || num<=70) {
                System.out.print(num);  
                System.out.print(num1[num-1]);
            }else if(num>=71 || num<=80) {
                System.out.print(num);  
                System.out.print(num1[num-1]);
            }else if(num>=81 || num<=90) {
                System.out.print(num);  
                System.out.print(num1[num-1]);
            }else if(num>=91 || num<100) {
                System.out.print(num);  
                System.out.print(num1[num-1]);
            } else {
                System.out.println("100이하 숫자를 입력하세요");
            }

        
        System.out.println();
        sc.close();
    }
}
