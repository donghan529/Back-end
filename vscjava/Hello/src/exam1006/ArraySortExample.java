package exam1006;

import java.util.Arrays;

public class ArraySortExample {
    public static void main(String[] args) {
        int[] numbers = {5,2,9,1,5,6};
        Arrays.sort(numbers);
        for(int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
