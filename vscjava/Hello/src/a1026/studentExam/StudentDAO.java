package a1026.studentExam;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDAO {
  Scanner sc = new Scanner(System.in);

  private ArrayList<StudentDTO> mList;

  // file 직접 d: 저장하려면 클래스인 FileClass 만들예정
  private FileClass file = new FileClass("sun", "studentInfo");

  // 생성자 constructor
  public StudentDAO() {
    mList = new ArrayList<StudentDTO>();

    // 테스트용 데이터
    StudentDTO m1 = new StudentDTO(0, "테스트1", 11, 100, 90, 80);
    StudentDTO m2 = new StudentDTO(1, "테스트2", 22, 90, 89, 91);
    StudentDTO m3 = new StudentDTO(2, "테스트3", 33, 85, 77, 55);
    StudentDTO m4 = new StudentDTO(3, "테스트4", 44, 77, 68, 85);

    mList.add(m1);
    mList.add(m2);
    mList.add(m3);
    mList.add(m4);
  }

  // CRUD
  // Create(생성)
  private void insert(StudentDTO m) {
    // 데이터 추가
    mList.add(m);
    // listSize++;
  }

  // Delete(삭제)
  private void delete(int index) {
    mList.remove(index);
  }

  // Select(검색)
  private StudentDTO select(int index) {
    return mList.get(index);
  }

  // Update(갱신)
  private void update(int index, StudentDTO m) {
    mList.set(index, m);
  }

  // user 메소드: 사용자의 입력값있음.
  // user Insert
  public void userInsert() {
    StudentDTO m = new StudentDTO();
    System.out.println("<회원 정보입력>");
    System.out.println("회원번호: ");
    int id = sc.nextInt();
    System.out.println("이름: ");
    String name = sc.next();
    System.out.println("나이: ");
    int age = sc.nextInt();
    System.out.println("국어점수: ");
    int kor = sc.nextInt();
    System.out.println("영어점수: ");
    int eng = sc.nextInt();
    System.out.println("수학점수: ");
    int math = sc.nextInt();
    m.setId(id);
    m.setName(name);
    m.setAge(age);
    m.setKor(kor);
    m.setEng(eng);
    m.setMath(math);
    insert(m);
  }

  // 인덱스 찾기: 키 - 이름
  private int findIndex() {
    System.out.println("회원이름을 입력하시오: ");
    String name = sc.next();
    for (int i = 0; i < mList.size(); i++) {
      if (mList.get(i).getName().equals(name)) {
        return i;
      }
    }
    return -1;
  }

  // user Delete
  public void userDelete() {
    int index = findIndex();
    if (index != -1) {
      delete(index);
      System.out.println("회원을 삭제했습니다.");
    } else {
      // 이름이 없는 경우
      System.out.println("해당 회원이 없습니다.");
    }
  }

  // user Select 멤버 값 리턴하기
  public void userSelect() {
    int index = findIndex();
    if (index != -1) {
      StudentDTO m = select(index);
      int id = m.getId();
      String name = m.getName();
      int age = m.getAge();
      int kor = m.getKor();
      int eng = m.getEng();
      int math = m.getMath();
      System.out.println("<" + name + "의 회원정보>");
      System.out.println("- 회원번호: " + id);
      System.out.println("- 이름: " + name);
      System.out.println("- 나이: " + age);
      System.out.println("- 국어점수: " + kor);
      System.out.println("- 영어점수: " + eng);
      System.out.println("- 수학점수: " + math);
    } else {
      System.out.println("해당 회원이 없습니다.");
    }
  }

  // user Update
  public void userUpdate() {
    int index = findIndex();
    if (index != -1) {
      // 이름이 있는 경우
      StudentDTO m = new StudentDTO();
      m.setId(mList.get(index).getId());
      m.setName(mList.get(index).getName());
      System.out.println("회원번호: " + m.getId());
      System.out.println("나이: ");
      m.setAge(sc.nextInt());
      System.out.println("국어점수: ");
      m.setKor(sc.nextInt());
      System.out.println("영어점수: ");
      m.setEng(sc.nextInt());
      System.out.println("수학점수: ");
      m.setMath(sc.nextInt());

      update(index, m);
      System.out.println("수정되었습니다.");
    } else {
      System.out.println("해당 회원이 없습니다.");
    }
  }

  // printAll - 전체리스트 출력
  public void printAll() {
    System.out.println("<전체회원목록>");
    int index = 1;
    for (int i = 0; i < mList.size(); i++) {
      System.out.println("<" + index + "." + mList.get(i).getName() + "회원>");
      System.out.println("회원번호: " + mList.get(i).getId());
      System.out.println("나이: " + mList.get(i).getAge());
      System.out.println("국어점수: " + mList.get(i).getKor());
      System.out.println("영어점수: " + mList.get(i).getEng());
      System.out.println("수학점수: " + mList.get(i).getMath());
      index++;
    }
  }

  // File method
  public void dataSave() throws Exception {
    file.create();
    String str = " 번호\t 이름\t 나이\t 국어\t 영어\t 수학\n" + "------------------------\n";
    for (int i = 0; i < mList.size(); i++) {
      str += mList.get(i).toString() + "\n";
    }
    System.out.println("데이터를 저장했습니다.");
    file.write(str);
  }

  public void dataLoad() {
    try {
      file.read();
    } catch (Exception e) {
      System.out.println("읽을 파일이 없습니다.");
    }
  }

}
