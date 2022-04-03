package chap12.Ex01;

abstract class Abc{
	abstract void cry();
	abstract void fly();
}

class Cat extends Abc{
	
	@Override
	void cry() {
		System.out.println("����̴� �߿��ϰ� ��ϴ�.");
	}
	
	@Override
	void fly() {
		System.out.println("����̴� �� �� �����ϴ�.");
	}
}

class Eagle extends Abc{
	
	@Override
	void cry() {
		System.out.println("�������� ���� �ϰ� ��ϴ�.");
	}
	
	@Override
	void fly() {
		System.out.println("�������� �� �� �ֽ��ϴ�.");
	}
}

public class Ex_AbstractClass {

	public static void main(String[] args) {
		
		//1. �ڽ� Ŭ���� Cat, Eagle Ŭ������ ���� �� ��� 
		
		Abc cat = new Cat();
		Abc eagle = new Eagle();
		
		cat.cry();
		cat.fly();
		eagle.cry();
		eagle.fly();
		
		
		//2. �͸� Ŭ���� ���� �� ���
		Abc tiger = new Abc() {
			void cry() {System.out.println("ȣ���̴� ���� �ϰ� ��ϴ�.");}
			void fly() {System.out.println("ȣ���̴� �� �� �����ϴ�.");}
		};
		tiger.cry();
		tiger.fly();
	}

}
