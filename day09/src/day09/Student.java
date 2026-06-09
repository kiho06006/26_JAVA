package day09;

public class Student extends Human{
	
	// 학생만이 갖는 필드(속성) 정의
	private String sid;
	
	
	//인자 생성자..
	public Student(String name, int age, String sid) {
		super(name,age);
		this.sid = sid;
	}
	
	//getter, setter
	public String getSid() {
		return sid;
	}
	
	public void setSid(String sid) {
		this.sid =sid;
	}
}
