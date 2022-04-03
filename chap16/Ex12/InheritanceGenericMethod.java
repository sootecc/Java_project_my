package chap16.Ex12;

//제네릭 메소드의 상속: 일반 클래스 내의 제네릭 메소드

class Parent{		//일반 클래스
	
	// Number: Boolean Character를 제외한 Wrapper(기본 데이터 타입을 객체형으로 변환) 타입의 클래스가 올 수 있다.
		//Byte, Short, Integer, Long, Float, Double
	
	<T extends Number> void print(T t) {		//제네릭 메소드
		System.out.println(t);
	}	//객체 자체 출력
}

class Child extends Parent{		//제네릭 메소드 상속은 일반 상속과 같다.
	
} 



public class InheritanceGenericMethod {

	public static void main(String[] args) {
		
		//1. 부모 클래스의 제네릭 메소드 사용
		Parent p = new Parent();
		p.<Integer>print(100);
		p.<Double>print(100.2234);
		p.print(300);		//생략해도 가능하긴함 경고 안뜨면 사용해보자
		p.print(300.333);
		
		
		//2. 자식 클래스에서 제네릭 메소드 사용
		Child c = new Child();
		c.<Integer>print(200);
		c.<Double>print(200.12345);
	}

}
