package chap01;

public class Ex02_ConsoleOut {

	public static void main(String[] args) {
		
		System.out.printf("���� ���̴� %d �Դϴ�.\n", 30);	//"�������", ����, ����, 		
			//%d�� ���� ���� ���ڷ� ���� �� ��� (10����)
		
		System.out.printf("%o\n", 10);
			//%o�� ���ڰ����� ���� ������ 8������ ��ȯ�� �� ���
		
		System.out.printf("%x\n", 30);
			//%x�� ���ڰ����� ���� ������ 16������ ��ȯ�� �� ���
		
		System.out.printf("%s\n","���");
			//%s�� ���ڿ��� ���ڰ����� ���� �� ���
		
		System.out.printf("%f\n",5.800000);
			//%f�� �Ǽ����� ���ڰ����� ���� �� ���
		
		System.out.printf("%4.2f\n", 5.8);
			//%4.2f�� ��ü 4�ڸ�, �Ҽ��� ���� 2�ڸ��� ���ڰ����� ���� �� ���

		System.out.printf("%d �� %4.2f",10 ,5.8);
	}

}
