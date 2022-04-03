package chap06_07.EX02;

class B{
	
	static String name="BTS";	// static 키가 할당되면 객체 생성없이 호출
	
	static void print() {
		System.out.println(name);
		System.out.println("static이 붙은 메소드입니다.");
	}
}


public class MethodOverloading {

	public static void main(String[] args) {
		//메소드 오버로딩: 하나의 메소드명을 매개변수에 따라 호출하는 것 (Java)
		//메소드 오버라이딩: 상속에서 부모 클래스의 메소드를 재정의하여 사용하는 것 
		
		//static: 객체 생성 없이 바로 호출해서 사용가능하도록 해주는 키워드
			//객체 이름이 아니라 클래스 이름으로 호출해서 사용가능

		
		// B b = new B(); 이걸 안했다는 뜻
		System.out.println(B.name);		//객체 이름이 아닌 클래스 이름으로 호출이 가능
		B.print();						//클래스 이름으로 호출
		
		
		System.out.println("====================");
		print1();
		print1(2);
		print1(3.4);
		print1(2,4);
	}

	// 메소드 오버라이딩: 메소드 이름은 동일, 매개변수 타입, 매개변수 개수에 따라 해당 메소드 호출이 결정된다.
	//JVM이 동일한 메소드 이름의 데이터 타입이나 개수에 따라서 해당 메소드를 작동
	
	//주의: 동일한 매개변수타입과 개수이면 오류가 발생됨
	
	public static void print1() {		//메소드 이름 앞에 static
		System.out.println("데이터가 없습니다. ");
	}
	
	public static void print1(int a) {
		System.out.println("정수: "+a);
	}
	public static void print1(double a) {
		System.out.println("double: "+a);
	}
	public static void print1(int a, int b) {
		System.out.println("a: "+ a +" b: " +b);
	}
}

