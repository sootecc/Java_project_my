package chap11.Ex02;

//final method & final class Ư¡

//final method: �߿��� �޼���� �ڽĿ��� ������ �� �� ������ ����
//final class: ����� �Ұ��� Ŭ����

class A {
	void abc() {
		
	}
	final void bcd() {		//final �Ҵ�� �޼ҵ�� �ڽ� Ŭ�������� �������̵��� �Ұ�
		
	}
}

class B extends A {
	void abc() {}		//�޼ҵ� �������̵���
//	void bcd() {}		//�޼ҵ� �������̵� �Ұ���
	
}

final class C{}		//final class�� ����� �Ұ��� Ŭ����
//class D extends C{}	��� �Ұ�

public class FinalModifier_2 {

	public static void main(String[] args) {

	}

}
