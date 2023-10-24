package a1024;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Ex08 {
  public static void main(String[] args) {
    // 문제 3: 사람 목록에서 나이가 가장 어린 사람 찾기
    List<Person> people = Arrays.asList(
        new Person("Alice", 25),
        new Person("Bob", 30),
        new Person("Charlie", 22));
    Optional<Person> youngestPerson = people.stream()
    .min(Comparator.comparing(Person::getAge));
    
    youngestPerson.ifPresent(person -> System.out.println("가장 어린 친구: " + person.getName()));

    String youngestName = youngestPerson.map(Person::getName).orElse("No youngest person found");
    System.out.println("Youngest person: " + youngestName);
  }
}
