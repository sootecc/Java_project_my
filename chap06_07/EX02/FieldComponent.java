package chap06_07.EX02;

class Abc{
	int m = 3;		//�ʵ� heap�� ����, ��üȭ ������ �� ��� ����
	int n = 4;
	
	void work1() {				//��ǲ�� ���� �޼ҵ�
		int k = 5;				//��������: stack ������ ����, �޼ҵ� ����� �������
		System.out.println(k);
		work2(3);				//�ٸ� �޼ҵ� ȣ��
	}
	
	void work2(int i) {
		int j = 4;					//��������
		System.out.println(i+j);
		
		int l;						//���������̹Ƿ� �ڵ� �ʱ�ȭ�� ���� �ʴ´�.
		l=2;
		System.out.println(l);
	}
	
}



public class FieldComponent {

	public static void main(String[] args) {
		
		//Ŭ������ Ȱ���Ͽ� ��ü ����
		Abc abc = new Abc();
		
		System.out.println(abc.m);
		System.out.println(abc.n);
		
		//�޼ҵ� ȣ��
		abc.work1();
	
	}

}
