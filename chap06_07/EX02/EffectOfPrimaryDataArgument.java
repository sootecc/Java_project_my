package chap06_07.EX02;

public class EffectOfPrimaryDataArgument {
		int abc; //�ʵ�: heap������ ����, ��üȭ�� ���Ѿ� ��밡��
	
	
	static int twice(int a){		//���� �Ű�����
		a = a*2;
		return a;
	}
	
	
	public static void main(String[] args) {
		int a = 3;						//��������: stack ������ ������� �Բ� ����
		int result1 = twice(3);
		System.out.println(result1);
		
		int result2 = twice(a);
		System.out.println(result2);
		System.out.println(a);
		
	}

}
