package chap18.Ex04;

//람다식의 활용
	//1. 익명이너클래스를 활용하는 방법
	//2. 메소드 참조 (인스턴스 메서드 참조, 정적 메소드 참조)
			//메소드 참조 : 구현되어 있는 메소드를 참조. 
				//메소드 참조를 위해선 리턴 타입과 매개변수가 동일해야 한다.
@FunctionalInterface
interface A {
	void abc();
}

class B {
	void bcd() {		//인스턴스 메소드: 객체화해야 호출이 가능
		System.out.printf("%s%s","메서드",System.lineSeparator());
	}
}


public class RefOfInstanceMethod_Type_1 {

	public static void main(String[] args) {
		// 1. 인스턴스 메소드 참조 type 1 : 익명 이너클래스
		A a1 = new A() {
			@Override
			public void abc() {
				B b1 = new B();
				b1.bcd();
			}
		};
		
		// 2. type1을 람다식으로 표현
		A a2 = () -> {
			B b2 = new B();
			b2.bcd();
		};
		
		// 3. 인스턴스 참조 표현식 type1
		B b = new B();			//인스턴스 객체를 생성, 객체명::메소드명
		A a3 = b::bcd;			//<= '인스턴스' 참조 표현 <<리턴타입이 같아야한다. 매개변수가 동일해야 한다.
		
		a1.abc();
		a2.abc();
		a3.abc();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
