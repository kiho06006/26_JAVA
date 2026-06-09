package day07;

// Circle 클래스
class Circle {
    int radius;
    String name;

   public Circle() {
	   this(0,"");
   }
   
   public Circle(int radius) {
	   this(radius,"불고기 피자");
   }
   public Circle(int radius, String name) {
	   this.radius = radius;
	   this.name = name;
   }
   
   public double getArea() {
	   return 3.14*radius*radius;
   }
}

// 메인 클래스
public class Pizza {

    public static void main(String[] args) {

        // 도넛 객체 생성 (반지름 5, 이름 "자바도넛")
//        Circle donut = new Circle(5, "자바도넛");
//
//        // 면적 출력
    		Circle pizza,pizza2;
    		pizza = new Circle();
    		pizza2 = new Circle(10,"치즈피자");
    		System.out.println(pizza.name + "의 면적은 " + pizza.getArea());
    		System.out.println(pizza2.name);

    		
    }
}
