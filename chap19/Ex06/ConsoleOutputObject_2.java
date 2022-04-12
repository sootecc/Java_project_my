package chap19.Ex06;

import java.io.IOException;
import java.io.OutputStream;

public class ConsoleOutputObject_2 {

	public static void main(String[] args) throws IOException {

		OutputStream os = System.out;		//System.out : 콘솔에 출력, byte 출력
		
		//1. 1-byte 출력
		os.write('J');
		os.write('A');
		os.write('V');
		os.write('A');
		os.write('\n');
		os.write('\r');		//버퍼에만 저장되어 있다.
		
		os.flush();		//버퍼의 내용을 콘솔에 출력
		//os.close();
		
		//2. n-byte 출력		< byte를 콘솔에 출력
		byte[] byteArray1 = "Hello!".getBytes();	//String -> byte로 변환
		
		os.write(byteArray1);
		os.write('\n');			//	\r \n
		os.flush();
		
		//3. n-byte 출력
		byte[] byteArray2 = "Better the last smile than the first laughter".getBytes();
		os.write(byteArray2, 7, 8);			//the last
		//write(byte배열, offset, length);
		os.flush();
		
		os.close();

		
		
	}

}
