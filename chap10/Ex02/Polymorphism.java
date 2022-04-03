package chap10.Ex02;
		
//다형성: 객체의 상속 관계에서 여러 데이터 타입으로 변환 가능

class A{}
class B extends A{}
class C extends B{}
class D extends B{}


public class Polymorphism {

	public static void main(String[] args) {
		
		// 1. 업캐스팅 (자동으로 변환): 생략시 컴파일러가 자동으로 추가
		A ac = (A) new C();	// C는 A타입으로 업캐스팅, ac는 A,B,C의 필드와 메소드를 모두 포함, A에만 접근 가능
		A ab = new B();		// B는 A타입으로 업캐스팅, ab는 A,B의 필드와 메소드를 모두 포함, A에만 접근 가능
		B bd = new D();		// D는 B타입으로 업캐스팅, bd는 A,B,D의 필드와 메소드를 모두 포함, A,B에만 접근 가능
		C c = new C();		// C는 C타입으로 정의, c는 A,B,C의 필드와 메소드를 모두 포함, A,B,C에 접근 간으
		
		
		// 객체 생성을 할 수 없는 경우(상속)
		// B b = new A();
		// C cc1 = new B();
		// D dd1 = new B();
	
		
		// 2. 다운캐스팅 (수동으로 변환): 캐스팅이 불가능하면 런타임 에러
		A aa = new A();
		// B b1 = (B) aa;	//aa를 B로 다운캐스팅 < 런타임 에러.
							// 다운캐스팅시 객체(aa) 내 해당 타입(B)이 존재하지 않기 때문에 런타임에러
		// C cc2 =  (C) aa;

			//컴파일 오류: 프로그램을 실행하기 전 이클립스가 체크하여 나타나는 오류
			//런타임 오류: 실행시 발생되는 오류
	
		//다운 캐스팅 가능(수동 변환)
		A ac3 = new C(); 	//ac3는 A,B,C 포함
		
		B ac5 = (B) ac3;	//
		C ac6 = (C) ac3;
		
		A ad2 = new D(); 	//ad2는 A,B,D 포함, A만 사용 가능
		B bd3 = (B) ad2;
		D dd4 = (D) ad2;
	
	
	
	}

}
