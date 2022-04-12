package chap19.Ex06;

import java.io.IOException;
import java.io.InputStream;




public class ConsoleInputObject_2 {

	public static void main(String[] args) throws IOException {

		InputStream is1 = System.in;			
		
		System.out.println("영문만 입력하세요 >> ");
		
		//1. 1-byte 단위 읽기
		int data;
		while((data = is1.read()) != '\r') {	//	'\r'  	<-- is.read() 호출될 떄 콘솔에서 인풋을 대기
			System.out.print((char)data);
		}
		is1.read();		//10 <== \n	버퍼에 \n남아있음. 버퍼에서 \n을 처리해 줘야한다. 그렇지 않으면 다음 read()에서 \n 들어감
			//	\n을 버퍼에서 꺼낸다.
		System.out.println();System.out.println();
		System.out.println("========================");
		
		
		//2. n-byte 단위 읽기(byte[]의 처음 위치에서 읽은 데이터 저장)
		byte[] byteArray1 = new byte[512];	//콘솔에서 배열에 저장될 때
		int count1 = is1.read(byteArray1);	//count1은 100, 100, 30, -1
		
		for(int i= 0; i<count1; i++) {
			System.out.print((char)byteArray1[i]);
			System.out.println(": count1 = " + count1);
			
		}
		
		int count2;
		count2 = is1.read(byteArray1);		//배열 내부에 \r\n 들어간다.
		System.out.println(new String(byteArray1, 0, count2));
		
		/*
		while((count2 = is1.read(byteArray1)) != '\r') {	
			System.out.println(new String(byteArray1));
		}
		*/		//왜 java is fun /  kkkk kk kkk 같은 글자 띄어쓰기 조합만 종료되는거지?
		//is1.read();
		System.out.println("==========================");
		
		
		
		
		
		
		//3. n-byte 단위로 읽고(length만큼 읽어와서 byte[] offset 위치에서 저장
		
		byte[] byteArray2 = new byte[8];
		int offset = 3;
		int length = 5; 
		
		int count3 = is1.read(byteArray2, offset, length);
		
		for(int i=0;i<offset + length; i++) {
			System.out.println((char)byteArray2[i]);
		}
		
		is1.close();
		
	}

}
