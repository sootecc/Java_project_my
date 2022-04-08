package chap19.Ex01;

import java.io.File;	//���ϰ� ������ �ٷ�� ��ü 
import java.io.IOException;

//���� : ��Ŭ�������� ������ ������ C:\�� �����ϸ� ���� ������ ���� ������ �߻��� �� �ִ�. 
	//1. ��Ŭ������ ������ �������� ����
	//2. ���� ���ο� ������ ����

//File ��ü ���� ���� �ĺ��ڸ� ������ ��� 
	//C:\abc\abc.txt  

	//1. Windows�� ���: String path = "C:\\abc\\abc.txt"		""���� Ư�����ڸ� ó���ϱ� ���� \�� �� �� �� �־��ش�.
	//	Windows 10	 : String path = "C:/abc/abc.txt"

	//2. MAC�� ���:	String path = "C:/abc/abc.txt"			

	//ȣȯ�� ���ؼ� ���������� ����� �� �ִ� �ڵ� �ۼ�
	//String path = "C:"+ File.separator + "abc"+File.separator + "abc.txt"
	
	
public class CreateFileObject {

	public static void main(String[] args) throws IOException {

		//1. File ��ü�� ����ؼ� ���� ����. �ش� �����̳� ������ �������� �ʴ� ��� 
		File tempDir = new File("C:\\temp001");
		if(!tempDir.exists()) {		//�ش� ��ο� �����̳� ������ �����ϸ� exist�� true
			tempDir.mkdir();		//���� ���� ��ɾ�
		}
		
		System.out.printf("%b%s",tempDir.exists(),System.lineSeparator());
		
		//2. File ��ü�� ����ؼ� ���� ����
		File newFile = new File("C:/temp001/newfile.txt");		//C:\�� ������ ������ ��� ���� ������ ���� ���� ���ܰ� �߻��� �� �ִ�. <=��Ŭ������ ������ �������� ����
		if(!newFile.exists()) {
			newFile.createNewFile();		//������ ������ �� ���ܰ� �߻��� �� �ִ�. ����ó���� �ʿ�
		}
		System.out.printf("%b%s",newFile.exists(),System.lineSeparator());
		System.out.printf("%s",System.lineSeparator());
		
		//3. ���� ������
		File newFile2 = new File("C:\\temp001\\newFile01.txt");		//Windows 10 ���� ������
		File newFile3 = new File("C:/temp001/newFile02.txt");		//Windows 10 or MAC
		
		if(!newFile2.exists()) {
			newFile2.createNewFile();
		}
		if(!newFile3.exists()) {
			newFile3.createNewFile();
		}
		
		System.out.printf("%b%s",newFile2.exists(),System.lineSeparator());
		System.out.printf("%b%s",newFile3.exists(),System.lineSeparator());
		
		
		//��� OS���� �������� �ĺ� ������ �ڵ�
		File newFile4 = new File("C:"+File.separator+"temp001"+File.separator+"newFile03.txt");
		if(!newFile4.exists()) {
			newFile4.createNewFile();
		}
		System.out.printf("%b%s",newFile4.exists(),System.lineSeparator());
		
		//4. ���� ��η� ó�� : �ٸ� �ý������� �̵��� ���, �� �ý��� ȯ�濡 �µ��� ������ �ʿ���
		File newFile5 = new File("C:/temp001/newfile05.txt");							//���� ��η� ó��
		System.out.printf("%s%s",newFile5.getAbsolutePath(),System.lineSeparator());	//file ��ü�� ����� ������ ���� ��θ� ��� 
		
		//5. ��� ��η� ó�� <-- ����
		//���� ���� �۾� ���� ��ġ�� �˾ƾ��Ѵ�.
		System.out.printf("%s%s",System.getProperty("user.dir"),System.lineSeparator());	//���� �۾� ������ ��ġ
				//��Ŭ���� ���� ���� ��ġ
		File newFile6 = new File("newFile06.txt");		
		System.out.printf("%s%s",newFile6.getAbsolutePath(),System.lineSeparator());
	}
}
