package exam.exam1013.ex6;

public class Child extends Parent {
    public int studentNo;

    public Child(String name, int studentNo) {
        super(name); // 부모클래스의 생성자 호출
        this.studentNo = studentNo;
    }
}
