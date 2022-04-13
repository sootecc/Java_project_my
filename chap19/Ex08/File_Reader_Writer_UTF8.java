package chap19.Ex08;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class File_Reader_Writer_UTF8 {

	public static void main(String[] args) {

		//1. 파일 객체 생성
		File rwFile = new File("./chap19/Ex08/rwFile_utf8.txt");
		
		try(Writer writer = new FileWriter(rwFile);) {		//Writer: 추상 클래스, FileWriter: Writer를 구현한 자식 클래스
			//OutputStream : byte 단위 출력, 추상 클래스, FileOutputStream, 문자, 데이터, MP3, jpg, gif....모든 파일 종류 처리
			//Writer: char 단위 출력, 추상 클래스, FileWriter, 문자 특화해서 처리
			
			writer.write("안녕하세요".toCharArray());		//String -> Char 배열에 저장한다.
			writer.write("Hello \n");	//String
			writer.write('A');
			writer.write('\r');
			writer.write('\n');
			writer.write("반갑습니다",2, 3);
			writer.flush();
			
		} catch (IOException e) {}
		
		//2. FileReader를 이용한 파일 읽기(UTF-8) <== Charset 지정 옵션이 없다.
		
		try (Reader reader = new FileReader(rwFile);){
			
			int data;
			while((data = reader.read())!=-1) {
				System.out.print((char)data);
				
			}
			
		} catch (IOException e) {}
				 
				
	}

}
