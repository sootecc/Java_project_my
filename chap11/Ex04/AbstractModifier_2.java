package chap11.Ex04;

//�߻� Ŭ������ ������� ������?
	//�ڽ� Ŭ�������� �޼ҵ� �������̵��� �������̵��� ��Ÿ�� ���� �߸� ������ ���輺�� �ִ�.

class Animal{
	void cry() {}		//������ cry() �������ְ� ������ �������� ����.
	
}
class Cat extends Animal{
	void cRy() {		//�������̵��� �ƴ� ������ �޼ҵ�
		System.out.println("�߿�");
	}
}

class Dog extends Animal{
	void Cry() {		//��Ÿ�� ���� ���ο� �޼ҵ� ����
		System.out.println("�۸�");
	}
}


public class AbstractModifier_2 {

	public static void main(String[] args) {
		
		//1. ��ü ����
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		
		a1.cry();
		a2.cry();
	}

}
