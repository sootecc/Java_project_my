package chap13.Ex09;

//4. �������̽��� ������ Ŭ������ ����. �Ű������� �޾Ƽ� ó��


interface A{
	void abc();
	
}

class C {
	void cde(A a) {
		a.abc();
	}
}


public class AnonymousClass_4 {

	public static void main(String[] args) {
		
		C c = new C();
		
		//4-1. �������̽��� ������ Ŭ���� X , ���������� ����� ����
		A a = new A() {	//�������̽��� ������ �ڽ� �͸� ��ü ���� �� Ÿ���� A�� ������ �������� ������ 
			@Override
			public void abc() {
				System.out.println("Ŭ���� X, �������� O");
			}
		};
		
		c.cde(a);	//���������� �Ű������� ����
		
		
		System.out.println("==============================");
		//4-2. �������̽��� ������ Ŭ���� X, �������� ���� X   << ���� ���� ���� (�ӽ÷� �� ���� ����� ��, �̺�Ʈó��)
		c.cde(new A() {
			@Override
			public void abc() {
				System.out.println("Ŭ���� X, �������� X");
			}
		});
		
		//�⺻������ �������̽��� ������ ��𿡼����� ������ �ؾ��ϳ�
		
	}

}
