package exam1006;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex1006_4 {
    public static void main(String[] args) {
        /*
         * 문제 4: 중복 요소 제거하기
         * 
         * 정수 배열에서 중복된 요소를 제거하고 중복이 제거된 배열을 반환하는 프로그램을 작성하세요.
         * int[] numbers = {1, 2, 2, 3, 4, 4, 5};
         */
        int[] numbers = { 1, 2, 2, 3, 4, 4, 5 };

        // 중복 요소를 제거한 배열 생성
        int[] uniqueNumbers = removeDuplicates(numbers);

        System.out.println("중복 제거된 배열: " + Arrays.toString(uniqueNumbers));
    }

    // 중복 요소를 제거한 배열을 반환하는 함수
    public static int[] removeDuplicates(int[] arr) {
        List<Integer> uniqueList = new ArrayList<>();
        for (int num : arr) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        // List를 배열로 변환
        int[] uniqueArray = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            uniqueArray[i] = uniqueList.get(i);
        }

        return uniqueArray;

    }
}
