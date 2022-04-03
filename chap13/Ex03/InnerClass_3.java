package chap13.Ex03;

/*
 * static innerclass: 외부클래스의 인스턴스 필드, 인스턴스 메소드는 접근 불가
 * 					  외부클래스의 static 필드, static 메소드는 접근 가능
 */



class A{
	int a = 3;				//인스턴스 필드, 객체화해야 접근 가능
	static int b = 4;		//static 필드, 객체 생성 없이 접근 가능
	
	void method1() {		//인스턴스 메소드: 객체 생성 후 접근
		System.out.println("instance method");
	}
	static void method2() {	//static 메소드: 객체 생성 없이 접근 가능
		System.out.println("static method");
	}
	static class B{			//static 이너클래스: 외부 객체를 생성하지 않고 객체 접근 가능
		void bcd() {
			//1. static class에서 외부클래스의 인스턴스 필드 접근 불가
			//System.out.println(a);
			
			System.out.println(b);	//static 이너클래스에서 외부클래스의  static 필드나 메소드 접근 가능
			
			
			//2. 메소드 호출
			//method1();	인스턴스 메소드 호출 불가	
			method2();	//	static 메소드 호출 가능
		
		}
	}
}


public class InnerClass_3 {

	public static void main(String[] args) {
		//1. static 이너클래스 객체 생성
		A.B	b = new A.B();			//static 이너클래스는 외부 객체 생성 없이 객체 생성 가능
		b.bcd();
		
	}

}
