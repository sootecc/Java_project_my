package chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_1 {

	public static void main(String[] args) throws IOException   {
		
		//현재 작업 디렉토리 위치 확인
		System.out.println(System.getProperty("user.dir"));
		
		
		//1. 입력 파일 생성
		
			//절대경로로 설정
		File inFile1 = new File("C:\\Users\\kosmo\\Desktop\\11kjs\\chap19\\files\\FileInputstream1.txt");
			
			//상대경로로 설정: 현재 작업 디렉토리를 기준으로 설정
		File inFile = new File("chap19\\files\\FileInputstream1.txt");
		
		//InputStream 객체를 생성해야 파일의 내용을 읽을 수 있다.
		InputStream is = new FileInputStream(inFile);
			//InputStream은 추상 클래스, 직접 객체 생성을 할 수 없다. 타입 지정은 가능하다.
		//파일의 내용을 출력
	

		//UTF-8 : 영어 : 1byte, 한글: 3byte
		//UTF-16 : 영어 : 2byte, 한글: 2byte	첫 번째 BOM, 2byte <= 식별자
		//MS949 : 영어 : 1byte, 한글: 2byte
		//EUC-KR : 영어 : 2byte, 한글: 2byte
		
		//한 바이트 데이터를 읽어서 char로 변환 후 출력
		System.out.println(is.read());		//read() 한 바이트를 읽어들임
		System.out.print((char)is.read());			
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.println();
		System.out.println("================");
		
		//stream 값을 읽으면 메모리에서 삭제된다. 새로운 stream을 생성해야 다시 읽을 수 있다.
		
		//int read(): 한 바이트를 읽어서 값이 존재할 경우 양수로 리턴, 읽은 데이터가 존재하지 않을 경우 -1 리턴 
		//while문을 사용해서 한 번에 출력
		int data;
		InputStream is2 = new FileInputStream(inFile);
		while((data = is2.read()) != -1) {		//마지막 값까지 계속 순환
			System.out.print((char)data);
		}
		System.out.println();
		System.out.println();
		System.out.println("==========================");
		
		InputStream is3 = new FileInputStream(inFile);
		while((data = is3.read()) != -1) {		//마지막 값까지 계속 순환
			System.out.println("읽은 데이터: "+(char)data+"남은 바이트 수: "+is3.available());
		
		
		
		
		
		
		
		
		
		
		
		}
		
	}

}
