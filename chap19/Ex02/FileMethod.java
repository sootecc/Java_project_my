package chap19.Ex02;

import java.io.File;

public class FileMethod {

	public static void main(String[] args) {
		
		//1. C:\�� �۾� ���� ���� (temp)
		File tempDir = new File("C:/temp");
		if(!tempDir.exists()) {
			tempDir.mkdir();
		}
		
		
		//2. ���� ��ü ����(C:/Windows)
		File file = new File("C:/Windows");
		
		//3. ���� ��ü�� ���� �޼ҵ� ���
		System.out.printf("���� ��� ��� %s%s",file.getAbsolutePath(),System.lineSeparator());
		System.out.printf("������ ���� ���� %b%s",file.isDirectory(),System.lineSeparator());
		System.out.printf("������ ���� ���� %b%s",file.isFile(),System.lineSeparator());
		System.out.printf("����/���� �̸� ���:  %s%s",file.getName(),System.lineSeparator());   //����, ���� �̸� ���
		System.out.printf("�θ� ���� �̸� ���:  %s%s",file.getParent(),System.lineSeparator());   //�θ� ���� �̸� ���
		
		
		
		File newFile1 = new File("C:/temp/abc");
		System.out.printf("%b%s",newFile1.mkdir(),System.lineSeparator());	//������ ������ ���: true, ������ �̹� �ְų� �������� ���� ���: false
		System.out.printf("%b%s",newFile1.exists(),System.lineSeparator());
		
		File newFile2 = new File("C:/temp/bcd/cde");	//������ ������ �Ѳ����� �����ϱ�
		System.out.printf("%b%s",newFile2.mkdir(),System.lineSeparator());		//false, ���� �������� �� ���� ������ �Ұ�
		System.out.printf("%b%s",newFile2.mkdirs(),System.lineSeparator());		//true, ���� �������� ���� ����
		
		File newFile3 = new File("C:/temp/def/hij/klm");
		System.out.printf("%b%s",newFile3.mkdirs(),System.lineSeparator());	
		
		//4. File ��ü�� ����ؼ� ���� ������ ���� ����
		
		File[] fname = file.listFiles();		//file : "C:/Windows" ������ ��� ����, ������ �̸��� ���� �迭�� ����
		
		
		for(File k : fname) {
			System.out.println((k.isDirectory()? "����: ":"����: ") + k.getName());
		}
		
		
		
	}

}
