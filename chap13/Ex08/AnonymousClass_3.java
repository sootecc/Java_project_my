package chap13.Ex08;

//Ŭ���� ���� �� ���� ������ ���/ �̻���� ��� �Ű������� ��ü�� ����

interface A{
	public abstract void abc();
}
// 1. �ڽ� Ŭ������ ���� ����

class B implements A{
	@Override
	public void abc() {
		System.out.println("�Ű����� ����");
	}
}

class C {	//cde �޼ҵ忡 input������ A Ÿ���� ��ü a�� �޴´�.
	
	void cde(A a) {		//�Ű����� ������ AŸ���� ��ü�� �����ش�.
		a.abc();
	}	
}



public class AnonymousClass_3 {

	public static void main(String[] args) {
		
		// ��� 1: Ŭ������ o + ���������� o
		C c = new C();		
		A a = new B();		//���� ���� ����
		c.cde(a);			//�Ű������� ��ü a�� �����ؼ� ������
		
		System.out.println("===================");
		// ��� 2: Ŭ������ o + ���������� x
		c.cde(new B());
		
	}

}
