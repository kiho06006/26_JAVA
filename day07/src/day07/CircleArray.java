package day07;

public class CircleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 객체 배열 생성
		Circle c[];
		c = new Circle[5];
		
		for(int i =0; i<c.length; i++) {
			c[i] = new Circle(i);
		}
		
		for(int i =0; i<c.length; i++) {
			System.out.println((int)c[i].getArea());
		}

	}

}
