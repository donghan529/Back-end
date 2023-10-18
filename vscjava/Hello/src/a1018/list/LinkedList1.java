package a1018.list;

import java.util.*;

public class LinkedList1 {
  public static void main(String[] args) {
    LinkedList<String> lnkList = new LinkedList<String>();

    // add() 메소드를 이용한 요소의 저장
    lnkList.add("넷");
    lnkList.add("둘");
    lnkList.add("셋");
    lnkList.add("하나");
    // for문과 get() 메소드를 이용한 요소의 출력
    for (int i = 0; i < lnkList.size(); i++) {
      System.out.print(lnkList.get(i) + " ");
    }
    System.out.println();
    //remove() 메소드를 이용한 요소의 제거
    lnkList.remove(1);

    for(String e : lnkList) {
      System.out.print(e + " ");
    }
    System.out.println();

    lnkList.set(2,"둘");

    for(String e : lnkList) {
      System.out.print(e + " ");
    }
    System.out.println();

    System.out.println("리스트의 크기: "+lnkList.size());
  }
}
