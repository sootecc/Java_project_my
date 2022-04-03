package chap12.Ex06;

//interface의 default 메소드: 인터페이스 내에 구현부가 있는 메소드
	// public default void bcd(){}
	// java 1.8 이상에서 새롭게 추가된 기능 ..

	// default키를 넣어야 하고 접근지정자가 아니다.
	
//기존의 구현되어 있는 인터페이스에서 새로운 기능을 추가할 때 하위 클래스에서 재정의 필요없이 새로운 기능을 추가 할 때 사용
	
interface A{
	void abc();				//2005년 생성된 메소드, public abstract가 생략됨. 구현부가 없는 추상 메소드
	default void bcd() {	//2020년 생성된 메소드
		System.out.println("A 인터페이스의 bdc()");
	}
	//void ttt();   상위 클래스에서 새로운 추상 메소드를 추가하면 상속된 모든 하위 클래스는 오류 발생
}

class B implements A{
	public void abc() {
		System.out.println("B 클래스의 abc()");
	}
}

class C implements A{
	public void abc() {
		System.out.println("C 클래스의 abc()");
	}
	public void bcd() {			//default 메소드도 오버라이딩 할 수 있다.
		System.out.println("C 클래스의 bcd()");
	}
}



public class DefaultMethod {

	public static void main(String[] args) {
		
		//1. 객체 생성
		A a1 = new B();
		A a2 = new C();
		
		//2. 메소드 호출
		a1.abc();	//
		a2.abc();
		
		
			
	}

}
