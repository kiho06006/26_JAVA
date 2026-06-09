package day11;

class Point {
	
	// 정보은닉
	private int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// getter, setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	// 메소드 오버라이딩toString()
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "Point(" + x + "," + y + ")";
	}

	
}

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point point = new Point(300,500);
		System.out.println(point.toString());

	}

}
