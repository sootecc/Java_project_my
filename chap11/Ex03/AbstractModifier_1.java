package chap11.Ex03;

//abstract(�߻�) �޼ҵ�: ���࿵���� ���� �޼ҵ� 
//�߻� Ŭ������ ��üȭ �� �� ����.
	// �ڽ�Ŭ�������� �������Ͽ� �����θ� �����ؾ� �Ѵ�.
// 		  : abstract void print();
// �߻� Ŭ����: abstract class A{�߻�޼ҵ带 �ϳ� �̻� �����ϸ�}
	// �ڽ� Ŭ�������� �޼ҵ带 �������Ͽ� �����θ� �����Ѵ�. 

// �޼ҵ��� �⺻ ����: void print(){}


/* ȸ���� ��� ���� �޼ҵ带 ����
 * ����: �޼ҵ带 �������ش�.
 * 
 * ����: ����� �߻�޼ҵ带 �������̵��Ͽ� �����θ� �����.
 * ���� Ŭ�������� �޼ҵ� �������̵��� ������ �����ϱ� ���� ���
 */


abstract class A{				//�߻� �޼ҵ尡 �ϳ��� ���� �߻� Ŭ���������Ѵ�.
	abstract void print();		//�߻� �޼ҵ�
	abstract void cry();
}

class B extends A{		//��ũ��Ʈ Ŭ���� : �߻� Ŭ�������� ������ �޼ҵ带 ��� ������ Ŭ����
	@Override	
	void print() {
		System.out.println("��ũ��Ʈ Ŭ����: �߻� Ŭ������ �߻� �޼ҵ带 ��� ������ Ŭ����");
	}
	@Override
	void cry() {
		System.out.println("�߿� ");
	}
}

abstract class C extends A{	//�θ��� �߻� �޼ҵ� �� �Ϻθ� ������ ���: �߻� Ŭ����
	@Override
	void print() {
		
	}
}

class D extends C{		//��ũ��Ʈ Ŭ����: �θ��� ��� �߻� �޼ҵ带 ���������� ������ Ŭ����
	@Override
	void cry() {
		// TODO Auto-generated method stub
		
	}
}


public class AbstractModifier_1 {

	public static void main(String[] args) {
		
	
	}

}
