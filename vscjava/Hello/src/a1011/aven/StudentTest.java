package a1011.aven;

public class StudentTest {
    public static void main(String[] args) {
        Student park = new Student(2019122104, "park");
        Student kim = new Student(201906028, "kim");
        Student lee = new Student(2019153237, "lee");
        System.out.printf("Student 객체의 수: %d\n", Student.count);
        System.out.println("id: " + park.id + "\nname: " + park.name);
        System.out.println("id: " + kim.id + "\nname: " + kim.name);
        System.out.println("id: " + lee.id + "\nname: " + lee.name);
    }
}

class Student {

    static int count = 0; // 클래스변수, static 필드, 정적변수, 공용변수

    int id; // 인스턴스변수
    String name;

    Student(int _id, String _name) {
        Student.count++;
        id = _id;
        name = _name;
    }
}