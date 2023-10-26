package a1026.example;

import java.util.ArrayList;
import java.util.Scanner;

public class DAO {
  Scanner sc = new Scanner(System.in);

  private ArrayList<MemberDTO> mList;

  // file 직접 d: 저장하려면 클래스인 FileClass 만들예정
  private FileClass file = new FileClass("sun", "memberInfo");

  // 생성자 constructor
  public DAO() {
    mList = new ArrayList<MemberDTO>();

    // 테스트용 데이터
    MemberDTO m1 = new MemberDTO(0, "test1", 11, "서울");
    MemberDTO m2 = new MemberDTO(1, "test2", 22, "대전");
    MemberDTO m3 = new MemberDTO(2, "test3", 33, "대구");
    MemberDTO m4 = new MemberDTO(3, "test4", 44, "부산");

    mList.add(m1);
    mList.add(m2);
    mList.add(m3);
    mList.add(m4);
  }

  // CRUD
  // Create(생성)
  private void insert(MemberDTO m) {
    // 데이터 추가
    mList.add(m);
    // listSize++;
  }

  // Delete(삭제)
  private void delete(int index) {
    mList.remove(index);
  }

  // Select(검색)
  private MemberDTO select(int index) {
    return mList.get(index);
  }

  // Update(갱신)
  private void update(int index, MemberDTO m) {
    mList.set(index, m);
  }

  // user 메소드: 사용자의 입력값있음.
  // user Insert
  public void userInsert() {
    MemberDTO m = new MemberDTO();
    System.out.println("<회원 정보입력>");
    System.out.println("회원번호: ");
    int id = sc.nextInt();
    System.out.println("이름: ");
    String name = sc.next();
    System.out.println("나이: ");
    int age = sc.nextInt();
    System.out.println("주소: ");
    String ad = sc.next();
    m.setId(id);
    m.setName(name);
    m.setAge(age);
    m.setAddress(ad);
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
      MemberDTO m = select(index);
      int id = m.getId();
      String name = m.getName();
      int age = m.getAge();
      String address = m.getAddress();
      System.out.println("<" + name + "의 회원정보>");
      System.out.println("- 회원번호: " + id);
      System.out.println("- 이름: " + name);
      System.out.println("- 나이: " + age);
      System.out.println("- 주소: " + address);
    } else {
      System.out.println("해당 회원이 없습니다.");
    }
  }

  // user Update
  public void userUpdate() {
    int index = findIndex();
    if (index != -1) {
      // 이름이 있는 경우
      MemberDTO m = new MemberDTO();
      m.setId(mList.get(index).getId());
      m.setName(mList.get(index).getName());
      System.out.println("회원번호: " + m.getId());
      System.out.println("나이: ");
      m.setAge(sc.nextInt());
      System.out.println("주소: ");
      m.setAddress(sc.next());

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
      System.out.println("주소: " + mList.get(i).getAddress());
      index++;
    }
  }

  // File method
  public void dataSave() throws Exception {
    file.create();
    String str = " 번호\t 이름\t 나이\t 주소\n" + "------------------------\n";
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
