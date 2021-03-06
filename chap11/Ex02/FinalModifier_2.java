package chap11.Ex02;

//final method & final class 특징

//final method: 중요한 메서드는 자식에서 재정의 할 수 없도록 설정
//final class: 상속이 불가한 클래스

class A {
	void abc() {
		
	}
	final void bcd() {		//final 할당된 메소드는 자식 클래스에서 오버라이딩이 불가
		
	}
}

class B extends A {
	void abc() {}		//메소드 오버라이딩됨
//	void bcd() {}		//메소드 오버라이딩 불가함
	
}

final class C{}		//final class는 상속이 불가한 클래스
//class D extends C{}	상속 불가

public class FinalModifier_2 {

	public static void main(String[] args) {

	}

}
