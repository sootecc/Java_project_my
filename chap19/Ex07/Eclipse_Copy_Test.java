package chap19.Ex07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Eclipse_Copy_Test {

	public static void main(String[] args) {
		
		// 두 파일을 복사, Buffered를 사용하지 않고 처리하는 경우, Buffered를 사용하는 경우 속도 차이.
		
		File orgFile = new File("C:\\Temp\\copy_test\\eclipse_origin.exe");	//원본 파일
		File copyFile1 = new File("C:\\Temp\\copy_test\\eclipse_copy1.exe");	//Buffered를 사용하지 않고 처리
		File copyFile2 = new File("C:\\Temp\\copy_test\\eclipse_copy2.exe");	//Buffered를 사용하여 처리
		
		// 성능 측정을 하기 위한 변수 선언
		long start, end, time1, time2;		//time1: Buffered(X), time2: Buffered(O)
		
		//1. Buffered를 사용하지 않고 처리

		start = System.nanoTime();	//시작 시간
		
		try (InputStream is = new FileInputStream(orgFile);
			 OutputStream os = new FileOutputStream(copyFile1);		//Autoclosealbe
			){
			//데이터 복사 코드 생성
			int data;
			while((data = is.read()) != -1) {		//is 에서 1byte 읽어서, -1 마지막까지 
				os.write(data);						//os 에 1byte 쓰기
			}
		} catch (IOException e) {}
		
		end = System.nanoTime();
		time1 = end - start;
		System.out.println("Without Buffered IO Stream "+time1);	//버퍼를 사용하지 않고 복사. copy1.jpg
		
		
		
		//2. Buffered를 사용하여 처리(BufferedInputStream, BufferedOutStream)
		
		start = System.nanoTime();	//시작 시간
		
		try (InputStream is = new FileInputStream(orgFile);					//기반 스트림
			 BufferedInputStream bis = new BufferedInputStream(is);			//추가 기능을 제공하는 스트림, 성능을 빠르게 처리. (Buffer 사용)
			 OutputStream os = new FileOutputStream(copyFile2);				//기반 스트림
			 BufferedOutputStream bos = new BufferedOutputStream(os);		//추가 기능을 제공(필터)
			){
			//데이터 복사 코드 생성
			int data;
			while((data = bis.read()) != -1) {		//버퍼를 사용해서 읽기 (빠르다)
				bos.write(data);					//버퍼를 사용해서 쓰기 (쓰기)
			}
		} catch (IOException e) {}
		
		end = System.nanoTime();
		time2 = end - start;
		System.out.println("With Buffered IO Stream "+time2);	//버퍼를 사용하지 않고 복사. copy1.jpg
		
		//사용한 경우(time2), 사용하지 않은 경우(time1)의 비율
		System.out.println((double)time1/time2);
				
	}
}
