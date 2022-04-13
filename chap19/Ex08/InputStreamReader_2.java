package chap19.Ex08;

import java.io.InputStreamReader;

public class InputStreamReader_2 {
	
	public static void main(String[] args) {
		
		//1. 콘솔 입력(MS949) : default charset, byte 스트림
		InputStreamReader isr;
		try{
			isr = new InputStreamReader(System.in,"MS949");
			//InputStreamReader : byte -> char로 변환
			//System.in: 콘솔 입력, byte
			
			//isr은 변환된 char type을 갖고 있다.
			
			System.out.println("한글을 원하는 대로 입력하세요>>> ");
			
			int data;
			while((data = isr.read())!= '\r') {		//콘솔 입력 대기
				System.out.print((char)data);
			}
			
			System.out.println();
			System.out.println(isr.getEncoding());
			
		}catch(Exception e) {}
	
		
		System.out.println();
		System.out.println("====================");
		
		
		
		
		
		
		//2. 콘솔 입력 (UTF-8)
		
		try{
			isr = new InputStreamReader(System.in,"UTF-8");
			System.out.println("한글을 원하는 대로 입력하세요>>> ");
			
			int data;
			while((data = isr.read())!= '\r') {		//콘솔 입력 대기
				System.out.print((char)data);
			}
			
			System.out.println();
			System.out.println(isr.getEncoding());
			
		}catch(Exception e) {}
		
		
		
	}
}
