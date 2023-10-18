package a1018.sec02.exam01;

import java.util.ArrayList;

public class Ex1 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 1; i <= 5; i++) {
      list.add(i);
    }
    System.out.println(list);
    System.out.println();
    
    int sum=0;
    for(int i =0;i<list.size();i++) {
      sum+= list.get(i);
    }
    System.out.println("합계: "+ sum);
    System.out.println();

    ArrayList<String> list2 =new ArrayList<>();
    list2.add("apple");
    list2.add("banana");
    list2.add("cherry");
    list2.add("date");
    list2.remove("banana");

    System.out.println(list2);
  }
}
