package exam;

import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] num1 = {a+b, b+a, a-b, b-a, a*b, b*a,a/b, b/a};
        double max = num1[0];
        for(int i =0;i<num1.length;i++) {
            if(max<num1[i]) {
                max =num1[i];
            }
        }
        System.out.printf("최대값: %f",max);
    }
}
