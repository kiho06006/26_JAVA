package day07;

public class Perosn {

    public static String name;
    int age;
    char abc;
    
    ///////////////////////////
    private String addr;
    ///////////////////////////
    /// 
    

    // 생성자 (여기 위치 중요!)
    public Perosn() {
        name = "홍길동";
        age = 20;
        abc = 'A';
        System.out.println("객체가 생성됨.");
    }
    
    public static String getName() {
    		return name;
    }

    public static void main(String[] args) {

        Perosn p = new Perosn(); // 객체 생성

    }
}


