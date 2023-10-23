package exam.exam1023.ex5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exam {
  public static void main(String[] args) {
    List<String> list = Arrays.asList(
        "This is a java book",
        "Lambda Expressions",
        "Java8 supports lambda experssions");
    list.stream()
        .filter(a -> a.toLowerCase().contains("java"))
        .forEach(a -> System.out.println(a));
    System.out.println(list.toString());
  }

}
