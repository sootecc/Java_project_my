package chap18.Ex02;

//���ٽ� ����

@FunctionalInterface
interface A {				
	void method1();
}

@FunctionalInterface
interface B{
	void method2(int a);
}

@FunctionalInterface
interface C{
	int method3();
}

@FunctionalInterface
interface D{
	double method4(int a, int b);
}

public class FunctionToLambdaExpression {

	public static void main(String[] args) {

		//�������̽��� �������� ���� �Լ��� ���� -> ���ٽ�
		
		//1. A �Է�x ����x
		A a1 = new A() {
			@Override
			public void method1() {
				System.out.printf("%s%s","�޼ҵ� 1",System.lineSeparator());
			}
		};
		//1-1. ���ٽ����� ó��
			//���ٽ��� ���� Ÿ��, �޼ҵ� �̸����� ���� ����
			//(��ǲ) -> {������};
		A a2 = () -> {System.out.printf("%s%s","�޼ҵ� 1-1",System.lineSeparator());};
		A a3 = () -> System.out.println("�޼ҵ� 1-2");	//�����ο� �� ���θ� ������ �� {}; �� ���� ����
		a1.method1();
		a2.method1();
		a3.method1();
		
		
		
		
		//2. B �Է�O ����x
		B b1 = new B () {
			@Override
			public void method2(int a) {
				System.out.printf("%s%s","�޼ҵ� 2",System.lineSeparator());
			}
		};
		B b2 = (int a) -> {System.out.printf("%s%s","�޼ҵ� 2-1",System.lineSeparator());};
		B b3 = (a) -> System.out.printf("%s%s","�޼ҵ� 2-2",System.lineSeparator());		//�Է� �Ű������� Ÿ�� ���� ����
		B b4 = a -> System.out.printf("%s%s","�޼ҵ� 2-3",System.lineSeparator());		//�Է� �Ű������� �ϳ��� �� () ���� ����
		b1.method2(0);
		b2.method2(0);
		b3.method2(0);
		b4.method2(0);
		
		
		
		
		
		
		//3. C �Է�x ����O
		C c1 = new C() {
			@Override
			public int method3() {
				System.out.printf("%s%s","�޼ҵ� 3",System.lineSeparator());
				return 0;
			}
		};
		C c2 = () -> {return 0;};		
		C c3 = () -> 0;				//������ �� �������� ����� ���: return�� ���� ����, �ݵ�� �߰�ȣ�� �Բ� ����		
		c1.method3();
		c2.method3();
		System.out.printf("%s%d%s","���� ���� ����: ",c3.method3(),System.lineSeparator());
		
		
		
		
		
		//4. D �Է�O ����O
		D d1 = new D() {
			@Override
			public double method4(int a, int b) {
				return a+b;
			}
		};
		D d2 = (int a, int b) -> {return a+b;};	//��ü ǥ��
		D d3 = (a, b) -> a+b;	//��ǲ Ÿ�� ���� ����, ������ ���� �ϳ��� (�ݵ�� �߰�ȣ�� �Բ�) ���� ����
		System.out.printf("%s%f%s","�� ���� ����: ",d1.method4(1, 2),System.lineSeparator());
		System.out.printf("%s%f%s","�� ���� ����: ",d2.method4(3, 4),System.lineSeparator());
		System.out.printf("%s%f%s","�� ���� ����: ",d3.method4(5, 4),System.lineSeparator());
	
	
	}

}
