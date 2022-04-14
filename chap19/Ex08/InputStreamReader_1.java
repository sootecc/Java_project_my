package chap19.Ex08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

//InputStreamReader: byte �����͸� char �������� ��ȯ�ϴ� ��ü  << ���ڵ��� ������ �� �ִ�.
	//byte ������ ���ڵ��� �� �����ؾ� �Ѵ�.		<= encoding: MS949, UTF-8
	//char �������� �ٲٸ� ���ڵ� Ÿ���� �Ű� �� �ʿ䰡 ����.

//��� ����
	//1. FileReader: default charset�� ��� ����, ���� default charset MS949�ε� �ܺ��� ������ UTF-8�� �о� �� ���
	//2. ��Ʈ��ũ���� ���۵Ǵ� ��Ʈ���� UTF-8, MS949 byte ==> char�� ��ȯ ó��


public class InputStreamReader_1 {

	public static void main(String[] args) {

		//1. ���� ��ü ����
		File isr = new File("./chap19/Ex08/isr.txt");	//isr.txt�� UTF-8�� ����Ǿ� �ִ�.
		
		try(Reader reader = new FileReader(isr);){		//���� ������ ���ڵ��� ó���� �� ����. default encoding�� ��� ����
			int data;
			while((data = reader.read())!= -1) { 
				System.out.print((char)data);
			}
		}catch(Exception e) {}
		
		System.out.println("\n=================================");
		
		//2. FileInputStream + InputStreamReader�� �̿��� ���� �б�
		//InputStreamReader(is, "UTF-8"): byte => char�� ��ȯ
		
		try(InputStream is = new FileInputStream(isr);
			InputStreamReader isr1 = new InputStreamReader(is,"UTF-8"); ){		//isr1: char�� ��ȯ�� ���� ��������
			
			int data;
			while((data = isr1.read())!=-1) {
				System.out.print((char)data);
			}
			
			System.out.println();
			System.out.println(isr1.getEncoding());
			
		}catch(Exception e) {}
		
		
		
		
	}

}
