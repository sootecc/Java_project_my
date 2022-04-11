package chap19.Ex04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;


/*
 	1. is1 inputstream��ü �����η� ����, ms949.txt,	����ó��
 	2. is2 inputstream��ü ���°�η� ����, utf8.txt,		����ó�� (try ~ with resource�� ����ó��)
 			close �޼ҵ�� �ڵ����� ó��
 
 	���� ��ǲ ��Ʈ������ �о ���
*/

class StreamResource implements AutoCloseable{
	
	File file ;
	InputStream is;
	String path;
	
	FileInputStream input;
	InputStreamReader reader;
	BufferedReader in;
	
	public StreamResource(String path) {
		this.file = new File(path); 
		this.path = path;
	}
	
	public void InputStream() {
		try {
			this.is = new FileInputStream(this.file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
	}
	public void MS949toUTF8() {
		
	}
	
	@Override
	public void close() throws Exception {
		
		is.close();
	}
}


public class Ex3_Exception1 {

	public static void main(String[] args) {
		
		

		
		int data;
		byte[] buffer = new byte[512];
		
		try (StreamResource sr1 = new StreamResource("C:\\git\\Java_project_my\\chap19\\Ex04\\exception-ms949.txt");){
			sr1.InputStream();
			while((data = sr1.is.read(buffer))!=-1) {
				String str = new String(buffer, 0, data,Charset.forName("MS949"));
				System.out.print(str);
			}
		}catch(Exception e) {
			System.out.println("������ ���� ���߽��ϴ�.");
		}
		
		
		System.out.println("\n=====================\n");
		int data2;
		try (StreamResource sr2 = new StreamResource("src\\chap19\\Ex04\\exception-utf8.txt")){
			sr2.InputStream();
			while((data2 = sr2.is.read(buffer))!=-1) {
				String str = new String(buffer, 0, data2,Charset.forName("UTF-8"));
				System.out.print(str);
			}
		}catch(Exception e) {
			System.out.println("������ ���� ���߽��ϴ�.");
		}
		
		
		
		
		
		
	
	}

}
