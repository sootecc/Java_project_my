package chap19.Ex08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

//InputStreamWriter:  byte => char, charset(MS949, UTF-8) �����ؼ� ������ ����� �� �ִ�.
//OutputStreamWriter: byte => char, charset(MS949, UTF-8) �����ؼ� ������ ������ �� �ִ�

public class OutputStreamWriter1 {
	
	public static void main(String[] args) {
		
		//1. FileWriter�� ���ؼ� ������ ����(Default: MS949)
		File osw1 = new File ("./chap19/Ex08/osw1.txt");
		File osw2 = new File ("./chap19/Ex08/osw2.txt");
		//��Ŭ���� ���ο� �����ϸ� ���� ���� ������ ��ӹޱ� ������ �ܺο� ������ ������ָ� ���ϴ� ����� ���� �� �ִ�.
		
		
		try(Writer writer = new FileWriter(osw1);){
			
			writer.write("OutputStreamWriter1 ���� �����Դϴ�. \n".toCharArray()); 	//String�� char �迭�� ����
			writer.write("�ѱ۰� ������ ��� ���ԵǾ� �ֽ��ϴ�."); //String
			writer.write('\n');
			writer.write("Good Bye!!!! \n\n");
			writer.flush();
		
		}catch(Exception e) {}
		
		//2. FileWriter�� ����ؼ� (Default : MS949 -> UTF-8 ���� ����
		try(OutputStream os = new FileOutputStream(osw2);
			OutputStreamWriter writer = new OutputStreamWriter(os,"UTF-8");){
				//OutputStreamWriter: byte -> char
			
			writer.write("OutputStreamWriter1 ���� �����Դϴ�. \n".toCharArray()); 	//String�� char �迭�� ����
			writer.write("�ѱ۰� ������ ��� ���ԵǾ� �ֽ��ϴ�."); //String
			writer.write('\n');
			writer.write("Good Bye!!!! \n\n");
			writer.flush();
		
		}catch(Exception e) {}
		
		
		
		
		
		
	}
}
