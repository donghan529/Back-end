package a1024;

import java.util.Arrays;
import java.util.List;

public class Ex09 {
  public static void main(String[] args) {
    // 문제 4: 문자열 목록에서 문자열 길이 평균 구하기
    List<String> strings1 = Arrays.asList("apple", "banana", "cherry", "date", "fig");
    double averageLength = strings1.stream()
      .mapToInt(String::length) //문자열 길이를 숫자로 매핑
      .average()  //평균
      .orElse(0.0); //목록이 비어 있으면 0.0
      //orElse: 기본값을 지정하여 안전하게 값을 가져옴
      //.getAsDouble: 값이 반드시 존재해야 하는 경우에 사용되어야 함
      System.out.println("Average length: " + averageLength);
  }
}
