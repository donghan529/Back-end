package a1013.abc;

//인터페이스는 추상메서드만 정의
//다중상속이 가능
interface Shape {
    double getArea();

    void display();

}

// 인터페이스를 구현하는 클래스
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("원의 면적: " + getArea());
    }
}

class Ractangle implements Shape {
    private double whidth;
    private double height;

    public Ractangle(double whidth, double height) {
        this.whidth = whidth;
        this.height = height;
    }

    @Override
    public double getArea() {
        return whidth * height;
    }

    @Override
    public void display() {
        System.out.println("사각형의 넓이: " + getArea());

    }

}

public class InterfaceExample {
    public static void main(String[] args) {
        //Circle 객체 생성
        Circle circle = new Circle(5.0);
        circle.display(); //인터페이스 메서드 호출

        //Ractangle 객체 생성
        Ractangle ractangle = new Ractangle(4.0, 6.0);
        ractangle.display(); 
    }
}
