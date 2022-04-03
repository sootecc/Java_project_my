package chap14.Ex02;

import java.io.FileInputStream;
import java.io.InputStreamReader;

//Checked Exception (일반 예외): 컴파일 단계에서 예외가 발생
// 컴파일하기(빌드) *.java --> *class 전에

//unChecked Exception (실행 예외), Runtime Exception: 실행시에 예외가 발생될 수 있다.
	//예외 필수는 아니지만 예외 처리

class A{
	
	B b ;
	
	A(){}
	A(B b){
		this.b = b;
	}
	
	interface B{		//인터페이스 선언
		void cry();
	}
	
	void abc() {
		System.out.println(b);
		b.cry();
	} 
}


public class CheckedException {

	public static void main(String[] args) {
		//1. 일반 예외: 컴파일 단계에서 예외 처리가 필요.
		
		//InterruptedException: 스레드 중간에 끼어들기가 발생하면 예외 발생
		//Thread.sleep(1000);
	
		//ClassNotFoundException: 클래스를 찾지 못하는 예외
		//Class cls = Class.forName("java.lang.Object");
	
		//IOException: 네트워크에서 값을(정보) 읽어오지 못할 수 있는 예외
		//System.in: 콘솔을 뜻함
		InputStreamReader in = new InputStreamReader(System.in);
		//in.read();
	
		//FileNotFoundException: 파일을 찾지 못하는 예외가 발생
		//FileInputStream fis = new FileInputStream("text.txt");
		
		//실행예외(unChecked Exception): 실행시 발생되는 예외
		
		//NullPointerException: 객체가 null인 상태에서 객체의 필드나 메소드를 호출
		A a1 = new A();
		a1.abc();				//컴파일 단계에서는 예외가 발생되지 않고 실행시에 발생
		
	}

}
