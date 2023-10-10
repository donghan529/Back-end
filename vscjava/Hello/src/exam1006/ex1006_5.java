package exam1006;

public class ex1006_5 {
    public static void main(String[] args) {
        /* 두 개의 2차원 배열을 입력으로 받아, 두 배열을 가로로 합치는 프로그램을 작성하세요. */
        int[][] array1 = { { 1, 2 }, { 3, 4 } };
        int[][] array2 = { { 5, 6 }, { 7, 8 } };
        int[][] array3 = new int[array1.length + array2.length][array1.length + array2.length];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            array3[index++] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[index++] = array2[i];
        }
        for (int i =0; i<array3.length;i++) {
            for(int j=0;j<array3[i].length;j++) {
                System.out.print(array3[i][j]+", ");
            }
    }}
}
