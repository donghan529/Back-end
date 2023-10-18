package exam.Ex66;

import java.util.Scanner;

public class Exam1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] num = new int[n];
    int i = 0;

    while (true) {
      System.out.println("더할 숫자를 입력하세요>");
      num[i] = sc.nextInt();
      if (num[i] == 0) {
        break;
      }
      i++;
    }

  }
}
