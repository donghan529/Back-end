package exam.Ex66;

import java.util.Scanner;

public class Exam2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int sum = 0;

    while(true) {
      System.out.println("더할 숫자를 입력하세요>");
      int num = sc.nextInt();

      sum += num;
      System.out.println("지금까지 숫자의 합은?" +sum);
      if(num==0) {
        System.out.println("시스템을 종료합니다.");
        break;
      }
    }
  }
}
