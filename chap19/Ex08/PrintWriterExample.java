package chap19.Ex08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

//PrintWriter: �ڵ� flush() ����� ������ Ȱ��ȭ �ؾ� �Ѵ�.
	//flush()�� ó���ؾ� ��
	//close()�� ȣ��� ��, flush()�� ȣ��ǰ� close()
public class PrintWriterExample {

	public static void main(String[] args) {

		//1. ���� ��ü ����
		File pw1 = new File("./chap19/Ex08/pw1.txt");
		File pw2 = new File("./chap19/Ex08/pw2.txt");
		File pw3 = new File("./chap19/Ex08/pw3.txt");
		
		
		//2. PrintWriter(File file)
		try(PrintWriter pw = new PrintWriter(pw1);){
			
			pw.println("PrintWriter ���� #1 ");
			pw.println(13);
			pw.println(5.8);
			pw.print("String");
			pw.println("HI!");
			pw.printf("%d, %s", 10, System.lineSeparator());
			
		} catch(Exception e) {}
		
		
		//3. PrintWriter(OutputStream os)
		
		try(PrintWriter pw = new PrintWriter(new FileOutputStream(pw2));){
			pw.println("PrintWriter ���� #1 ");
			pw.println(13);
			pw.println(5.8);
			pw.print("String");
			pw.println("HI!");
			pw.printf("%d, %s", 10, System.lineSeparator());
			
		}catch(Exception e) {}
		
		
		
		//4. PrintWriter(System.out)
		PrintWriter pw = new PrintWriter(System.out, true);		
				//PrintWriter(System.out, true)	, true �ɼ�: auto flush�� Ȱ��ȭ
		
		pw.println("PrintWriter ���� #1 ");
		pw.println(13);
		pw.println(5.8);
		pw.print("String");
		pw.println("HI!");
		pw.printf("%d, %s", 10, System.lineSeparator());
	
		//pw.close();
	}

}
