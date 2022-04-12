package chap19.Ex06;

import java.io.IOException;
import java.io.InputStream;

/*
 	System.in : Console에서 input을 받는 객체(자바에서 제공), InputStream
 			Windows : 콘솔에서 Enter를 넣으면 \n\r
 			MAC		: 콘솔에서 Enter를 넣으면 \r
 			
 	System.out: Console로 출력을 하는 객체, OutputStream
 	
 */



public class ConsoleInputObject_1 {

	public static void main(String[] args) throws IOException {

		//1. Console에서 input 받기 위한 객체 생성
		InputStream is1 = System.in;				//is1은 콘솔에서 인풋 받아서 처리하는 객체
		
		System.out.println("영문을 입력하세요. >>> ");
		
		int data;
		
		while((data = is1.read())!='\r') {		//Console input에선 \r까지				1byte씩 읽어서 data변수에 할당
			System.out.println("읽은 데이터: "+(char)data + "남은 바이트 수 : "+ is1.available());
		}
		
		System.out.println(data);			//13 <= \r
		System.out.println(is1.read());		//10 <= \n
		
		
		
		System.out.println("======================");
		
		System.out.println("영문을 입력하세요.2 >>> ");
		is1 = System.in;
		
		while((data = is1.read())!='\r') {		//Console input에선 \r까지				1byte씩 읽어서 data변수에 할당
			System.out.print((char)data);
		}
		
		System.out.println(data);		//10
		System.out.println(is1.read());//더 이상 read가 없다.
		
		
	}

}
