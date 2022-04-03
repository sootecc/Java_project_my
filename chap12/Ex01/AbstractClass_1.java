package chap12.Ex01;

class AA{		//일반 클래스: 객체 생성시 필드와 메소드는 Heap메모리 영역에 저장
				//Heap: 반드시 값을 가져야하므로 자동 초기화가 진행된다.
				//필드: Heap에 필드명과 값
				//인스턴스 메소드: class 영역의 인스턴스 영역에 메소드의 구현코드까지 저장. heap에는 포인터
	
	int a;
	double b;
	char c;
	boolean d;
	byte e;
	float f;
	String g;	//참조변수
	
	void cry() {}	//완전한 메소드
	@Override
		public String toString() {
			return a+", "+b+", "+c+", "+d+", "+e+", "+f+", "+g;
		}
}

/*추상클래스를 객체화해서 출력하는 방법 1
	상속을 통해서 자식 클래스를 생성 -> 자식 클래스에서 추상 메소드를 재정의 -> 자식클래스를 객체로 생성 후 출력
	많은 객체를 생성해서 계속 사용할 때 이 방법을 사용
	
  방법 2
    자식 클래스 생성 없이, main메소드에서 익명 객체를 생성하여 출력
    임시로 한 번 사용할 때 이 방법을 사용 (ex. 이벤트 처리)
*/
abstract class A{	//추상 클래스: 미완성 메소드를 포함하므로 객체 생성이 불가함
	abstract void abc();		//추상 메소드(미완성 메소드): 구현부가 존재하지 않는 메소드
	
	
}

class B extends A{	
	@Override
	void abc() {
		System.out.println("방법 1: 자식클래스 생성 및 추상 클래스 구현");
	}
}

public class AbstractClass_1 {

	public static void main(String[] args) {
		
		//1. AA 클래스는 객체화가 가능하다.
		AA aa  = new AA();	//필드: 초기화, 일반 메소드(구현부가 존재하는 메소드)
		System.out.println(aa);	//객체를 생성하려면 heap공간에 값이 반드시 들어가 있어야한다.
		
		//2. 추상메소드는 객체 생성 불가: 메소드가 미완성 메소드기 떄문에 객체 생성이 불가
		// A a =  new A(); 추상 메소드를 포함한 추상 클래스이기 때문에 객체 생성 불가
		
		//3. 추상 클래스가 구현된 자식 클래스 생성, 객체 여러 개를 생성할 때
		A a1 = new B();	//자식 클래스 생성, 부모 타입
		A a2 = new B();
		A a3 = new B();
		
		
		//4. 메소드 호출
		a1.abc();		//A의 abc 메소드를 호출 => 오버라이딩에 의해 B의 abc()가 작동
		a2.abc();
		a3.abc();
		
	}

}
