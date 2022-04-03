package chap14.Ex04;

import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TryWithResource_1 {

	public static void main(String[] args) {
		
		//1. 수동 리소스 해제 (기존 프로그래머 사용)		--코드가 길고 지저분
		System.out.println("문자를 입력하세요>> ");
		
		 InputStreamReader isr2 = null;		//사용 후 반드시 메모리에서 객체를 삭제, isr2.close();
		 //System.in : 콘솔에서 입력을 받도록 처리. 한 번만 input을 받을 수 있다. (객체가 종료되면 두 번 input받을 수 없다.)
		 
		 
		 
		 try {
			 isr2 = new InputStreamReader(System.in);
			 char input = (char)isr2.read();			//일반 예외(checked 예외): IOException 입력 출력시 예외
			 System.out.println("입력 글자 = "+input);
		 }
		 catch(IOException e) {
			 e.printStackTrace();	//try{} block에서 예외가 발생될 경우 자세한 정보를 출력
		 }
		 finally {		//객체를 사용 후 메모리 영역에서 삭제
			 if(isr2 != null)
				try {
					isr2.close();		//일반 예외: IOException이라 try catch 필요
				} catch (IOException e) {
					e.printStackTrace();
				}		//리소스 해제
		 }
		 
		 
		 
		 
		//2. 자동 리소스 해제 (Java 1.7 자동으로 리소스 해제)--코드가 간결하다.(필요조건이 있음)
		 		//사용하는 객체가 AutoCloseable 인터페이스를 구현한 객체여야 한다.
		 		//반드시 객체에 close()가 존재해야한다.
		 		
		 		//위의 두 가지 조건을 만족할 때 자동 리소스 해제 가능
		 		//try(자동으로 리소스를 해제할 객체 선언){} catch{} finally{}
		 
		 //InputSteamReader는 AutoCloseable 인터페이스를 구현하고 있다.
		 //Try With Resource: try(with resource : 객체 메모리 로드){}
		 try(InputStreamReader isr1 = new InputStreamReader(System.in);){
			char input = (char) isr1.read();
			System.out.println("입력글자 = "+input);
		 }
		 catch(IOException e) {
			 e.printStackTrace();
		 }	//finally block을 생략하더라도 객체를 자동으로 isr1.close()
		 
		
	}

}
