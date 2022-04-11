package chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class FileInputStream_2 {

	public static void main(String[] args) throws IOException {

		//1. �Է� ���� ����
		File inFile = new File("C:\\git\\Java_project_my\\chap19\\Ex04\\FileInputStream1.txt");
		
		//2-1. byte ���� �б� (�� ����Ʈ�� �о ó��)
		InputStream is1 = null;						//��ü ����, finally ��Ͽ��� close
		try {
			is1 = new FileInputStream(inFile);	//��ü ����
			int data;
			while((data = is1.read())!=-1) {	//������ �����Ƿ� read() �޼ҵ常 ���, �ѱ��� ��� read(byte�迭)
				System.out.print((char)data);
			}
		} catch (IOException e) {
			System.out.println("������ ã�� ���߽��ϴ�.");
		} finally {
			if(is1 != null) {
				try {
					is1.close();				//null �� �� close()�� ȣ���ϸ� IOException �߻�
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("\n=============try(with resource){}�� �����ϱ�===========");
		
		
		
		//2-2. 
							
		try (InputStream is1_1 = new FileInputStream(inFile);){
			//try ( with resource : ��ü ����) <--close()�� �ڵ����� �ȴ�. FileInputStream�� Closeable �������̽��� �����ϰ� �ִ�.
		
			int data;
			while((data = is1_1.read())!=-1) {	//������ �����Ƿ� read() �޼ҵ常 ���, �ѱ��� ��� read(byte�迭)
				System.out.print((char)data);
			}
		} catch (IOException e) {
			System.out.println("������ ã�� ���߽��ϴ�.");
		}
		System.out.println("\n");
		
		System.out.println("=============================");
		
		
		
		//3-1. n byte ������ �б�(byte[]�� ó�� ��ġ�������� ���� ������ ����): ���� ����Ʈ�� ���ÿ� �о ó���ӵ��� ����.
				//�迭 ���� ũ�⸸ŭ �о�鿩�� byte �迭�� ����
				//�ѱ� ó������
		InputStream is2 = new FileInputStream(inFile);		//throws�� �ӽ� ó������. 
		
		byte[] byteArray1 = new byte[9];					//�迭�� 9��, 0 ~ 8����
		
		int count1;
		while((count1 = is2.read(byteArray1))!=-1) {		//-1 : ������ ������ ����
				//is2.read(): 1byte�� �д´�.	//�ѱ� ó�� �ȵ�
				//is2.read(byteArray1) :9byte�� �д´�. byteArray1�� ����
				//count1 : 9, 9, 2
				
			for(int i = 0; i<count1;i++) {
				System.out.print((char)byteArray1[i]);
			}
			System.out.println(": count1 = "+count1);
			
			/*
			System.out.println();
			System.out.println("=====================");
			String str = new String(byteArray1, Charset.forName("MS949"));
			System.out.println(str);
			*/
			
		}
		
		is2.close();
		System.out.println("=======================================");
		
		
		
		
		//3-2. n-byte ������ �о �ѱ� ó��
		
		InputStream is3 = new FileInputStream(inFile);		//throws�� �ӽ� ó������. 
		byte[] byteArray2 = new byte[100];					//�迭�� 9��, 0 ~ 8����
		
		int count2;
		
		while((count2 = is3.read(byteArray2))!=-1) {		//count2 = 100, -1
			System.out.print(new String(byteArray2, Charset.forName("MS949")));
			System.out.println(": count2 = "+count2);
		}
		
	
		
		System.out.println("=======================================");
		//3-3. n-byte ������ �о ����. 
		InputStream is4 = new FileInputStream(inFile);
		byte[] byteArray4 = new byte[9];
		
		int offset = 3;
		int length = 6;
		int count4 = is4.read(byteArray4, offset, length);		//length��ŭ �տ��� �о�ͼ� byteArray4�� offset��ġ�� �����϶�
		
		
		
		for(int i = 0; i<offset + count4; i++) {
			System.out.print((char)byteArray4[i]);
		}
		
		is4.close();
			
		
		
		
		
		
	}

}
