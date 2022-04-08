package chap19.Ex03;

import java.nio.charset.Charset;		//Charset Ŭ����

public class CreateCharsetObject {

	public static void main(String[] args) {

		//���� ���ڵ� ������ �����ϴ� ���
		
		//1. Charset.defaultCharset(); 	<== �ý����� �⺻ ������ �ε�(���ڵ� Ÿ��)
		Charset cs1 = Charset.defaultCharset();		//���� �޼���, �ý����� �⺻ ������ charset�� �ε�
		
		System.out.printf("%s%s",cs1,System.lineSeparator());	//MS949 --> x-windows 949 (MS949�� Ȯ�� ����)
									//UTF-8 
	
	
		//2. Charset.forname("MS949");	<== ���� �Ҵ��ؼ� ���
		Charset cs2 = Charset.forName("MS949");
		System.out.printf("%s%s",cs2,System.lineSeparator());
	
		
		Charset cs3 = Charset.forName("UTF-8");
		System.out.printf("%s%s",cs3,System.lineSeparator());
	
		Charset cs4 = Charset.forName("EUC-KR");
		System.out.printf("%s%s",cs4,System.lineSeparator());
	
		System.out.printf("%s",System.lineSeparator());
		System.out.printf("%b%s",Charset.isSupported("MS949"),System.lineSeparator());	//�����ϴ� ���ڵ� �� Ȯ��
		System.out.printf("%b%s",Charset.isSupported("UTF-8"),System.lineSeparator());
		System.out.printf("%b%s",Charset.isSupported("UTF-16"),System.lineSeparator());
		System.out.printf("%b%s",Charset.isSupported("EUC-KR"),System.lineSeparator());
	
		
	
	}

}
