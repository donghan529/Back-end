// package a1024;

// import java.util.Arrays;
// import java.util.List;
// import java.util.stream.Collectors;

// public class Ex10 {
//   public static void main(String[] args) {
//     // 문제 5: 사람 목록에서 특정 조건을 만족하는 사람 수 구하기 성별이 여성인 사람수 구하기
//     List<Person> people = Arrays.asList(
//         new Person("Alice", 25, "여성"),
//         new Person("Bob", 30, "남성"),
//         new Person("Charlie", 22, "여성"));
//     long peoples2 = people.stream()
//         .filter(s -> s.getGender().equals("여성"))
//         .count();
//     System.out.println(peoples2);
//     // 문제 6: 나이가 25 이상인 사람을 필터링하여 새로운 리스트에 저장후 출력
//     List<Person> fillteredPeople = people.stream()
//         .filter(person -> person.getAge() >= 25)
//         .collect(Collectors.toList());
//     for (Person person : fillteredPeople) {
//       System.out.println("name: " + person.getName() + ", age: " + person.getAge());
//     }
//     System.out.println();
//     fillteredPeople.forEach(person -> {
//       System.out.println("name: " + person.getName() + ", age: " + person.getAge());
//     });

//     List<Integer> numbers = Arrays.asList(1, -2, 3, -4, 5, -6);
//     List<Integer> numbers1 = numbers.stream()
//       .filter(s->s>=0)
//       .collect(Collectors.toList());
//       System.out.println(numbers1);
//   }
// }
