package day06;

import java.util.Scanner;

public class Methood2 {
	
	// 2개의 정수를 입력 받아서 최대값을 반환하는 max()메소드를 정의하고 호출 한 후 결과를 출력하시오. 
	public static int max(int a, int b) {
		int maxNUM =a;
		if(b>maxNUM) {
			maxNUM = b;
		}
		return maxNUM;
		
	}
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a, b, max;
		System.out.println("정수 1입력 : ");
		a = scan.nextInt();
		System.out.println("정수 2입력 : ");
		b = scan.nextInt();

	}

}
