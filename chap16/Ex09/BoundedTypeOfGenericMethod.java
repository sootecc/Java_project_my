package chap16.Ex09;

//���׸� �޼ҵ��� ���� ����

class A{	//�Ϲ� Ŭ���� ���� ���׸� �޼ҵ�
	
	//Number: Boolean, Character�� ������ 6���� �⺻Ÿ�� (Byte, Short, Integer, Long, Float, Double)
	public <T extends Number> void method1(T t) {
		System.out.println(t.intValue());	//Number Ÿ���� �޼ҵ�. t.intValue(), ������ ���
	}
}

interface MyInterface{
	void print();	//public abstract ���� 
}

class B {		//���׸� Ÿ�� ���ο��� �������̽��� ������ ���� extends Ű�� ����Ѵ�.
	
	public <T extends MyInterface> void method2(T t) {		//T�� �� �� �ִ� Ÿ���� MyInterface�� ������ Ŭ������ �� �� �ִ�.
		t.print();
	}
}

class D{
	public <T extends String> void abc(T t) {
		System.out.println(t);		//String�� toString�޼ҵ尡 ������
		System.out.println(t.toString());
		
	}
}

class C implements MyInterface{		//�������̽��� ������ Ŭ����
	
	@Override
	public void print() {
		System.out.println("�������̽��� ������ Ŭ���� - ���");
	}
}


public class BoundedTypeOfGenericMethod {

	public static void main(String[] args) {

		A a = new A(); 	//�Ϲ�Ŭ���� ��ü ���� �� ���׸� �޼ҵ� ȣ��
		a.<Double>method1(5.8);		//�޼ҵ�ϱ�~ �䷸��
		a.method1(22.5);		//�Ű������� �� ���� Ÿ���� �ĺ��� �� ������ Ÿ�� ���� ����
		a.<Long>method1(1L);
		a.<Float>method1(100.324556f);
		//a.<Boolean>method1(true);		Character, Boolean �� ���� �߻�
		
		B b = new B();
		b.<MyInterface>method2(new MyInterface() {//Method2�� �Ű������� �� �� �ִ� ���� �������̽� Ÿ��, �������̽��� ������ �ڽ� Ŭ����
												  //�͸� ���� Ŭ������ �޼ҵ� ����������
			@Override
			public void print() {
				System.out.println("print() �޼ҵ� �͸� Ŭ������ ����");
			}
		});		
		
		b.<MyInterface>method2(new C());
		
		b.method2(new MyInterface() {
			@Override
			public void print() {

				System.out.println("�͸����� ó���� Ŭ���� ���");
			
			}
		});
		
		
		D d = new D();
		d.<String>abc("�ȳ�");
		d.abc("�ϼ���");
		
	}

}