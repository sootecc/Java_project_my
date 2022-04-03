package chap11.Ex06;

abstract class Animal{		//�߻� Ŭ����: �߻� �޼ҵ尡 �� �� �̻� ���ԵǾ� �ִ� ���
							//�߻� Ŭ������ ��ü ���� �Ұ���, Ÿ�� ����� ����
	String name;			//�ڽ�Ŭ������ �θ�Ŭ������ �޼ҵ带 ������ ���� ����(��Ÿ..) 
	int age;
	
	abstract void cry();		//�߻�޼ҵ�: �����ΰ� ���� �޼ҵ�
		//void cry(){}			<==�Ϲ� �޼ҵ�: ����Ÿ�� �޼ҵ��̸� (�Է� �Ű�����){������} 
	abstract void run();
		
	@Override
		public String toString() {		//��ü ��ü�� ��½� �޸��� ������ ���
			return "�̸�: "+name+", "+"����: "+age;
		}
}

class Cat extends Animal{		//Animal�� �Ϻθ� ����� ��� �߻� Ŭ����,
								// ��� �߻� �޼ҵ带 ������ ���� ��ũ��Ʈ Ŭ����
	
	
	Cat(){}
	Cat(String name, int age){
		super.name = name;
		this.age = age;
	}
	@Override
	void cry() {
		System.out.println("�߿�");
	}
	@Override
	void run() {
		System.out.println("����̴� ��ӻ�� �ݴϴ�.");
	}
	
}

class Tiger extends Animal{
	Tiger(){}
	Tiger(String name, int age){
		super.name = name;
		this.age = age;
	}
	@Override
	void cry() {		//�߻� �޼ҵ带 ������ �޼ҵ�
		System.out.println("����");
	}
	@Override
	void run() {		//�߻� �޼ҵ带 ������ �޼ҵ�
		System.out.println("ȣ���̴� ���� ��Ĩ�ϴ�.");
	}
	
}

class Eagle extends Animal{
	
	Eagle(){}
	Eagle(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	void cry() {
		System.out.println("??");
	}
	@Override
	void run() {
		System.out.println("�������� ���� �ʽ��ϴ�.");
	}
	
}

public class AbstractModifier_3 {

	public static void main(String[] args) {
		Animal a1 = new Cat("�����",10);
		Animal a2 = new Tiger("ȣ����",5);
		Animal a3 = new Eagle("������",15);
	
		
		//1. Animal �迭 ��ü�� ���� ��
		Animal[] array = {a1,a2,a3};
		
		//2. For���� ����ؼ� ��ü�� ��½� �̸��� ���̸� ���, cry, run �޼ҵ� ���
		System.out.println(" For��");
		for(int i =0 ;i<array.length;i++) {
			System.out.println(array[i]);					//��ü ���, Animal�� toString()
			array[i].cry();									//��ü�� �������̵��� �޼ҵ� ���
			array[i].run();									//Animal�� cry(), run() ===> �������̵�(�ڽ��� cry(), run())
			System.out.println("======================");
		}
		//3. enhanced for�� 
		System.out.println(" enhanced for�� ");
		for(Animal k : array) {
			System.out.println(k);
			k.cry();
			k.run();
			System.out.println("======================");
		}
		
	}

}
