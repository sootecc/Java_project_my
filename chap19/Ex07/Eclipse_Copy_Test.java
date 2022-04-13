package chap19.Ex07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Eclipse_Copy_Test {

	public static void main(String[] args) {
		
		// �� ������ ����, Buffered�� ������� �ʰ� ó���ϴ� ���, Buffered�� ����ϴ� ��� �ӵ� ����.
		
		File orgFile = new File("C:\\Temp\\copy_test\\eclipse_origin.exe");	//���� ����
		File copyFile1 = new File("C:\\Temp\\copy_test\\eclipse_copy1.exe");	//Buffered�� ������� �ʰ� ó��
		File copyFile2 = new File("C:\\Temp\\copy_test\\eclipse_copy2.exe");	//Buffered�� ����Ͽ� ó��
		
		// ���� ������ �ϱ� ���� ���� ����
		long start, end, time1, time2;		//time1: Buffered(X), time2: Buffered(O)
		
		//1. Buffered�� ������� �ʰ� ó��

		start = System.nanoTime();	//���� �ð�
		
		try (InputStream is = new FileInputStream(orgFile);
			 OutputStream os = new FileOutputStream(copyFile1);		//Autoclosealbe
			){
			//������ ���� �ڵ� ����
			int data;
			while((data = is.read()) != -1) {		//is ���� 1byte �о, -1 ���������� 
				os.write(data);						//os �� 1byte ����
			}
		} catch (IOException e) {}
		
		end = System.nanoTime();
		time1 = end - start;
		System.out.println("Without Buffered IO Stream "+time1);	//���۸� ������� �ʰ� ����. copy1.jpg
		
		
		
		//2. Buffered�� ����Ͽ� ó��(BufferedInputStream, BufferedOutStream)
		
		start = System.nanoTime();	//���� �ð�
		
		try (InputStream is = new FileInputStream(orgFile);					//��� ��Ʈ��
			 BufferedInputStream bis = new BufferedInputStream(is);			//�߰� ����� �����ϴ� ��Ʈ��, ������ ������ ó��. (Buffer ���)
			 OutputStream os = new FileOutputStream(copyFile2);				//��� ��Ʈ��
			 BufferedOutputStream bos = new BufferedOutputStream(os);		//�߰� ����� ����(����)
			){
			//������ ���� �ڵ� ����
			int data;
			while((data = bis.read()) != -1) {		//���۸� ����ؼ� �б� (������)
				bos.write(data);					//���۸� ����ؼ� ���� (����)
			}
		} catch (IOException e) {}
		
		end = System.nanoTime();
		time2 = end - start;
		System.out.println("With Buffered IO Stream "+time2);	//���۸� ������� �ʰ� ����. copy1.jpg
		
		//����� ���(time2), ������� ���� ���(time1)�� ����
		System.out.println((double)time1/time2);
				
	}
}
