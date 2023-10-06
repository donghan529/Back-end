package exam;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int[] numArray = { num1, num2, num3 };
        int sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            sum += numArray[i];
        }
        System.out.println("합: " + sum);
        double avg = sum / 3;
        System.out.printf("%.1f","평균: " + avg);
        sc.close();

    }
}
