package chap19.Ex03;

import java.io.UnsupportedEncodingException;

//EUC-KR - �ѱ� ǥ��, �ѱ� ǥ�� ��ü �� ǥ�� ������ �͸����� �����Ǿ� ����. �� 11,000�� �� �� 2200�� ������ ǥ��. 8000�ڴ� ǥ�� �ȵ�
	//���� : 1byte			<== UTF-8�� ó��
	//�ѱ� : 2byte
	//���������� ��� �� ��

//MS-949(ANSI) - Microsoft�翡�� ������ �ѱ� ǥ�� ��� 11,000�� ��� ǥ���� �� �ִ�. Windows OS
	//���� : 1byte			<== UTF-8�� ó��
	//�ѱ� : 2byte

//UTF-8 : ��� ����(Web, FTP, Mail, ... ), git, Mac  -> ��������
	//���� : 1byte			<== UTF-8�� ó��
	//�ѱ� : 3byte

//UTF-16 :  -> ��������
	//����, �ѱ� : 2byte
	//BOM 2byte: ��� ������ �ĺ��ڵ�


//�ش� ���ڵ� Ÿ�� byte ��Ʈ������ ���ڸ� ������ ���, �ش� ���ڵ� Ÿ������ ���ڸ� ���� �ؾ� ������ �ʴ´�.


//��Ŭ�������� ���ڵ� Ÿ�� ���� 3����.
	//1. ���� ���� : 
	//2. ������Ʈ���� ����:
	//3. ���Ͽ��� ����: 

	//�켱����  (��) ���� >>> ������Ʈ >>> ���� (��)


public class EUCKR_VS_MS949 {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		//EUCKR vs MS949
		
			//1. �����ڸ� byte�� �������� String���� ��ȯ
		byte[] b1 = "a".getBytes("EUC-KR");		//���ڸ� byte�� ��ȯ ==>  ��Ʈ��ũ�� ���ڸ� ������ �� byte ��Ʈ������ ��ȯ�Ͽ� ����
		//���ܰ� �߻���(UnsupportedEncodingException) <= ��Ÿ�� �߻��� ��� ���ڵ� �� �� ���� ���ܰ� �߻���.
		byte[] b2 = "a".getBytes("MS949");		//���ڿ� -> byte[]
		
		System.out.println(b1.length);			//1
		System.out.println(b2.length);			//1 ������ 1byte
			
		System.out.println(new String(b1, "EUC-KR"));		//byte[] => ���ڿ��� �ٲ�
		System.out.println(new String(b2, "MS949"));		
	
		System.out.println();
	
		//2. �ѱ��� byte�� �������� String���� ��������
		byte[] b3 = "��".getBytes("EUC-KR");
		byte[] b4 = "��".getBytes("MS949");
		
		System.out.println(b3.length);		//1
		System.out.println(b4.length);		//2
		
		System.out.println(new String(b3, "EUC-KR"));		//?
		System.out.println(new String(b4, "MS949"));		//�v
	
		//3. EUC-KR�� ���� ��� ������ �͸� ǥ��, �� 2000��
		// MS949�� 11,000�� ��� ǥ���.
		byte[] b5 = "�v".getBytes("EUC-KR");
		byte[] b6 = "�v".getBytes("MS949");
		
		System.out.println(b5.length);
		System.out.println(b6.length);
		
		System.out.println(new String(b5, "EUC-KR"));
		System.out.println(new String(b6, "MS949"));
		
		
	
	
	
	}
}
