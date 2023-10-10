package exam1006;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collection;
// import java.util.Collections;
// import java.util.HashSet;
// import java.util.Set;

public class ex1006_3 {
    public static void main(String[] args) {
        /*
         * 문제 3: 배열 요소의 빈도수 계산
         * 
         * 정수 배열과 정수 값 하나가 주어질 때, 배열에서 그 값의 빈도수를 계산하는 프로그램을 작성하세요.
         * 
         * int[] numbers = {1, 2, 3, 2, 4, 2, 5};
         * int targetValue = 2;
         * int frequency = 0;
         */
        int[] numbers = { 1, 2, 3, 2, 4, 2, 5 };
        int targetValue = 2;
        int frequency = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == targetValue) {
                frequency += 1;
            }
        }
        System.out.println(frequency);
        // ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 2,
        // 5));

        // frequency = Collections.frequency(list, 2);
        // System.out.println(frequency);
        // Set<Integer> set = new HashSet<Integer>(list);
        // for (Integer inte : set) {
        // System.out.println(inte + " : " + Collections.frequency(list, inte));
        // }
    }
}
