package my.app;
import java.util.Vector;


class Point{
	private int x,y;
	//인자 생성자
	public Point(int x,int y) {
		this.x =x;
		this.y =y;
	}
	
	public point() {
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	//getter,setter
	
}


public class PointVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Vector 객체
		Vector<Point> pvectors = new Vector<Point>();
		
		//자료 저장(원소(요소) 삽입)
		pvectors.add(new Point(3,5));
		pvectors.add(new Point(30,70));
		
		//자료 검색
		System.out.println(pvectors.get(0));
		System.out.println(pvectors.get(1));
		
		for(Point p:pvectors) {
			System.out.println(p.getX());
			System.out.println(p.getY());
		}
		

	}

}
