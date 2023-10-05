package a1005;

import java.util.Arrays;

public class A1005_ex1 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double avg = (double) sum / array.length;
        System.out.println("1. 배열 요소의 합: " + sum);
        System.out.println("1. 배열 요소의 평균: " + avg);

        int[] array1 = { 10, 5, 8, 21, 3 };
        int max = array1[0];
        int min = array1[0];

        for (int i = 1; i < array1.length; i++) {
            if (array1[i] > max) {
                max = array1[i];
            }
            if (array1[i] < min) {
                min = array1[i];
            }
        }
        System.out.println("for문을 이용한 방법");
        System.out.println("2. 최대값: " + max);
        System.out.println("2. 최소값: " + min);

        System.out.println("Arrays.sort를 이용한 방법");
        Arrays.sort(array1);
        System.out.println("2. 최대값: " + array1[array1.length - 1]);
        System.out.println("2. 최소값: " + array1[0]);

        System.out.println("Stream을 이용한 방법");
        System.out.println("2. 최대값: " + Arrays.stream(array1).max().getAsInt());
        System.out.println("2. 최소값: " + Arrays.stream(array1).min().getAsInt());

        double[] array2 = { 2.5, 3.0, 1.5, 4.0, 2.0 };
        double sum2 = 0;

        for (int i = 0; i < array2.length; i++) {
            sum2 += array2[i];
        }
        double avg2 = (double) sum2 / array2.length;
        System.out.println("3. 배열 요소의 평균:" + avg2);

        String[] array3 = {"apple", "banana", "cherry", "date"};
        String[] reverseArray3 = new String[4];
        for (int i = array3.length - 1, j = 0; i >= 0; i--, j++) {
            reverseArray3[j] = array3[i] ;
        }
        for (int i = 0; i<array3.length;i++) {
            array3[i] = reverseArray3[i];
        }
        System.out.println("4. 배열 요소 뒤집기: " + Arrays.toString(array3));
    }
}
