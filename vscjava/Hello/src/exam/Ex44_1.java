package exam;

import java.util.Scanner;

public class Ex44_1 {
    // 각 요일들을 숫자로 구분지었습니다.
	final static int Monday = 1; // 월요일  
	final static int Tuesday = 2; // 화요일 
	final static int Wednesday = 3; // 수요일
	final static int Thursday = 4; // 목요일
	final static int Friday = 5; // 금요일 
	final static int Saturday = 6; // 토요일
	final static int Sunday = 7; // 일요일
	
	public static void main(String[] args) {
		
		String going = "oh my god"; // 알바를 간다.
		String Notgoing = "enjoy";  // 알바를 안간다.
		
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		
		if(1<=day && day <=7) {
			// 일을 가는 월,수,금,일
			if(day == Monday || day == Wednesday || day == Friday || day == Sunday) {
				System.out.println(going);
			}
			// 일을 안가는 화,목,토
			if(day == Tuesday || day == Thursday || day == Saturday) {
				System.out.println(Notgoing);
			}
		} else {
			System.out.println("숫자는 1부터 7까지입니다.");
		}
        sc.close();
	}
}
