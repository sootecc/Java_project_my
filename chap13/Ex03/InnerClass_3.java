package chap13.Ex03;

/*
 * static innerclass: �ܺ�Ŭ������ �ν��Ͻ� �ʵ�, �ν��Ͻ� �޼ҵ�� ���� �Ұ�
 * 					  �ܺ�Ŭ������ static �ʵ�, static �޼ҵ�� ���� ����
 */



class A{
	int a = 3;				//�ν��Ͻ� �ʵ�, ��üȭ�ؾ� ���� ����
	static int b = 4;		//static �ʵ�, ��ü ���� ���� ���� ����
	
	void method1() {		//�ν��Ͻ� �޼ҵ�: ��ü ���� �� ����
		System.out.println("instance method");
	}
	static void method2() {	//static �޼ҵ�: ��ü ���� ���� ���� ����
		System.out.println("static method");
	}
	static class B{			//static �̳�Ŭ����: �ܺ� ��ü�� �������� �ʰ� ��ü ���� ����
		void bcd() {
			//1. static class���� �ܺ�Ŭ������ �ν��Ͻ� �ʵ� ���� �Ұ�
			//System.out.println(a);
			
			System.out.println(b);	//static �̳�Ŭ�������� �ܺ�Ŭ������  static �ʵ峪 �޼ҵ� ���� ����
			
			
			//2. �޼ҵ� ȣ��
			//method1();	�ν��Ͻ� �޼ҵ� ȣ�� �Ұ�	
			method2();	//	static �޼ҵ� ȣ�� ����
		
		}
	}
}


public class InnerClass_3 {

	public static void main(String[] args) {
		//1. static �̳�Ŭ���� ��ü ����
		A.B	b = new A.B();			//static �̳�Ŭ������ �ܺ� ��ü ���� ���� ��ü ���� ����
		b.bcd();
		
	}

}
