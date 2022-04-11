package chap19.Ex04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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




public class Ex3_Exception_sol {

	public static void main(String[] args) {
		
		//1. is1
		File inFile = new File("C:\\git\\Java_project_my\\chap19\\Ex04\\exception-ms949.txt");
		InputStream is1 = null;		//���� ������ ����, finally��Ͽ��� is1.close()
		byte[] arr = new byte[100];
				
				
		try {
			is1 = new FileInputStream(inFile);	//��ü ����
		}catch(FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		
		int data =0;
		try {
			while((data = is1.read(arr))!=-1) {
				String str = new String (arr, 0, data, Charset.forName("MS949"));
				System.out.println(str);
			}
		}catch(IOException e) {
			System.out.println("������ ���� ���߽��ϴ�.");
		}finally {
			if(is1!=null) {
				try {
					is1.close();
				}catch(IOException e) {}
			}
		}
		
		System.out.println("=======================================");
		
		//1-1. ���� Exception�� ���ؼ� ���� try ~ catch�� ó��
		InputStream is1_1 = null;		
		byte[] arr1_1 = new byte[100];	//byte[] �迭 ����. 
		//�ѱ� ó�� #1 byte[] �迭 ����
		int data1_1 =0;
		
		try {
			is1_1 = new FileInputStream(inFile);	//FileNotFoundException
			while((data1_1 = is1_1.read(arr1_1))!=-1) {	//IOException
				//�ѱ� ó�� #2 : read(byte�迭)
				
				String str1_1 = new String (arr1_1, 0, data1_1, Charset.forName("MS949"));
				//�ѱ�  ó�� #3 : String(byte�迭, offset, length, "encoding")
				
				System.out.println(str1_1);
			}
		}catch(IOException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}finally {
			if(is1_1!=null) {	//is1_1�� null�� �ƴ� �� ��ü�� �޸𸮿��� ����
				try {
					is1_1.close();
				}catch(IOException e) {}
			}
		}
	
		
		
		
		
		
		System.out.println("============================");
		//2. is2
		File inFile2 = new File("src/chap19/Ex04/exception-utf8.txt");		//�� �� �ȶ�?
		
		byte[] arr2 = new byte[100];	//byte[] �迭 ����. 
		//�ѱ� ó�� #1 byte[] �迭 ����
		int data2;
		
		try (InputStream is2 = new FileInputStream(inFile2)){	
			//try (with resource: ��ü ����, RAM�� ���) << close()�� �ڵ����� ó��. AutoClosable ������ Ŭ�����̾�� �Ѵ�.
			
			while((data2 = is2.read(arr2))!=-1) {	
				//�ѱ�ó�� #2: is.read(byte�迭);
				
				String str2 = new String (arr2, Charset.forName("UTF-8"));
				//�ѱ�  ó�� #3 : String(byte�迭, offset, length, "encoding")
				
				System.out.println(str2);
			}
		}catch(IOException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
	}

}
