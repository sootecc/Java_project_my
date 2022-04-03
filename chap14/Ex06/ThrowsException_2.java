package chap14.Ex06;

//일반 예외 (Checked Exception): 컴파일 단계에서 예외, 
		//1. 직접 처리 
		//2. throws로 전가

		//main 메소드에 throws를 전가시킬 때, Exception이 발생되면 정보를 출력해주고 중지

public class ThrowsException_2 {

	public static void main(String[] args) throws ClassNotFoundException {
	
		//정상적으로 파일이 존재. ClassNotFoundException 이 발생되지 않는다.
		Class cls = Class.forName("java.lang.Object");
		
		//파일이 존재하지 않음. ClassNotFoundException 이 발생된다.
		Class cls2 = Class.forName("java.lang.Object00");
		
		
		
	}

}
