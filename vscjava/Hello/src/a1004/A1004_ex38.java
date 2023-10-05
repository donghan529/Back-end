package a1004;

import java.util.Scanner;

public class A1004_ex38 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
    
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        float c = a * b / 2.0F;
    
        System.out.println(String.format("%.1f", c));
        scanner.close();
    }


}
