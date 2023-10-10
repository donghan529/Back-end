package exam;

public class exam1 {
    public static void main(String[] args) {
        int [] array = {1,5,3,8,2};
        int max = array[0];
        for(int i =0;i<5;i++) {
            if(max<=array[i]){
                max = array[i];
            }
        }
        System.out.println(max);
        int[][] array1 = {
            {95, 86},
            {83, 92, 96},
            {78, 83, 93, 87, 88},
        };
        int total = 0;
        int sum = 0;
        for(int i = 0;i<array1.length;i++) {
            for(int j =0; j<array1[i].length;j++){
                sum += array1[i][j];
            }
            total += array1[i].length;
        }
        
        double totalAvg = (double) sum/total;
        
        System.out.println(sum);
        System.out.println(totalAvg);
        
    }
}
