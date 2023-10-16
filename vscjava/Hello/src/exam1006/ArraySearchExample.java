package exam1006;

import java.util.Arrays;


public class ArraySearchExample {
    public static void main(String[] args) {
        int[] numbers = {4,7,2,9,1,5};
        Arrays.sort(numbers); // {1,2,4,5,7,9} -> 배열이 정렬되어 있어야 한다는 조건
        int index = Arrays.binarySearch(numbers,7); // 배열에서 7 검색
        System.out.println("7 found at index: " + index);
    }
}
