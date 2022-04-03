package chap10.Ex06;


//super: 부모 클래스(상속관계)
//this: 자신의 객체

//오버라이딩: 덮혀있다. 자식의 메소드가 부모의 메소드를 덮긴하지만 부모를 다시 호출할 수 있음(없어지지 않음)
//

class A {
	void abc() {
		System.out.println("A 클래스의 abc 메소드");
	}
}
class B extends A{
	void abc() {
		System.out.println("B 클래스의 abc 메소드");
	}
	void bcd() {
		abc();	//this.abc		this는 자신의 객체
		super.abc();		
	}
}

public class SuperKeyword_1 {

	public static void main(String[] args) {
		//1. 객체 생성
		B bb = new B();
		
		//2. 메소드 호출
		bb.bcd();	 
	
	}

}
