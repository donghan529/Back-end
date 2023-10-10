package exam;

import java.util.Scanner;

public class Ex44_1 {
	final static int Monday = 1;   
	final static int Tuesday = 2; 
	final static int Wednesday = 3;
	final static int Thursday = 4; 
	final static int Friday = 5;  
	final static int Saturday = 6; 
	final static int Sunday = 7; 
	
	public static void main(String[] args) {
		
		String going = "oh my god"; 
		String Notgoing = "enjoy";  
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		
		if(1<=day && day <=7) {
			if(day == Monday || day == Wednesday || day == Friday || day == Sunday) {
				System.out.println(going);
			}
			if(day == Tuesday || day == Thursday || day == Saturday) {
				System.out.println(Notgoing);
			}
		} else {
			System.out.println("숫자는 1부터 7까지입니다.");
		}
        sc.close();
	}
}
