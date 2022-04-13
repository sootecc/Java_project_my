package chap19.Ex08;

import java.io.InputStreamReader;

public class InputStreamReader_2 {
	
	public static void main(String[] args) {
		
		//1. �ܼ� �Է�(MS949) : default charset, byte ��Ʈ��
		InputStreamReader isr;
		try{
			isr = new InputStreamReader(System.in,"MS949");
			//InputStreamReader : byte -> char�� ��ȯ
			//System.in: �ܼ� �Է�, byte
			
			//isr�� ��ȯ�� char type�� ���� �ִ�.
			
			System.out.println("�ѱ��� ���ϴ� ��� �Է��ϼ���>>> ");
			
			int data;
			while((data = isr.read())!= '\r') {		//�ܼ� �Է� ���
				System.out.print((char)data);
			}
			
			System.out.println();
			System.out.println(isr.getEncoding());
			
		}catch(Exception e) {}
	
		
		System.out.println();
		System.out.println("====================");
		
		
		
		
		
		
		//2. �ܼ� �Է� (UTF-8)
		
		try{
			isr = new InputStreamReader(System.in,"UTF-8");
			System.out.println("�ѱ��� ���ϴ� ��� �Է��ϼ���>>> ");
			
			int data;
			while((data = isr.read())!= '\r') {		//�ܼ� �Է� ���
				System.out.print((char)data);
			}
			
			System.out.println();
			System.out.println(isr.getEncoding());
			
		}catch(Exception e) {}
		
		
		
	}
}
