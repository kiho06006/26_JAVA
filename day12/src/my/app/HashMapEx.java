package my.app;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		// HashMap 선언 (Key: 문자열, Value: 정수)
		HashMap<String, Integer> hashm = new HashMap<String, Integer>();
		
		// 올바른 데이터 삽입 방법: put(Key, Value)
		hashm.put("홍길동", 70);
		hashm.put("이길동", 100);
		hashm.put("강길동", 50);
		hashm.put("박길동", 90);
		
		// "이길동"이라는 Key에 매핑된 Value(정수)를 출력
		System.out.println(hashm.get("이길동"));
	}

}
