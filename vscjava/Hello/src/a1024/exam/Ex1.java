package a1024.exam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//문제 1: 문자열 목록에서 길이가 3 이하인 문자열 제외하기
public class Ex1 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "fig");
        List<String> string1 = strings.stream()
                .filter(s -> s.length() >= 4)
                .collect(Collectors.toList());
        System.out.println(string1);

        // 문제 2: 숫자 목록에서 중복값 제거하기
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> numbers1 = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(numbers1);

        // 문제 3: 사람 목록에서 나이가 가장 어린 사람 찾기
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 22));
        // int people1 = people.stream()
        // .map(s -> s.getAge())
        // .min(Integer::compareTo)
        // .orElse(0);
        // System.out.println(people1);

        Optional<Person> youngestPerson = people.stream()
                .min(Comparator.comparing(Person::getAge));

        youngestPerson.ifPresent(person -> System.out.println("가장 어린 친구: " + person.getName()));

        // 문제 4: 문자열 목록에서 문자열 길이 평균 구하기
        List<String> strings1 = Arrays.asList("apple", "banana", "cherry", "date", "fig");
        double averageLength = strings1.stream()
                .mapToInt(String::length) // 문자열 길이를 숫자로 매핑
                .average() // 평균
                .orElse(0.0); // 목록이 비어 있으면 0.0
        System.out.println(averageLength);

        // 문제 5: 사람 목록에서 특정 조건을 만족하는 사람 수 구하기 성별이 여성인 사람수 구하기
        List<Person1> peoples1 = Arrays.asList(
                new Person1("Alice", 25, "여성"),
                new Person1("Bob", 30, "남성"),
                new Person1("Charlie", 22, "여성"));
        long peoples2 = peoples1.stream()
                .filter(s -> s.getSex().equals("여성"))
                .count();
        System.out.println(peoples2);
    }
}
