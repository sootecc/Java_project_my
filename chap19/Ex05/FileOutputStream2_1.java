package chap19.Ex05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class FileOutputStream2_1 {

	public static void main(String[] args) throws IOException {
		// 1. 저장할 파일 생성
		File outFile = new File("./chap19/Ex05/FileOutput2_1.txt");	//기본적으로 이클립스의 default charset으로 저장된다.
		
		// 2. n-byte 단위 쓰기 처리 (byte[] 의 처음부터 끝까지 쓰기) <== 한글을 처리
		OutputStream os2 = new FileOutputStream(outFile,true);
		byte[] byteArray1 = "안녕하세요".getBytes(Charset.forName("UTF-8"));		//String -> byte[]에 저장: getBytes()
				//한 글자에 2byte씩 처리. 총 10byte
		os2.write(byteArray1);
		os2.write('\n');
		
		os2.flush();
		os2.close();
		
		
		//3. n-byte 쓰기(byte[]의 offset부터 length개의 바이트 데이터 쓰기)
		OutputStream os3 = new FileOutputStream(outFile,true);
		byte[] byteArray2 = "반갑습니다.".getBytes(Charset.forName("MS949"));		//String -> byte[]에 저장: getBytes()
				//한 글자에 2byte씩 처리. 총 10byte
//		byte[] byteArray2 = "반갑습니다.".getBytes(Charset.defaultCharset());		//기본 charset으로 가져오기
		
		os3.write(byteArray2,6,5);
		//write(byte[], offset, length);
		
		//영어, 숫다, 특수문자 < ASCII 코드로 1byte
		
		os3.flush();
		os3.close();
				
				
	}

}
