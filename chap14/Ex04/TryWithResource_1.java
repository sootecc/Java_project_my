package chap14.Ex04;

import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TryWithResource_1 {

	public static void main(String[] args) {
		
		//1. ���� ���ҽ� ���� (���� ���α׷��� ���)		--�ڵ尡 ��� ������
		System.out.println("���ڸ� �Է��ϼ���>> ");
		
		 InputStreamReader isr2 = null;		//��� �� �ݵ�� �޸𸮿��� ��ü�� ����, isr2.close();
		 //System.in : �ֿܼ��� �Է��� �޵��� ó��. �� ���� input�� ���� �� �ִ�. (��ü�� ����Ǹ� �� �� input���� �� ����.)
		 
		 
		 
		 try {
			 isr2 = new InputStreamReader(System.in);
			 char input = (char)isr2.read();			//�Ϲ� ����(checked ����): IOException �Է� ��½� ����
			 System.out.println("�Է� ���� = "+input);
		 }
		 catch(IOException e) {
			 e.printStackTrace();	//try{} block���� ���ܰ� �߻��� ��� �ڼ��� ������ ���
		 }
		 finally {		//��ü�� ��� �� �޸� �������� ����
			 if(isr2 != null)
				try {
					isr2.close();		//�Ϲ� ����: IOException�̶� try catch �ʿ�
				} catch (IOException e) {
					e.printStackTrace();
				}		//���ҽ� ����
		 }
		 
		 
		 
		 
		//2. �ڵ� ���ҽ� ���� (Java 1.7 �ڵ����� ���ҽ� ����)--�ڵ尡 �����ϴ�.(�ʿ������� ����)
		 		//����ϴ� ��ü�� AutoCloseable �������̽��� ������ ��ü���� �Ѵ�.
		 		//�ݵ�� ��ü�� close()�� �����ؾ��Ѵ�.
		 		
		 		//���� �� ���� ������ ������ �� �ڵ� ���ҽ� ���� ����
		 		//try(�ڵ����� ���ҽ��� ������ ��ü ����){} catch{} finally{}
		 
		 //InputSteamReader�� AutoCloseable �������̽��� �����ϰ� �ִ�.
		 //Try With Resource: try(with resource : ��ü �޸� �ε�){}
		 try(InputStreamReader isr1 = new InputStreamReader(System.in);){
			char input = (char) isr1.read();
			System.out.println("�Է±��� = "+input);
		 }
		 catch(IOException e) {
			 e.printStackTrace();
		 }	//finally block�� �����ϴ��� ��ü�� �ڵ����� isr1.close()
		 
		
	}

}
