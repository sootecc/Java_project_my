package chap11.Ex01;

/* Final : 마지막
 	- 필드명, 지역변수명: 상수, final int PI = 3.14
 	  상수는 값을 변경할 수 없다.
 	  상수 영역에 값이 복사, 객체나 메소드가 사라질 경우에도 호출 가능
 	
 	-메소드명: 오버라이딩이 불가한 메소드 
 		final void print(){}
 	
 	-클래스명: 상속이 불가한 클래스 (자식 클래스를 두지 않는 마지막 클래스)
 		final class A{}
 
 */

class A1{
	int a = 3;				//필드명, 지역변수명은 소문자를 사용. 
	final int B = 5;		//상수명 대문자로 사용
	A1(){
		
	}
}

class A2{
	int a;
	final int B;
	A2(){
		a = 3;
		B = 5;
	}
}

class A3 {
	int a = 3;				//필드: 값 변경 가능
	final int B = 5;		//상수: 값 변경 불가
	A3(){
		a=5;
	//	B=10; final은 값 수정 불가
	}		
}

class B{
	
	void bcd() {			// 지역 변수: 메소드에서 선언한 변수(메소드 호출이 끝나면 지역변수는 사라짐)
		int a = 3;			// 스택 공간에 변수의 값이 할당. 메소드 호출이 끝나면 사라짐
		final int B = 5;	// 상수는 클래스 영역의 상수 영역에 복사가 되기 때문에 메소드가 끝나더라도 남아있다.
		a = 7;
		
	}
	
}

public class FinalModifier_1 {

	public static void main(String[] args) {
		
		
		
	}

}
