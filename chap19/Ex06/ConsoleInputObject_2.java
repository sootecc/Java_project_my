package chap19.Ex06;

import java.io.IOException;
import java.io.InputStream;




public class ConsoleInputObject_2 {

	public static void main(String[] args) throws IOException {

		InputStream is1 = System.in;			
		
		System.out.println("������ �Է��ϼ��� >> ");
		
		//1. 1-byte ���� �б�
		int data;
		while((data = is1.read()) != '\r') {	//	'\r'  	<-- is.read() ȣ��� �� �ֿܼ��� ��ǲ�� ���
			System.out.print((char)data);
		}
		is1.read();		//10 <== \n	���ۿ� \n��������. ���ۿ��� \n�� ó���� ����Ѵ�. �׷��� ������ ���� read()���� \n ��
			//	\n�� ���ۿ��� ������.
		System.out.println();System.out.println();
		System.out.println("========================");
		
		
		//2. n-byte ���� �б�(byte[]�� ó�� ��ġ���� ���� ������ ����)
		byte[] byteArray1 = new byte[512];	//�ֿܼ��� �迭�� ����� ��
		int count1 = is1.read(byteArray1);	//count1�� 100, 100, 30, -1
		
		for(int i= 0; i<count1; i++) {
			System.out.print((char)byteArray1[i]);
			System.out.println(": count1 = " + count1);
			
		}
		
		int count2;
		count2 = is1.read(byteArray1);		//�迭 ���ο� \r\n ����.
		System.out.println(new String(byteArray1, 0, count2));
		
		/*
		while((count2 = is1.read(byteArray1)) != '\r') {	
			System.out.println(new String(byteArray1));
		}
		*/		//�� java is fun /  kkkk kk kkk ���� ���� ���� ���ո� ����Ǵ°���?
		//is1.read();
		System.out.println("==========================");
		
		
		
		
		
		
		//3. n-byte ������ �а�(length��ŭ �о�ͼ� byte[] offset ��ġ���� ����
		
		byte[] byteArray2 = new byte[8];
		int offset = 3;
		int length = 5; 
		
		int count3 = is1.read(byteArray2, offset, length);
		
		for(int i=0;i<offset + length; i++) {
			System.out.println((char)byteArray2[i]);
		}
		
		is1.close();
		
	}

}
