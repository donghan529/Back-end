package a1018.list;

import java.util.*;

public class ArrayList1 {
  public static void main(String[] args) {
    ArrayList<Integer> arrList = new ArrayList<Integer>();

    // add() 메소드를 이용한 요소의 저장
    arrList.add(40);
    arrList.add(20);
    arrList.add(30);
    arrList.add(10);
    // for문과 get() 메소드를 이용한 요소의 출력
    for (int i = 0; i < arrList.size(); i++) {
      System.out.print(arrList.get(i) + " ");
    }
    System.out.println();

    // remove() 메소드를 이용한 요소의 제거
    arrList.remove(1);

    // Enhanced for 문과 get() 메소드를 이용한 요소의 출력
    for (int e : arrList) {
      System.out.print(e + " ");
    }
    System.out.println();

    // Collection.sort() 메소드를 이용한 요소의 정렬
    Collections.sort(arrList);
    // Iterator() 메소드와 get() 메소드를 이용한 요소의 출력
    Iterator<Integer> iter = arrList.iterator();
    while (iter.hasNext()) { // 끝까지 반복
      System.out.print(iter.next() + " ");
    }
    System.out.println();
    // set() 메소드를 이용한 요소의 변경
    arrList.set(0, 20);
    for (int e : arrList) {
      System.out.print(e + " ");
    }
    System.out.println();
    // size() 메소드를 이용한 요소의 총 계수
    System.out.println("리스트의 크기: " + arrList.size());
  }
}
