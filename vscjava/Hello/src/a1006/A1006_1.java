package a1006;

public class A1006_1 {
    public static void main(String[] args) {
        // 각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
        int[][] mathcScores = new int[2][3];
        // 배열 항목 초기값 출력
        for (int i = 0; i < mathcScores.length; i++) {
            for (int k = 0; k < mathcScores[i].length; k++) {
                System.out.println("mathScores[" + i + "][" + k + "]: " + mathcScores[i][k]);
            }
        }
        System.out.println();
        // 배열 항목 값 변경
        mathcScores[0][0] = 80;
        mathcScores[0][1] = 83;
        mathcScores[0][2] = 85;
        mathcScores[1][0] = 86;
        mathcScores[1][1] = 90;
        mathcScores[1][2] = 92;
        // 전체 학생의 수학 평균 구하기
        int totalStudent = 0;
        int totalMathSum = 0;
        for (int i = 0; i < mathcScores.length; i++) {// 반의 수만큼 반복
            totalStudent += mathcScores[i].length;
            for (int k = 0; k < mathcScores[i].length; k++) {
                totalMathSum += mathcScores[i][k];
            }
        }
        double totalMathAvg = (double) totalMathSum / totalStudent;
        System.out.println("전체 학생의 수학 평균 점수: " + totalMathAvg);
        System.out.println();

        //각 반의 학생 수가 다름 경우 점수 저장을 위한 2차원 배열 생성
        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2];
        englishScores[1] = new int[3];
        //배열 항목 초기값 출력
        for (int i = 0; i < englishScores.length; i++) {
            for (int k = 0; k < englishScores[i].length; k++) {
                System.out.println("englishScores[" + i + "][" + k + "]: " + englishScores[i][k]);
            }
        }
        System.out.println();
        //배열 항목 값 변경
        englishScores[0][0] = 90;
        englishScores[0][1] = 91;
        englishScores[1][0] = 92;
        englishScores[1][1] = 93;
        englishScores[1][2] = 94;
        //전체 학생의 영어 평균 구하기
        totalStudent = 0;
        int totalEnglishSum = 0;
        for (int i = 0; i < englishScores.length; i++) {// 반의 수만큼 반복
            totalStudent += englishScores[i].length;
            for (int k = 0; k < englishScores[i].length; k++) {
                totalEnglishSum += englishScores[i][k];
            }
        }
        double totalEnglishAvg = (double) totalEnglishSum / totalStudent;
        System.out.println("전체 학생의 영어 평균 점수: " + totalEnglishAvg);
    }
}
