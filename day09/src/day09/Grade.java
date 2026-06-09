package day09;

import java.util.Scanner;

public	class	Grade	{
//	이름,	과목점수3개 필드(속성,	멤버변수)	선언
	private String name;
	private int java;
	private int web;
	private int os;
	
//	인자 생성자
	public Grade(String name, int java, int web, int os) {
		this.name =name;
		this.java = java;
		this.web = web;
		this.os = os;
	}
//	이름(name)을 반환하는 getName()	메소드 정의
	public String getName() {
		return name;
	}
//	평균을 계산해서 정수로 반환하는 getAverage()메소드 정의
	public int getAverage() {
		return (java + web + os) /3;
	}
public	static	void	main(String[]	args)	{
	Scanner	scanner	=	new	Scanner(System.in);
	System.out.print("이름,	자바,	웹프로그래밍,	운영체제 순으로 점수 입력>>");
	String	name	=	scanner.next();
	int	java	=	scanner.nextInt();
	int	web	=	scanner.nextInt();
	int	os	=	scanner.nextInt();
	
	Grade	st	=	new	Grade(name,	java,	web,	os);	//	한 명의 점수 객체 생성
	System.out.print(st.getName()	+	"의 평균은 "	+	st.getAverage());
	scanner.close();
}
}
