package chap19.Ex04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

class StreamResource implements AutoCloseable{
	
	File file ;
	InputStream is;
	String path;
	
	FileInputStream input;
	InputStreamReader reader;
	BufferedReader in;
	
	public StreamResource(String path) {
		this.file = new File(path); 
		this.path = path;
	}
	
	public void InputStream() {
		try {
			this.is = new FileInputStream(this.file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
	}
	public void MS949toUTF8() {
		
	}
	
	@Override
	public void close() throws Exception {
		
		is.close();
	}
}


public class Ex3_Exception1 {

	public static void main(String[] args) {
		
		

		
		int data;
		byte[] buffer = new byte[512];
		
		try (StreamResource sr1 = new StreamResource("C:\\git\\Java_project_my\\chap19\\Ex04\\exception-ms949.txt");){
			sr1.InputStream();
			while((data = sr1.is.read(buffer))!=-1) {
				String str = new String(buffer, 0, data,Charset.forName("MS949"));
				System.out.print(str);
			}
		}catch(Exception e) {
			System.out.println("파일을 읽지 못했습니다.");
		}
		
		
		System.out.println("\n=====================\n");
		int data2;
		try (StreamResource sr2 = new StreamResource("src\\chap19\\Ex04\\exception-utf8.txt")){
			sr2.InputStream();
			while((data2 = sr2.is.read(buffer))!=-1) {
				String str = new String(buffer, 0, data2,Charset.forName("UTF-8"));
				System.out.print(str);
			}
		}catch(Exception e) {
			System.out.println("파일을 읽지 못했습니다.");
		}
		
		
		
		
		
		
	
	}

}
