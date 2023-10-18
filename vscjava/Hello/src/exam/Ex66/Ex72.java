package exam.Ex66;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex72 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    int max = 0;

    while (true) {
      System.out.println();
      System.out.println("숫자를 입력하세요>");
      int num = sc.nextInt();
      System.out.println();
      if(num==0) {
        System.out.println("종료합니다.");
        break;
      }
      list.add(num);
      for (int i = 0; i < list.size(); i++) {
        if (max < list.get(i)) {
          max = list.get(i);
        }
        System.out.print(", " + list.get(i));
      }
      System.out.println();
      System.out.println("입력받은 숫자의 최대값은?" + max);
    }
  }
}
