package chap13.Ex07;

//�͸� �̳�Ŭ������ ����Ͽ� �������̽� ��ü ����


class A{
	C c = new C() {		//�͸� �̳�Ŭ����
		public void bcd() {
			System.out.println("�͸� �̳�Ŭ����");
		}
	};		
	
	//C Ÿ��, �ν��Ͻ� ���� c
	void abc() {
		c.bcd();
	}
	
	
}

interface C {			//�������̽�, �߻�޼ҵ� ����: void bcd()
	public abstract void bcd();
}


public class AnonymousClass_2 {
	public static void main(String[] args) {
		//1. ��ü ���� �� �޼ҵ� ȣ��
		A a = new A();
		a.abc();			//�͸� �̳� Ŭ����
		
	}
}
