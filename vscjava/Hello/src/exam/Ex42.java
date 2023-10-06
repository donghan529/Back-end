package exam;

import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("슬기가 던진 공의 위치>");
        float ball = scanner.nextFloat();

        if (ball <= 70 && ball >= 50 || ball%6 == 0 ) {
            System.out.println("Win");
        } else {
            System.out.println("Lose");
        }
        scanner.close();
    }
}
