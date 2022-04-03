package chap12.Ex06;

//interface�� default �޼ҵ�: �������̽� ���� �����ΰ� �ִ� �޼ҵ�
	// public default void bcd(){}
	// java 1.8 �̻󿡼� ���Ӱ� �߰��� ��� ..

	// defaultŰ�� �־�� �ϰ� ���������ڰ� �ƴϴ�.
	
//������ �����Ǿ� �ִ� �������̽����� ���ο� ����� �߰��� �� ���� Ŭ�������� ������ �ʿ���� ���ο� ����� �߰� �� �� ���
	
interface A{
	void abc();				//2005�� ������ �޼ҵ�, public abstract�� ������. �����ΰ� ���� �߻� �޼ҵ�
	default void bcd() {	//2020�� ������ �޼ҵ�
		System.out.println("A �������̽��� bdc()");
	}
	//void ttt();   ���� Ŭ�������� ���ο� �߻� �޼ҵ带 �߰��ϸ� ��ӵ� ��� ���� Ŭ������ ���� �߻�
}

class B implements A{
	public void abc() {
		System.out.println("B Ŭ������ abc()");
	}
}

class C implements A{
	public void abc() {
		System.out.println("C Ŭ������ abc()");
	}
	public void bcd() {			//default �޼ҵ嵵 �������̵� �� �� �ִ�.
		System.out.println("C Ŭ������ bcd()");
	}
}



public class DefaultMethod {

	public static void main(String[] args) {
		
		//1. ��ü ����
		A a1 = new B();
		A a2 = new C();
		
		//2. �޼ҵ� ȣ��
		a1.abc();	//
		a2.abc();
		
		
			
	}

}
