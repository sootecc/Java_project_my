package chap19.Ex08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

//InputStreamWriter:  byte => char, charset(MS949, UTF-8) 지정해서 파일을 출력할 수 있다.
//OutputStreamWriter: byte => char, charset(MS949, UTF-8) 지정해서 파일을 저장할 수 있다

public class OutputStreamWriter1 {
	
	public static void main(String[] args) {
		
		//1. FileWriter를 통해서 데이터 쓰기(Default: MS949)
		File osw1 = new File ("./chap19/Ex08/osw1.txt");
		File osw2 = new File ("./chap19/Ex08/osw2.txt");
		//이클립스 내부에 저장하면 상위 문자 설정을 상속받기 때문에 외부에 파일을 만들어주면 원하는 결과를 얻을 수 있다.
		
		
		try(Writer writer = new FileWriter(osw1);){
			
			writer.write("OutputStreamWriter1 예제 파일입니다. \n".toCharArray()); 	//String을 char 배열에 저장
			writer.write("한글과 영문이 모두 포함되어 있습니다."); //String
			writer.write('\n');
			writer.write("Good Bye!!!! \n\n");
			writer.flush();
		
		}catch(Exception e) {}
		
		//2. FileWriter를 사용해서 (Default : MS949 -> UTF-8 파일 쓰기
		try(OutputStream os = new FileOutputStream(osw2);
			OutputStreamWriter writer = new OutputStreamWriter(os,"UTF-8");){
				//OutputStreamWriter: byte -> char
			
			writer.write("OutputStreamWriter1 예제 파일입니다. \n".toCharArray()); 	//String을 char 배열에 저장
			writer.write("한글과 영문이 모두 포함되어 있습니다."); //String
			writer.write('\n');
			writer.write("Good Bye!!!! \n\n");
			writer.flush();
		
		}catch(Exception e) {}
		
		
		
		
		
		
	}
}
