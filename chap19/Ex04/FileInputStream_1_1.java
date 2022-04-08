package chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_1_1 {

	public static void main(String[] args) {
		
		File inFile =new File("chap19\\files\\FileInputstream1.txt");
		
		InputStream is = null;
		try {
			is = new FileInputStream(inFile);
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		
		int data;
		try {
			while((data = is.read()) != -1) {
				System.out.println((char)data);
			}
		} catch (IOException e) {
			System.out.println("������ ���� ���߽��ϴ�.");
		}
		
		
		try {
			if(is != null)
				is.close();
		} catch (IOException e) {
			System.out.println();
		}
		
		
		
		
		
		
		
		int data2 = 0;
		InputStream is2 = null;
		try {
			is2 = new FileInputStream(inFile);
			while((data = is2.read()) != -1) {
				System.out.println((char)data2);
			}
		} catch (IOException e) {
			System.out.println("���ܰ� �߻��߽��ϴ�.");
		}finally {
			try {
				is2.close();
			} catch (IOException e) {
				System.out.println("");
			}
		}
		
	}

}
