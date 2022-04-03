package chap13.Ex09;

//4. 인터페이스를 구현한 클래스가 없다. 매개변수로 받아서 처리


interface A{
	void abc();
	
}

class C {
	void cde(A a) {
		a.abc();
	}
}


public class AnonymousClass_4 {

	public static void main(String[] args) {
		
		C c = new C();
		
		//4-1. 인터페이스를 구현한 클래스 X , 참조변수를 만들어 전달
		A a = new A() {	//인터페이스를 구현한 자식 익명 객체 생성 후 타입을 A로 지정한 참조변수 던져줌 
			@Override
			public void abc() {
				System.out.println("클래스 X, 참조변수 O");
			}
		};
		
		c.cde(a);	//참조변수를 매개변수로 전달
		
		
		System.out.println("==============================");
		//4-2. 인터페이스를 구현한 클래스 X, 참조변수 생성 X   << 가장 많이 사용됨 (임시로 한 번만 사용할 때, 이벤트처리)
		c.cde(new A() {
			@Override
			public void abc() {
				System.out.println("클래스 X, 참조변수 X");
			}
		});
		
		//기본적으로 인터페이스의 내용은 어디에서든지 구현을 해야하네
		
	}

}
