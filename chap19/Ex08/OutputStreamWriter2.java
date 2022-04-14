package chap19.Ex08;

import java.io.OutputStreamWriter;



/*

	Reader / Writer : �߻� Ŭ����, char�� ó��, ����(O), �̹���(O).. ��� �����͸� ó�� �� �� �ִ�.
	FileReader / FileWriter : �ϼ� �� �ִ� Ŭ����, default charset�� ���. 
	InputStreamReader / OutputStreamWriter : ���� �� encoding(MS949, UTF-8)�� ���� �� �� �ִ�.
 
 	����: System.in : �ֿܼ��� �Է�, System.out: �ֿܼ� ��� <== Application���� �� �� close() �Ǹ� ���� �Ұ�
 	System.in, System.out	<= byte �б�, byte ����
 	
 */



public class OutputStreamWriter2 {
	
	public static void main(String[] args) {
		
		//1. �ܼ� ��� (Application Default: MS949  =>  MS949)
		OutputStreamWriter osw;
		try{
			osw = new OutputStreamWriter(System.out, "MS949");
			osw.write("OutputStreamWriter2 ���� �����Դϴ�. \n".toCharArray()); 	//String�� char �迭�� ����
			osw.write("�ѱ۰� ������ ��� ���ԵǾ� �ֽ��ϴ�."); //String
			osw.write('\n');
			osw.write("Good Bye!!!! \n\n");		//���ۿ� ��������.
			osw.flush();			//���ۿ� ����� ���� �ַܼ� ����ϱ� ���� �ʿ��ϴ�.
			
		}catch(Exception e) {}
		
		
		
		//2. �ܼ� ���(Application Deafult: MS949 => UTF-8)
		try{
			osw = new OutputStreamWriter(System.out, "UTF-8");
			osw.write("OutputStreamWriter2 ���� �����Դϴ�. \n".toCharArray()); 	//String�� char �迭�� ����
			osw.write("�ѱ۰� ������ ��� ���ԵǾ� �ֽ��ϴ�."); //String
			osw.write('\n');
			osw.write("Good Bye!!!! \n\n");		//���ۿ� ��������.
			osw.flush();			//���ۿ� ����� ���� �ַܼ� ����ϱ� ���� �ʿ��ϴ�.
			
		}catch(Exception e) {}
		
		
		
		
		
	}
}
