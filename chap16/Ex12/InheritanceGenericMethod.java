package chap16.Ex12;

//���׸� �޼ҵ��� ���: �Ϲ� Ŭ���� ���� ���׸� �޼ҵ�

class Parent{		//�Ϲ� Ŭ����
	
	// Number: Boolean Character�� ������ Wrapper(�⺻ ������ Ÿ���� ��ü������ ��ȯ) Ÿ���� Ŭ������ �� �� �ִ�.
		//Byte, Short, Integer, Long, Float, Double
	
	<T extends Number> void print(T t) {		//���׸� �޼ҵ�
		System.out.println(t);
	}	//��ü ��ü ���
}

class Child extends Parent{		//���׸� �޼ҵ� ����� �Ϲ� ��Ӱ� ����.
	
} 



public class InheritanceGenericMethod {

	public static void main(String[] args) {
		
		//1. �θ� Ŭ������ ���׸� �޼ҵ� ���
		Parent p = new Parent();
		p.<Integer>print(100);
		p.<Double>print(100.2234);
		p.print(300);		//�����ص� �����ϱ��� ��� �ȶ߸� ����غ���
		p.print(300.333);
		
		
		//2. �ڽ� Ŭ�������� ���׸� �޼ҵ� ���
		Child c = new Child();
		c.<Integer>print(200);
		c.<Double>print(200.12345);
	}

}
