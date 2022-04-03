package chap12.Ex01;

abstract class D{		//클래스 내부에 추상 메소드가 올 경우 abstract클래스가 되어야 한다.
	
	abstract void print(); 		//구현부가 없는 선언만 된 메소드, 추상 메소드
}

class E extends D{

	@Override
	void print() {
		System.out.println("E 클래스의 print()");
	}		//자식 클래스는 추상클래스의 메소드를 재정의.
	
	
}

public class AbstractClass_3 {

	public static void main(String[] args) {

		//1. 객체화해서 출력. (객체 3개 생성 후 print() 메서드 출력)
		D a1 = new E();
		D a2 = new E();
		D a3 = new E();
		
		a1.print();
		a2.print();
		a3.print();
		
		//2. 익명 클래스를 생성해서 출력(print() 메서드 3번 출력)
	
		D a4  = new D() {
			@Override
			void print() {
				System.out.println("익명 클래스의 print()");
			}
		};
		D a5  = new D() {
			@Override
			void print() {
				System.out.println("익명 클래스의 print()");
			}
		};
		D a6  = new D() {
			@Override
			void print() {
				System.out.println("익명 클래스의 print()");
			}
		};
		
		
		a4.print();
		a5.print();
		a6.print();
	}

}
