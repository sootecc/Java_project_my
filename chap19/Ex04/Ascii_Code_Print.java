package chap19.Ex04;


/*
 	ASCII �ڵ� �� ���: 1byte = 8bit , ù ��Ʈ�� ��ȣ��Ʈ, ���� 7bit
 		1 ~ 32��Ʈ ������ ����� �� ���� Ư���� �ڵ�, null, ����� ����, �����(7), ����(10) ��..
 		127 : del
 		
 		���� ��� ���� 33 ~ 126
 		����, ����, Ư������
 		
 		���
 		===================================
 		ASCII		����		ASCII		����
 		===================================
 */
public class Ascii_Code_Print {

	public static void main(String[] args) {

		System.out.println("=============================");
		System.out.println("ASCII\t����\t\tASCII\t����");
		System.out.println("=============================");
		for(int i = 33; i<127; i+=2 ) {
			System.out.println(i+"\t"+(char)i+"\t\t"+(i+1)+"\t"+(char)(i+1));
			
		}
	}

}
