package chap10.Ex05;

class A{
	
	
	A(){}			//�⺻ ������: Ŭ���� ���� �ٸ� �����ڰ� �������� ���� ��� ���� ����
	
	//�ν��Ͻ� �޼ҵ�: ��Ӱ��迡�� �޼ҵ� �������̵��� �ν��Ͻ� �޼ҵ常 �����ϴ�.
	//��Ӱ��迡�� �ν��Ͻ� �ʵ�, static�ʵ�, static �޼ҵ�� �������̵� ���� �ʴ´�.
	//�������̵� �Ҷ��� �ñ״�ó�� ���ƾ� ��(���� Ÿ��, �޼ҵ��, �Ű����� Ÿ��, �Ű����� ����)
	
	
	void print() {
		System.out.println("Class A ���");
	}
}

class B extends A{
	@Override
	void print() {
		System.out.println("Class B ���");
	}
}

class C extends A{
	@Override
	void print() {
	System.out.println("Class C ���");
	}
}

public class MethodOverriding {
	
	public static void main(String[] args) {
		
		//1. AŸ��, A������
		A a = new A();
		a.print();
		//2. BŸ��, B������
		B b = new B();
		b.print();
		//3. CŸ��, C������
		C c = new C();
		c.print();
		
		System.out.println("========================================");
		//4. AŸ��, B������(�������̵� �Ǿ� A�� print() ȣ��� B�� print()�� ��� 
		A ab = new B();
		ab.print();			//A�� print() �޼ҵ� ȣ�� -> B�� print() ���
		A ac = new C();
		ac.print();			//A�� print() �޼ҵ� ȣ�� -> C�� print() ���
		
		
		System.out.println("========================================");
		A[] array = {ab,ac};		//�迭�� AŸ���� ��ü�� ����
		
		
		for(int i=0; i<array.length;i++) {
			array[i].print();
		}
		
		System.out.println("========================================");
		for(A k : array) {
			k.print();
		}
		
		System.out.println("========================================");
		
	}

}
