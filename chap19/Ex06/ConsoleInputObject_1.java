package chap19.Ex06;

import java.io.IOException;
import java.io.InputStream;

/*
 	System.in : Console���� input�� �޴� ��ü(�ڹٿ��� ����), InputStream
 			Windows : �ֿܼ��� Enter�� ������ \n\r
 			MAC		: �ֿܼ��� Enter�� ������ \r
 			
 	System.out: Console�� ����� �ϴ� ��ü, OutputStream
 	
 */



public class ConsoleInputObject_1 {

	public static void main(String[] args) throws IOException {

		//1. Console���� input �ޱ� ���� ��ü ����
		InputStream is1 = System.in;				//is1�� �ֿܼ��� ��ǲ �޾Ƽ� ó���ϴ� ��ü
		
		System.out.println("������ �Է��ϼ���. >>> ");
		
		int data;
		
		while((data = is1.read())!='\r') {		//Console input���� \r����				1byte�� �о data������ �Ҵ�
			System.out.println("���� ������: "+(char)data + "���� ����Ʈ �� : "+ is1.available());
		}
		
		System.out.println(data);			//13 <= \r
		System.out.println(is1.read());		//10 <= \n
		
		
		
		System.out.println("======================");
		
		System.out.println("������ �Է��ϼ���.2 >>> ");
		is1 = System.in;
		
		while((data = is1.read())!='\r') {		//Console input���� \r����				1byte�� �о data������ �Ҵ�
			System.out.print((char)data);
		}
		
		System.out.println(data);		//10
		System.out.println(is1.read());//�� �̻� read�� ����.
		
		
	}

}
