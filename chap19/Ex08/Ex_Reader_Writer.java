package chap19.Ex08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/*

	Application Default: MS949
	
	reader/writer�� ���� Ŭ���� ���
	
	1. �ֿܼ��� �ѱ��� �о
	C:\Temp\a\aaa.txt (MS949)
	C:\Temp\b\bbb.txt (UTF-8)

	-a, b ������ Application���� ����
	
	2. �� ���Ͽ��� ���� ������ �ֿܼ� ���� ���� ����ϼ���.
 */

public class Ex_Reader_Writer {

	public static void main(String[] args) {

		InputStreamReader isr;
		
		File a = new File("C:\\Temp\\a\\aaa.txt");
		File a_1 = new File("C:\\Temp\\a\\");
		a_1.mkdir();
		
		File b = new File("C:\\Temp\\b\\bbb.txt");
		File b_1 = new File("C:\\Temp\\b\\");
		b_1.mkdir();
		int data;
		
		try(OutputStreamWriter osw1 = new OutputStreamWriter(new FileOutputStream(a),"MS949");){
			
			isr = new InputStreamReader (System.in,"MS949");
			
			
			System.out.println("�ѱ� �Է�:");
			while((data = isr.read())!= '\r') {
				osw1.write((char)data);
			}
			
		}catch(Exception e) {}
		
		System.out.println("===============");
		
		try(OutputStreamWriter osw1 = new OutputStreamWriter(new FileOutputStream(b),"UTF-8");){
			
			isr = new InputStreamReader (System.in,"MS949");
			
			
			System.out.println("�ѱ� �Է�:");
			while((data = isr.read())!= '\r') {
				osw1.write((char)data);
			}
			
		}catch(Exception e) {}
		
		
		////////�а� ����//////
		
		
		try(InputStreamReader isr1 = new InputStreamReader(new FileInputStream(a),"MS949");	){
			
			
			while((data = isr1.read())!= -1) {
				System.out.print((char)data);
			}
			
		}catch(Exception e) {}
		
		
		
		
		
		System.out.println();
		try(InputStream	fis = new FileInputStream(b);
			InputStreamReader isr1 = new InputStreamReader(fis,"UTF-8");){
			int c;
			
			while((c = isr1.read())!= -1) {
				System.out.print((char)c);
			}
			
			
			
			
			
		}catch(Exception e) {}
		
		/////���� �а� ���/////
		
		
	}

}
