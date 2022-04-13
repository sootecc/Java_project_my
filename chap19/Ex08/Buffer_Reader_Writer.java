package chap19.Ex08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Buffer_Reader_Writer {

	public static void main(String[] args) {
		
		//1. 파일 객체 생성
		File rwFile = new File("./chap19/Ex08/bufferedfile");
		
		
		//2. FileWriter를 이용한 파일 쓰기(MS949)
		try(Writer writer = new FileWriter(rwFile);
			BufferedWriter bw = new BufferedWriter(writer);){		//성능을 향상하기 위한 Filter
			
			bw.write("안녕하세요\n");
			bw.write("Hello");
			bw.write('\r');
			bw.write('\n');
			bw.write("반갑습니다.", 2, 3);
			bw.flush();
			
		}catch(Exception e ) {}
	
		
		//3. FileReader를 이용한 파일 읽기 (MS-949)
		try(Reader reader = new FileReader(rwFile);
			BufferedReader br = new BufferedReader(reader);){
			
			//BufferedReader에 추가된 메소드: String readLine(), 파일이 끝: null, 한 라인씩 읽는다.
			//int read(): 파일의 끝, -1
		
			String data;
			while((data = br.readLine()) != null) {
				System.out.println(data);
			}
			
		}catch(Exception e) {}
		
		
		
	}
}
