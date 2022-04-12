package chap19.Ex06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

// 콘솔에서 (배열 100byte 이하)인풋 받은 한글 값을 Ex06 아래 input.txt에 저장 후 charset은 default
// input.txt 파일에서 값을 읽어서 콘솔에 출력. 


public class Ex06_ConsoleInputOutputObject {

	public static void main(String[] args) throws IOException {
		
		
		
		InputStream is1_1 = System.in;
		System.out.println("한글을 입력하세요: ");
		
		byte[] byteArray1 = new byte[100];
		int count1 = is1_1.read(byteArray1);
		String str1 = new String(byteArray1, 0, count1,Charset.defaultCharset());
		
		//한글 입력 받기
		
		File oFile = new File("./chap19/Ex06/input.txt");
		OutputStream os1 = new FileOutputStream(oFile); 
		
		os1.write(byteArray1);
		os1.flush();
		os1.close();
		
		//파일 생성
		
		
		//파일 다시 읽어오기
		File inFile = new File("./chap19/Ex06/input.txt");
		InputStream is1 = new FileInputStream(inFile);
		byte[] byteArray2 = new byte[100];
		int count2 = is1.read(byteArray2);
		String str2 = new String (byteArray2, Charset.defaultCharset());
		System.out.println(str2);
		
		
		
	}

}
