package chap19.Ex06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// �ֿܼ��� (�迭 100byte ����)��ǲ ���� �ѱ� ���� Ex06 �Ʒ� input.txt�� ���� �� charset�� default
// input.txt ���Ͽ��� ���� �о �ֿܼ� ���. 


public class Ex06_ConsoleInputOutputObject {

	public static void main(String[] args) throws IOException {
		
		
		//1. �ֿܼ��� �ѱ��� ��ǲ �޴´�. (System.in)		<== byte[] �迭�� �����Ͽ� ó���ؾ� �ѱ� ó�� ����
		InputStream is = System.in;		//new�� �������� �ʰ� ���Ḹ ����, �ֿܼ��� ��ǲ ���� �޴´�.
		
		System.out.println("�ѱ��� �Է� �ϼ���>>> ");
		byte[] byteArray1 = new byte[100];
		int count1 = is.read(byteArray1);		//byteArray1�� byte�� \r\n, count1�� �迭�� ���� ���� ������ ����
		// int data = is.read(); �ѱ��� ó������ ����. data���� 1byte read�� ���� ����		
		
		
		//2. ��ǲ ���� �ѱ��� ���Ͽ� �����Ѵ�. (FileOutputStream)
		File f1 = new File("./chap19/Ex06/input.txt");
		OutputStream fos = new FileOutputStream(f1);	//OutputStream�� ����Ⱑ �⺻	
		
		fos.write(byteArray1);		//����(RAM)���� ������, ���� �����ؼ� 100byte��ŭ ����
		fos.flush();				//flush ȣ���ؾ� ���ۿ� ���� ������ ���Ͽ� ������
		fos.close();				
		
		//3. ����� ���Ͽ��� ���� �о� �´�.	(FileInputStream)
		InputStream fis = new FileInputStream(f1);		//read(): �ѱ��� ó�� ���Ѵ�. read(byte[]): �ѱ� ó��.
		byte[] byteArray2 = new byte[100];
		int count2 = fis.read(byteArray2);				//read(byte[]): �ѱ� ó��
		// int data = fis.read(); �ѱ��� ó������ ����. data���� 1byte read�� ���� ����
		
		System.out.println();
		System.out.println("���Ͽ��� �о� �� ������ ����մϴ�.");
		
		//4. �о� �� �迭�� �ֿܼ� ��� �Ѵ�. (System.out)
		OutputStream os = System.out;					//�ֿܼ� ���: byte[]
		
		os.write(byteArray2);
		os.flush();
		
		is.close();
		fis.close();
		os.close();
		
		
	}

}
