package chap13.Ex08;

//클래스 정의 및 참조 변수를 사용/ 미사용인 경우 매개변수로 객체를 전달

interface A{
	public abstract void abc();
}
// 1. 자식 클래스를 직접 생성

class B implements A{
	@Override
	public void abc() {
		System.out.println("매개변수 전달");
	}
}

class C {	//cde 메소드에 input값으로 A 타입의 객체 a를 받는다.
	
	void cde(A a) {		//매개변수 값으로 A타입의 객체를 던져준다.
		a.abc();
	}	
}



public class AnonymousClass_3 {

	public static void main(String[] args) {
		
		// 방법 1: 클래스명 o + 참조변수명 o
		C c = new C();		
		A a = new B();		//참조 변수 생성
		c.cde(a);			//매개변수에 객체 a를 생성해서 던져줌
		
		System.out.println("===================");
		// 방법 2: 클래스명 o + 참조변수명 x
		c.cde(new B());
		
	}

}
