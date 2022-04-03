package chap14.Ex07;

// Exception - Checked Exception : 컴파일 단계에서 오류 발생, 반드시 예외 처리
//			 - unChecked Exception (runtime exception) : 실행시 예외 발생

// 예외 처리 방식 - try catch : 자신이 직접 예외를 처리
//			  - throws : 예외 처리를 미루는 것, 메소드 블록 안에 있는 예외를 호출하는 곳으로 전가하는 것

// * throw : 강제로 예외를 발생시키는 것

// 하위 메소드에 예외를 처리하는 경우
//1. Exception이 발생되는 메소드 내부에서 자신이 직접 예외를 처리하는 경우
class A {
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object");
			Thread.sleep(1000);
		} catch (ClassNotFoundException | InterruptedException e) {
		}		
		//일반 예외 ClassNotFoundException, InterruptedException
			//Class.forname: 동적 로딩 - 컴파일시에 체크하지 않고 실행할 때 객체가 존재하는지 확인
			//실행시 클래스 파일이 존재 할 수도 있고 아닐 수도 있기 때문에 예외 처리를 해줘야 한다.
	}
}		

//2. throws를 사용하여 exception처리를 미루는 경우
class B{
	void abc() {
		try {
			bcd();
		} catch (ClassNotFoundException | InterruptedException e) {
		}
	}
	void bcd() throws ClassNotFoundException, InterruptedException{
		//예외를 던져
			Class cls = Class.forName("java.lang.Object");
			Thread.sleep(1000);
	
	}
	
}


public class ThrowsException_3 {

	public static void main(String[] args) {

		
		
		
		
	}

}
