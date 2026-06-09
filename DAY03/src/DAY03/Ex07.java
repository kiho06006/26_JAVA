package DAY03;

import java.util.Scanner;
public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade;
		Scanner scan = new Scanner(System.in);
		
		//id / pw 초기화
		
		System.out.println("점수를 입력하세요 : ");
		int score = scan.nextInt();
		
		//아이디는 hong  
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80){
			grade = 'B';
		} else if (score >= 70) 
			grade = 'C';
		else if (score >= 60) {
			grade  = 'D';
		}
		else
			grade = 'F';
		
		System.out.println("학점은" + grade + "입니다.");

	}

}
