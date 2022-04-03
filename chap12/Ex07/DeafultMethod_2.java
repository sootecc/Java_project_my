package chap12.Ex07;

interface A{	//�θ� �������̽�
	
	default void abc() {	//�������̽����� �����ΰ� �ִ� �޼ҵ带 ������ �� default
		System.out.println("A �������̽��� abc()");
	}
}

class B implements A{		//extends Object�� ����
	public void abc() {		//�������̵�
		//super.abc();		//��� Ŭ������ Object�� ��ӹޱ� ������ �̰��� Object�� abc()�� ����
		A.super.abc();		//�䷸�� �ؾ� interface�� abc()
		System.out.println("B Ŭ������ abc()");
	}
}


public class DeafultMethod_2 {

	public static void main(String[] args) {
		
		//1. ��ü ����
		B b = new B();
		
		//2. �޼ҵ� ȣ��
		b.abc();	//B�� abc()�� ȣ��
		
		System.out.println("==============");
		
		A a1 = new B();		//�������̽��� ��ü ���� �Ұ�, Ÿ���� ����
		a1.abc();			//�������̵��� ���� B�� abc()
		
	}

}
