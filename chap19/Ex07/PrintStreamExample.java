package chap19.Ex07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

//PrintStream: Filter Stream (�߰� ����� �����ϴ� Stream), ��� ��Ʈ���� �ʿ�
	//�پ��� ������� ��¿� Ưȭ�� ��Ʈ���̴�. flush()�� ȣ������ �ʾƵ� �ڵ����� flush
	//println(), print(), printf()
	//���� ���, �ܼ� ��� ...




public class PrintStreamExample {
	
	public static void main(String[] args) {
		
		//1. File ��ü ����
		File outFile1 = new File("./chap19/Ex07/printstream1.txt");
		File outFile2 = new File("./chap19/Ex07/printstream2.txt");
		
		//2. PrintStream (FileOutputStream(File)) 
		try (OutputStream os1 = new FileOutputStream(outFile1);
			 PrintStream ps = new PrintStream(os1);){			//Filter��Ʈ��(�߰������ ����), ��� ��Ʈ���� �ʿ��ϴ�.
			
			ps.println(5.8);											//double ���, ��� �� ���� ����
			ps.print(3+"�ȳ�"+12345+"\n");								//��� �� ���� ����(X)
			ps.printf("%d�� ȣ��Ǿ����ϴ�.%s", 7,System.lineSeparator());	
			
			//ps.flush()  <-�ڵ����� ȣ��
			
		} catch (Exception e) {}
		
		
		//3. printStream(File)
		try (PrintStream ps = new PrintStream(outFile2)){			//Filter��Ʈ��(�߰������ ����), ��� ��Ʈ���� �ʿ��ϴ�.
			
			ps.println(5.8);											//double ���, ��� �� ���� ����
			ps.print(3+"�ȳ�"+12345+"\n");								//��� �� ���� ����(X)
			ps.printf("%d�� ȣ��Ǿ����ϴ�.%s", 7,System.lineSeparator());	
			
			//ps.flush()  <-�ڵ����� ȣ��
			
			} catch (Exception e) {}
			
		
		//4. PrintStream ps = System.out;  �ֿܼ� ���
		try(OutputStream os2 = System.out;
			PrintStream ps = new PrintStream(os2);){
			
			ps.println(5.8);											//double ���, ��� �� ���� ����
			ps.print(31+"�ȳ�"+12345+"\n");								//��� �� ���� ����(X)
			ps.printf("%d�� ȣ��Ǿ����ϴ�.%s", 7,System.lineSeparator());	
			
			
		}catch(Exception e) {}
		
		System.out.println("======================");
	
		
		
		//5. PrintStream ps = System.out;
		try(PrintStream ps = System.out;){
			
			ps.println(5.8);											//double ���, ��� �� ���� ����
			ps.print(3123+"�ȳ�"+12345+"\n");								//��� �� ���� ����(X)
			ps.printf("%d�� ȣ��Ǿ����ϴ�.%s", 7,System.lineSeparator());	
			
			
		}catch(Exception e) {}
			
			
		
		
	}
}
