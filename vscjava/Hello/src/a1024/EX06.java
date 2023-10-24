package a1024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EX06 {
  public static void main(String[] args) {
    // 문제 1: 문자열 목록에서 길이가 3 이하인 문자열 제외하기
    List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "fig");
    List<String> string1 = strings.stream()
        .filter(s -> s.length() > 3)
        .collect(Collectors.toList());
    System.out.println(string1);
  }
}
