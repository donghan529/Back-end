package a1023.sec07.exam01;

public class Student implements Comparable<Student> {
  private String name;
  private int score;
  
  public String getName() {
    return name;
  }

  public int getScore() {
    return score;
  }

  public Student(String name, int score) {
    this.name = name;
    this.score = score;
  }
  
  @Override
  public int compareTo(Student o) {
    return Integer.compare(score, o.score);
  }
}
