package a1025.sec02.exam02;

public class ExceptionHandlingExample {
  public static void main(String[] args) {
    try {
      Class.forName("Java.lang.String");
      System.out.println("Java.lang.String 클래스가 존재합니다.");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    System.out.println();

    try {
      Class.forName("Java.lang.String2");
      System.out.println("Java.lang.String2 클래스가 존재합니다.");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
