package chap13.Ex04;

//지역 이너클래스: 클래스의 메소드 내부에 선언된 클래스
	//메서드 내부의 필드는  final 키가 생략됨. 값을 수정 할 수 없다.
	//지역이너클래스에서 사용되는 지역 변수는 자동으로 final로 선언된다.
class A{
	int a = 3;		//필드: Heap, 반드시 초기화가 강제로 진행됨
//	a = 4;			//값이 할당된 필드의 초기값을 수정하려면 객체화해서 값을 수정해야한다.
					//생성자나 setter를 통해서 초기값을 할당후에 객체를 생성
	A(int a){
		this.a = a;
	}
	public void setA(int a) {	//setter
		this.a = a;
	}
	
	void ccc() {	//지역변수: 메서드 내부의 변수, 메모리의 스택 공간에 저장
		int a = 3;	//지역변수 초기값 3 할당
		a = 4; 		
		a = 10;
		int b;
		b = 0;		//지역변수기때문에 초기값을 넣어줘야한다.
		
		System.out.println(a);
		System.out.println(b);	
	}
	
	
	
	void abc() {
		int b = 5;		//지역 변수: 메소드 내부에 선언된 변수
						//이너클래스가 아닌 abc() 안에서는 지역변수 값 변경 가능
						//이너 클래스에서 사용하려하면 자동으로 final이 붙는다.
		
		class B{		//지역 이너클래스
			void bcd() {
				System.out.println(a);		//필드
				System.out.println(b);		//지역변수
				a = 5;			//필드는 값 수정 가능
				//b = 7; 		//지역클래스 내부에 선언된 지역변수는 자동으로 final
				
			}
		}
		
		B bb = new B();
		bb.bcd();
	}
}

public class InnerClass_4 {

	public static void main(String[] args) {
		
		//1. 객체를 생성 후 메소드 호출
		A a = new A(3);
		a.abc();
		
		
		
	}

}
