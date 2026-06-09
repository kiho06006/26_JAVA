package day06;

import java.util.Scanner;

public class Overloading {
	// 메소드 오버로딩 : 메소드 이름은 같고, 매개변수의 갯수와 타입은 다르게 정
	public static void coffee(int c) {	//블랙커피
		System.out.println("블랙 커피");
	}
	public static void coffee(int c,int cr) {	//크림커피
		System.out.println("크림 커피");
	}
	public static void coffee(int c, int cr, int s) {	//믹스커피
		System.out.println("믹스 커피");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coffee(3,3,3);
		coffee(2);
		coffee(3,2);

	}

}
