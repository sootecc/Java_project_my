package chap19.Ex08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

//PrintWriter: 자동 flush() 기능이 있지만 활성화 해야 한다.
	//flush()를 처리해야 함
	//close()가 호출될 때, flush()가 호출되고 close()
public class PrintWriterExample {

	public static void main(String[] args) {

		//1. 파일 객체 생성
		File pw1 = new File("./chap19/Ex08/pw1.txt");
		File pw2 = new File("./chap19/Ex08/pw2.txt");
		File pw3 = new File("./chap19/Ex08/pw3.txt");
		
		
		//2. PrintWriter(File file)
		try(PrintWriter pw = new PrintWriter(pw1);){
			
			pw.println("PrintWriter 예제 #1 ");
			pw.println(13);
			pw.println(5.8);
			pw.print("String");
			pw.println("HI!");
			pw.printf("%d, %s", 10, System.lineSeparator());
			
		} catch(Exception e) {}
		
		
		//3. PrintWriter(OutputStream os)
		
		try(PrintWriter pw = new PrintWriter(new FileOutputStream(pw2));){
			pw.println("PrintWriter 예제 #1 ");
			pw.println(13);
			pw.println(5.8);
			pw.print("String");
			pw.println("HI!");
			pw.printf("%d, %s", 10, System.lineSeparator());
			
		}catch(Exception e) {}
		
		
		
		//4. PrintWriter(System.out)
		PrintWriter pw = new PrintWriter(System.out, true);		
				//PrintWriter(System.out, true)	, true 옵션: auto flush를 활성화
		
		pw.println("PrintWriter 예제 #1 ");
		pw.println(13);
		pw.println(5.8);
		pw.print("String");
		pw.println("HI!");
		pw.printf("%d, %s", 10, System.lineSeparator());
	
		//pw.close();
	}

}
