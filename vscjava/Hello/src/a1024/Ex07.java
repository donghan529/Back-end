package a1024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex07 {
  public static void main(String[] args) {
    // 문제 2: 숫자 목록에서 중복값 제거하기
    List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
    List<Integer> numbers1 = numbers.stream()
        .distinct()
        .collect(Collectors.toList());
    System.out.println(numbers1);
  }
}
