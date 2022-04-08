package chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_1 {

	public static void main(String[] args) throws IOException   {
		
		//���� �۾� ���丮 ��ġ Ȯ��
		System.out.println(System.getProperty("user.dir"));
		
		
		//1. �Է� ���� ����
		
			//�����η� ����
		File inFile1 = new File("C:\\Users\\kosmo\\Desktop\\11kjs\\chap19\\files\\FileInputstream1.txt");
			
			//����η� ����: ���� �۾� ���丮�� �������� ����
		File inFile = new File("chap19\\files\\FileInputstream1.txt");
		
		//InputStream ��ü�� �����ؾ� ������ ������ ���� �� �ִ�.
		InputStream is = new FileInputStream(inFile);
			//InputStream�� �߻� Ŭ����, ���� ��ü ������ �� �� ����. Ÿ�� ������ �����ϴ�.
		//������ ������ ���
	

		//UTF-8 : ���� : 1byte, �ѱ�: 3byte
		//UTF-16 : ���� : 2byte, �ѱ�: 2byte	ù ��° BOM, 2byte <= �ĺ���
		//MS949 : ���� : 1byte, �ѱ�: 2byte
		//EUC-KR : ���� : 2byte, �ѱ�: 2byte
		
		//�� ����Ʈ �����͸� �о char�� ��ȯ �� ���
		System.out.println(is.read());		//read() �� ����Ʈ�� �о����
		System.out.print((char)is.read());			
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.println();
		System.out.println("================");
		
		//stream ���� ������ �޸𸮿��� �����ȴ�. ���ο� stream�� �����ؾ� �ٽ� ���� �� �ִ�.
		
		//int read(): �� ����Ʈ�� �о ���� ������ ��� ����� ����, ���� �����Ͱ� �������� ���� ��� -1 ���� 
		//while���� ����ؼ� �� ���� ���
		int data;
		InputStream is2 = new FileInputStream(inFile);
		while((data = is2.read()) != -1) {		//������ ������ ��� ��ȯ
			System.out.print((char)data);
		}
		System.out.println();
		System.out.println();
		System.out.println("==========================");
		
		InputStream is3 = new FileInputStream(inFile);
		while((data = is3.read()) != -1) {		//������ ������ ��� ��ȯ
			System.out.println("���� ������: "+(char)data+"���� ����Ʈ ��: "+is3.available());
		
		
		
		
		
		
		
		
		
		
		
		}
		
	}

}
