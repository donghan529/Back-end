package a1005;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class A1005_ex2 {
    public static void main(String[] args) {
        // 1. 원본 배열
        String[] arr = { "apple", "banana", "cherry", "date" };

        // 2. 원본 배열을 List로 변환
        List<String> list = Arrays.asList(arr);

        // 3. Collections.reverse() 메소드를 사용하여 list를 거꾸로 변환
        Collections.reverse(list);

        // 4. 리스트를 배열로 변환
        String[] reverseArr = list.toArray(arr);

        // 5. 결과 출력
        System.out.println("arr : " + Arrays.toString(arr));
        System.out.println("reverseArr : " + Arrays.toString(reverseArr));

        String[] array = { "apple", "banana", "cherry", "date" };

        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println("배열 요소 뒤집기:");
        for (String str : array) {
            System.out.println(str);
        }

    }
}
