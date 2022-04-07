package chap18.Ex01;




//1. 자바는 객체지향프로그램(OOP) : 모든 함수(메소드)는 객체 내부에 존재해야 한다. 함수는 클래스, 인터페이스
//	람다식: 자바에서 함수형 프로그래밍이 가능하도록 지원해주는 하나의 기능
//		- 기존의 구현된 메소드를 재정의하는 것이 아니라 구현부가 없는 메소드에 람다식으로 기능을 부여해서 작동 시키는 문법
//		- 람다식은 가능한 한 축약된 문법을 사용 (생략 가능한 것을 최대한 생략해서 표현)

//		- 람다식은 자바에서 내부적으로 익명 클래스로 변환되어 처리된다.
//		- 람다식은 함수형 인터페이스에서 익명 클래스로 변환이 가능하다.
//		- 람다식은 함수형 인터페이스의 구현된 익명 클래스를  람다식으로 축약

//		- 함수형 인터페이스: 인터페이스에 단 한 개의 추상메소드가 정의된 인터페이스를 함수형 인터페이스라 한다.

@FunctionalInterface		// @: annotation,  @FunctionalInterface : 함수형 인터페이스를 선언해주는 역할, 추상 메소드가 하나만 와야함.
interface A{	//함수형 인터페이스
	void abc(int a);	//public abstract 생략됨
}

//인터페이스에 정의된 메소드를 구현하는 방법
//1. 인터페이스를 구현한 클래스를 생성
//2. 익명 이너 클래스

class B implements A{

	@Override
	public void abc(int a) {
		System.out.printf("%s%d%s","메소드 내용1",a,System.lineSeparator());
	}
}


public class OOP_VS_FP {		//개체 지향 vs 함수형 

	public static void main(String[] args) {

		//자바는 객체지향 프로그램이므로 모든 함수(메소드)는 클래스 내부에 있고 객체 생성 후 호출, 객체 생성 없이 함수명으로 바로 호출이 불가능
		//1. 객체지향 프로그래밍 문법: 클래스를 생성하여 사용. 모든 메소드는 객체 내부에 존해하며, 객체를 생성 후 호출 가능
		A a1 = new B();
		a1.abc(1);
		
		
		//2. 객체지향 프로그래밍 문법: 익명 이너클래스를 생성하여 사용
		//인터페이스의 추상메소드를 직접 구현한 클래스를 생성하지 않고 익명 이너클래스를 사용해서 메소드 호출
		A a2 = new A() {
			@Override
			public void abc(int a) {
			System.out.printf("%s%d%s","메소드 내용2",a,System.lineSeparator());
			}
		};
		a2.abc(2);		//OOP는 객체 생성 후 메소드 호출
		
		
		//3. 람다식(함수적) 프로그래밍 문법(람다식)
		A a3 = (int a) -> {System.out.printf("%s%d%s","메소드 내용3",a,System.lineSeparator());};		//람다식에 사용되는 인터페이스는 함수형 인터페이스여야 한다.
		a3.abc(3);
		
		A a4 = (int a) -> {System.out.println(a);};
		a4.abc(5);
		
	}

}
