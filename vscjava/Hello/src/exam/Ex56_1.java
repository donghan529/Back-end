package exam;

import java.util.Scanner;

public class Ex56_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[4];
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            if (num[i] == 1) {
                count++;
            }
        }
        switch (count) {
            case 1:
                System.out.println("도");
                break;
            case 2:
                System.out.println("개");
                break;
            case 3:
                System.out.println("걸");
                break;
            case 4:
                System.out.println("윷");
                break;
            default:
                System.out.println("모");
        }
    }
}