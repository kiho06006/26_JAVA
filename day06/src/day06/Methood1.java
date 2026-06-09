package day06;

import java.util.Scanner;

public class Methood1 {
	
	// 1. 매개변수도 없고 반환형도 없는 add()메소드
	public static void add() {
		Scanner scan=new Scanner(System.in);
		int num = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println(num + num2);
	}
	
	// 2. 매개변수는 있고 반환형은 없는 add()메소드
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	// 3. 매개변수는 없고 반환형은 있는 add1()메소드
	public static int add1() {
		Scanner scan=new Scanner(System.in);
		int num = scan.nextInt();
		int num2 = scan.nextInt();
		return num+num2;

	}
	
	// 4. 매개변수와 반환형이 모두 있는 add2() 메소드
	public static int add2(int a, int b) {
		return a+ b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//add();
		//add(50,60);
		//System.out.println(add1());
		//호출
		//System.out.println(add2(50,60));
		
		int result = add2(50,60);
		System.out.println(result);


	}

}
