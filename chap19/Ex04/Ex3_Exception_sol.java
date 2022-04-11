package chap19.Ex04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;


/*
 	1. is1 inputstream객체 절대경로로 접근, ms949.txt,	예외처리
 	2. is2 inputstream객체 상태경로로 접근, utf8.txt,		예외처리 (try ~ with resource로 예외처리)
 			close 메소드는 자동으로 처리
 
 	파일 인풋 스트림으로 읽어서 출력
*/




public class Ex3_Exception_sol {

	public static void main(String[] args) {
		
		//1. is1
		File inFile = new File("C:\\git\\Java_project_my\\chap19\\Ex04\\exception-ms949.txt");
		InputStream is1 = null;		//전역 변수로 선언, finally블록에서 is1.close()
		byte[] arr = new byte[100];
				
				
		try {
			is1 = new FileInputStream(inFile);	//객체 생성
		}catch(FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}
		
		int data =0;
		try {
			while((data = is1.read(arr))!=-1) {
				String str = new String (arr, 0, data, Charset.forName("MS949"));
				System.out.println(str);
			}
		}catch(IOException e) {
			System.out.println("파일을 읽지 못했습니다.");
		}finally {
			if(is1!=null) {
				try {
					is1.close();
				}catch(IOException e) {}
			}
		}
		
		System.out.println("=======================================");
		
		//1-1. 여러 Exception에 대해서 단일 try ~ catch로 처리
		InputStream is1_1 = null;		
		byte[] arr1_1 = new byte[100];	//byte[] 배열 선언. 
		//한글 처리 #1 byte[] 배열 선언
		int data1_1 =0;
		
		try {
			is1_1 = new FileInputStream(inFile);	//FileNotFoundException
			while((data1_1 = is1_1.read(arr1_1))!=-1) {	//IOException
				//한글 처리 #2 : read(byte배열)
				
				String str1_1 = new String (arr1_1, 0, data1_1, Charset.forName("MS949"));
				//한글  처리 #3 : String(byte배열, offset, length, "encoding")
				
				System.out.println(str1_1);
			}
		}catch(IOException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}finally {
			if(is1_1!=null) {	//is1_1이 null이 아닐 때 객체를 메모리에서 제거
				try {
					is1_1.close();
				}catch(IOException e) {}
			}
		}
	
		
		
		
		
		
		System.out.println("============================");
		//2. is2
		File inFile2 = new File("src/chap19/Ex04/exception-utf8.txt");		//얘 왜 안뜸?
		
		byte[] arr2 = new byte[100];	//byte[] 배열 선언. 
		//한글 처리 #1 byte[] 배열 선언
		int data2;
		
		try (InputStream is2 = new FileInputStream(inFile2)){	
			//try (with resource: 객체 생성, RAM을 사용) << close()를 자동으로 처리. AutoClosable 구현한 클래스이어야 한다.
			
			while((data2 = is2.read(arr2))!=-1) {	
				//한글처리 #2: is.read(byte배열);
				
				String str2 = new String (arr2, Charset.forName("UTF-8"));
				//한글  처리 #3 : String(byte배열, offset, length, "encoding")
				
				System.out.println(str2);
			}
		}catch(IOException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}
	}

}
