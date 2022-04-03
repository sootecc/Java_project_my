package chap06_07.Ex06;

class Abc {		//�ܺ� Ŭ����: public �����ڸ� ��� ����. default �⺻���� ����
				//class: public, default
				//���� �����ڰ� ���� �� �ִ� Ű����: class ��, �ʵ�, �޼ҵ�, ������
				//�ݵ�� ���� ������(=���� ������)�� �Ҵ�Ǿ� �ִ�. �����Ǿ� ������ default
				//���� ������:
					/*
					 * 1. public: default + �ٸ� ��Ű������ ���� ����
					 * 2. protected: default + �ٸ� ��Ű������ ���� ����(��� ���� ���)
					 * 3. default: ���� ��Ű�� ������ ���� ���� (import ����)
					 * 4. private: ���� Ŭ���� ���ο����� ��� ����
					 */
	public int a = 10;
	protected int b = 20;
	int c = 30;
	private int d = 40;
	
	// Abc(){}	< �⺻ ������: �ʵ��� �ʱⰪ�� �ο��ؼ� ��ü�� ����
	
	public void print1() {
		System.out.println("�ٸ� ��Ű������ ���� ����: public");
	}
	protected void print2() {
		System.out.println("�ٸ� ��Ű������ ���� ����(���): protected");
	}
	void print3() {
		System.out.println("���� ��Ű�� ������ ���� ����: default");
	}
	private void print4() {
		System.out.println("���� Ŭ���� ���ο����� ���� ����: private");
	}
	
	
	
}

public class Ex06_ALL {

	public static void main(String[] args) {
		
		Abc abc1 = new Abc();		//�⺻ ������ ȣ��
		//Abc: Ŭ������, abc1: �޸𸮿� �ε��� ��ü��, new: ��ü�� heap ������ ����, Abc(): ������ ȣ��
		//Abc(): �⺻ ������(��������)
		//������: 1. Ŭ���� �̸��� ������ �޼ҵ�
		//		2. ����Ÿ���� ����
		
		
		//���� ��Ű�� ������ ȣ��
		abc1.a = 100;	//public
		abc1.b = 200;	//protected
		abc1.c = 300;	//default
	//	abc1.d = 400;   //private(X)
		
		//���� ��Ű�� ������ �޼ҵ� ȣ��
		abc1.print1();	//public
		abc1.print2();	//protected
		abc1.print3();	//default
	//	abc1.print4();	//private(X)
		
		
		
		
		
	}

}
