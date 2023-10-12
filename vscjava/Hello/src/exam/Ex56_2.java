package exam;

import java.util.Scanner;

public class Ex56_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("윷을 입력하세요>");
        String score = scan.nextLine();

        if (score.equals("도")) {
            System.out.println("0  0  1  0");
        } else if (score.equals("개")) {
            System.out.println("0  1  1  0");
        } else if (score.equals("걸")) {
            System.out.println("1  1  1  0");
        } else if (score.equals("윷")) {
            System.out.println("1  1  1  1");
        } else {
            System.out.println("0  0  1  0");
        }

    }
}
