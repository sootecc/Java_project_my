package chap19.Ex07;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;


public class PrintStreamExample2 {
	
	public static void main(String[] args) {
		
		//1. 파일 생성
		File outFile1 = new File("./chap19/Ex07/printstream3.txt");
		File outFile2 = new File("./chap19/Ex07/printstream4.txt");
		
		
		//2. 
		try (PrintStream ps = new PrintStream(outFile1);){
			ps.println(5.8);											//double 출력, 출력 후 라인 개행
			ps.print(3123+"안녕"+12345+"\n");								//출력 후 라인 개행(X)
			ps.printf("%d이 호출되었습니다.%s", 7,System.lineSeparator());	
			
		} catch (Exception e) {}
	
		

		try(InputStream is = new FileInputStream(outFile1)){
			int count;
			byte[] byteArray1 = new byte[100];
			count = is.read(byteArray1);
			
			System.out.println(new String(byteArray1));
			
			
			
		}catch(Exception e) {}
	
	
	
	
	
	
	
	}
}