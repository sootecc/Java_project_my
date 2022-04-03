package chap12.Ex01;

abstract class D{		//Ŭ���� ���ο� �߻� �޼ҵ尡 �� ��� abstractŬ������ �Ǿ�� �Ѵ�.
	
	abstract void print(); 		//�����ΰ� ���� ���� �� �޼ҵ�, �߻� �޼ҵ�
}

class E extends D{

	@Override
	void print() {
		System.out.println("E Ŭ������ print()");
	}		//�ڽ� Ŭ������ �߻�Ŭ������ �޼ҵ带 ������.
	
	
}

public class AbstractClass_3 {

	public static void main(String[] args) {

		//1. ��üȭ�ؼ� ���. (��ü 3�� ���� �� print() �޼��� ���)
		D a1 = new E();
		D a2 = new E();
		D a3 = new E();
		
		a1.print();
		a2.print();
		a3.print();
		
		//2. �͸� Ŭ������ �����ؼ� ���(print() �޼��� 3�� ���)
	
		D a4  = new D() {
			@Override
			void print() {
				System.out.println("�͸� Ŭ������ print()");
			}
		};
		D a5  = new D() {
			@Override
			void print() {
				System.out.println("�͸� Ŭ������ print()");
			}
		};
		D a6  = new D() {
			@Override
			void print() {
				System.out.println("�͸� Ŭ������ print()");
			}
		};
		
		
		a4.print();
		a5.print();
		a6.print();
	}

}
