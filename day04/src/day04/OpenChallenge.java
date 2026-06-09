package day04;

import java.util.Scanner;

public class OpenChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위,바위,보 게임입니다. 가위,바위,보 중에서 입력하세요.");
		
		System.out.print("철수 : ");
		String cs = sc.next();
		
		System.out.print("영희 : ");
		String yh = sc.next();
		
		if(cs.equals(yh)) {
			System.out.println("비겼습니다.");
		} else if (
			(cs.equals("가위") && yh.equals("보"))||
			(cs.equals("바위") && yh.equals("가위"))||
			(cs.equals("보") && yh.equals("바위"))
			) {
				System.out.println("철수가 이겼습니다.");
			}
			else {
				System.out.println("영희가 이겼습니다.");
			}

	}

}
