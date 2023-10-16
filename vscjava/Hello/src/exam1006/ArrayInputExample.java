package exam1006;

import java.util.Scanner;

public class ArrayInputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("배열 크기를 입력하세요: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        for(int i=0;i<size;i++) {
            System.out.println("숫자를 입력하세요: ");
            numbers[i] = sc.nextInt();
        }
        System.out.println("입력한 숫자 배열: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
