package chap19.Ex06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

// �ֿܼ��� (�迭 100byte ����)��ǲ ���� �ѱ� ���� Ex06 �Ʒ� input.txt�� ���� �� charset�� default
// input.txt ���Ͽ��� ���� �о �ֿܼ� ���. 


public class Ex06_ConsoleInputOutputObject {

	public static void main(String[] args) throws IOException {
		
		
		
		InputStream is1_1 = System.in;
		System.out.println("�ѱ��� �Է��ϼ���: ");
		
		byte[] byteArray1 = new byte[100];
		int count1 = is1_1.read(byteArray1);
		String str1 = new String(byteArray1, 0, count1,Charset.defaultCharset());
		
		//�ѱ� �Է� �ޱ�
		
		File oFile = new File("./chap19/Ex06/input.txt");
		OutputStream os1 = new FileOutputStream(oFile); 
		
		os1.write(byteArray1);
		os1.flush();
		os1.close();
		
		//���� ����
		
		
		//���� �ٽ� �о����
		File inFile = new File("./chap19/Ex06/input.txt");
		InputStream is1 = new FileInputStream(inFile);
		byte[] byteArray2 = new byte[100];
		int count2 = is1.read(byteArray2);
		String str2 = new String (byteArray2, Charset.defaultCharset());
		System.out.println(str2);
		
		
		
	}

}
