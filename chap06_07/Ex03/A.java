package chap06_07.Ex03;

public class A {
	
	//1. ���� Ÿ���� ���� �޼ҵ�: void �޼ҵ��(){}
	public void print() {						//�ٸ� ��Ű���� import�� �޼ҵ���� ���Ǳ� ���� public�� �ʿ��ϴ�
		System.out.println("�ȳ�");
	}
	
	//2. ���� Ÿ���� �ִ� �޼ҵ�
	public int data() {
		return 3;
	}
	
	//3. ���� Ÿ��: double
	public double sum (int a, double b) {
		return a+b;
	}
	
	//4. ���� Ÿ���� void + �޼ҵ� ���ο��� ������ ����: (�Լ� ���Ḧ �ǹ�)
	public void printMethod(int m) {
		if(m<0 ||m>12) {
			System.out.println("�߸��� �Է°��Դϴ�. 1 ~ 12 ������ �Է� �����մϴ�.");
			return;  //�޼ҵ� ����
		}
	}
	
}
