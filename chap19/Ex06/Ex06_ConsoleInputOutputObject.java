package chap19.Ex06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// 콘솔에서 (배열 100byte 이하)인풋 받은 한글 값을 Ex06 아래 input.txt에 저장 후 charset은 default
// input.txt 파일에서 값을 읽어서 콘솔에 출력. 


public class Ex06_ConsoleInputOutputObject {

	public static void main(String[] args) throws IOException {
		
		
		//1. 콘솔에서 한글을 인풋 받는다. (System.in)		<== byte[] 배열을 생성하여 처리해야 한글 처리 가능
		InputStream is = System.in;		//new로 생성하지 않고 연결만 설정, 콘솔에서 인풋 값을 받는다.
		
		System.out.println("한글을 입력 하세요>>> ");
		byte[] byteArray1 = new byte[100];
		int count1 = is.read(byteArray1);		//byteArray1에 byte로 \r\n, count1은 배열에 값이 들어온 개수를 리턴
		// int data = is.read(); 한글을 처리하지 못함. data에는 1byte read한 값이 저장		
		
		
		//2. 인풋 받은 한글을 파일에 저장한다. (FileOutputStream)
		File f1 = new File("./chap19/Ex06/input.txt");
		OutputStream fos = new FileOutputStream(f1);	//OutputStream은 덮어쓰기가 기본	
		
		fos.write(byteArray1);		//버퍼(RAM)에만 쓰여짐, 공백 포함해서 100byte만큼 들어가네
		fos.flush();				//flush 호출해야 버퍼에 쓰인 내용이 파일에 쓰여짐
		fos.close();				
		
		//3. 저장된 파일에서 값을 읽어 온다.	(FileInputStream)
		InputStream fis = new FileInputStream(f1);		//read(): 한글을 처리 못한다. read(byte[]): 한글 처리.
		byte[] byteArray2 = new byte[100];
		int count2 = fis.read(byteArray2);				//read(byte[]): 한글 처리
		// int data = fis.read(); 한글을 처리하지 못함. data에는 1byte read한 값이 저장
		
		System.out.println();
		System.out.println("파일에서 읽어 온 내용을 출력합니다.");
		
		//4. 읽어 온 배열을 콘솔에 출력 한다. (System.out)
		OutputStream os = System.out;					//콘솔에 출력: byte[]
		
		os.write(byteArray2);
		os.flush();
		
		is.close();
		fis.close();
		os.close();
		
		
	}

}
