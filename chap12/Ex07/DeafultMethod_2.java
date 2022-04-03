package chap12.Ex07;

interface A{	//부모 인터페이스
	
	default void abc() {	//인터페이스에서 구현부가 있는 메소드를 정의할 때 default
		System.out.println("A 인터페이스의 abc()");
	}
}

class B implements A{		//extends Object가 생략
	public void abc() {		//오버라이딩
		//super.abc();		//모든 클래스는 Object를 상속받기 때문에 이것은 Object의 abc()를 뜻함
		A.super.abc();		//요렇게 해야 interface의 abc()
		System.out.println("B 클래스의 abc()");
	}
}


public class DeafultMethod_2 {

	public static void main(String[] args) {
		
		//1. 객체 생성
		B b = new B();
		
		//2. 메소드 호출
		b.abc();	//B의 abc()를 호출
		
		System.out.println("==============");
		
		A a1 = new B();		//인터페이스는 객체 생성 불가, 타입은 가능
		a1.abc();			//오버라이딩에 의해 B의 abc()
		
	}

}
