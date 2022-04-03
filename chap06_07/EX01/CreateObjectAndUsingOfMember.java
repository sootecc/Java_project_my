package chap06_07.EX01;

//클래스(class): 설계도, 붕어빵의 틀
//객체(object): 클래스를 복사하여 RAM에서 작동되는 실행코드(붕어빵)
	//객체 = 인스턴스
	//인스턴스화(객체화)시킨다.	(메인 메소드에서 객체를 인스턴스화 시켜줘야한다.
	// A a = new A();		<==클래스를 객체화시켜서 메모리에 로드
	

class A {	//외부 클래스
	int m = 3;			//필드(변수) : class block에서 선언된 변수
						//필드는 인스턴스화(객체) 시켜야 사용이 가능
						//필드는 메모리의 Heap 영역에 생성
	
	
	void print() {								//메소드: 절차지향언어의 함수	
		System.out.println("객체 생성 및 활용");
	
	}
	
}

class B {	//외부 클래스
	String name = "홍길동";
	int age = 24;
	String phone = "010-1111-1111";
	
	void printName() {
		System.out.println(name);
	}
	void printAge() {
		System.out.println(age);
	}
	void printPhone() {
		System.out.println(phone);
	}
}





public class CreateObjectAndUsingOfMember {	//public이라는 키가 들어간 클래스는 하나만 있어야 하고 그 클래스의 이름이 파일 이름이어야한다.

	public static void main(String[] args) {
		
		
		A a = new A();				//Class A를 객체화(인스턴스화)시킨다. (메모리에 로드)
		System.out.println(a.m);
		a.print();
		
		System.out.println("==========================");
			
		A b = new A();				//Class A를 객체화(인스턴스화)시켜서 RAM에 로드.
		System.out.println(b.m);
		b.print();
		
		System.out.println("==========================");
		
		A c = new A();
		System.out.println(c.m);
		c.print();
		
		System.out.println("==========================");
		
		
		
		
		B bb = new B();
		System.out.println(bb.age);
		System.out.println(bb.name);
		System.out.println(bb.phone);
		bb.printAge();
		bb.printName();
		bb.printPhone();
		
		B cc = new B();
		System.out.println(cc.age);
		System.out.println(cc.name);
		System.out.println(cc.phone);
		cc.printAge();
		cc.printName();
		cc.printPhone();
		
		
		
	}

}
