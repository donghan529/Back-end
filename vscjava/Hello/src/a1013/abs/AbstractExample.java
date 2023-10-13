package a1013.abs;

//추상클래스
abstract class Shape {
    // 추상 메서드(하위클래스에서 구현해야함)
    public abstract double getArea();
}

// Shape 추상 클래스를 상속받는 구체 클래스 (하위 클래스)
class Circle extends Shape {
    private double redius;

    public Circle(double redius) {
        this.redius = redius;
    }

    public double getArea() {
        return Math.PI * redius * redius;
    }
}

class Ractangle extends Shape {
    private double whidth;
    private double height;

    public Ractangle(double whidth, double height) {
        this.whidth = whidth;
        this.height = height;
    }

    public double getArea() {
        return whidth * height;
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        //Circle 객체 생성
        Circle circle = new Circle(5.0);
        System.out.println("원의 넓이: " + circle.getArea());
        
        //Circle 객체 생성
        Ractangle ractangle = new Ractangle(4.0, 6.0);
        System.out.println("사각형의 넓이: " + ractangle.getArea());
    }
}
