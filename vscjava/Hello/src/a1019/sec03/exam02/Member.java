package a1019.sec03.exam02;

public class Member {
  public String name;
  public int age;

  public Member(String name, int age) {
    this.name = name;
    this.age = age;
  }

  //HashCode 재정의
  @Override
  public int hashCode() {
    return name.hashCode() + age;
  }

  //equals 재정의
  @Override
  public boolean equals(Object obj) {

    if(obj instanceof Member) {
      Member target = (Member) obj;
      return target.name.equals(name) && (target.age==age);
    } else {
      return false;
    }
  }
}
