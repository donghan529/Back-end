package a1024.exam;

public class Person1 {

  private final String name;
  private final int age;
  private final String sex;

  public String getSex() {
    return sex;
  }

  public Person1(String name, int age, String sex) {
      this.name = name;
      this.age = age;
      this.sex = sex;
    }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;

  }
}
