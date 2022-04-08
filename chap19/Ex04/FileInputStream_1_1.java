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
			System.out.println("파일이 존재하지 않습니다.");
		}
		
		int data;
		try {
			while((data = is.read()) != -1) {
				System.out.println((char)data);
			}
		} catch (IOException e) {
			System.out.println("파일을 읽지 못했습니다.");
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
			System.out.println("예외가 발생했습니다.");
		}finally {
			try {
				is2.close();
			} catch (IOException e) {
				System.out.println("");
			}
		}
		
	}

}
