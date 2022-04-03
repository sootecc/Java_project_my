package chap06_07.EX02;

class B{
	
	static String name="BTS";	// static Ű�� �Ҵ�Ǹ� ��ü �������� ȣ��
	
	static void print() {
		System.out.println(name);
		System.out.println("static�� ���� �޼ҵ��Դϴ�.");
	}
}


public class MethodOverloading {

	public static void main(String[] args) {
		//�޼ҵ� �����ε�: �ϳ��� �޼ҵ���� �Ű������� ���� ȣ���ϴ� �� (Java)
		//�޼ҵ� �������̵�: ��ӿ��� �θ� Ŭ������ �޼ҵ带 �������Ͽ� ����ϴ� �� 
		
		//static: ��ü ���� ���� �ٷ� ȣ���ؼ� ��밡���ϵ��� ���ִ� Ű����
			//��ü �̸��� �ƴ϶� Ŭ���� �̸����� ȣ���ؼ� ��밡��

		
		// B b = new B(); �̰� ���ߴٴ� ��
		System.out.println(B.name);		//��ü �̸��� �ƴ� Ŭ���� �̸����� ȣ���� ����
		B.print();						//Ŭ���� �̸����� ȣ��
		
		
		System.out.println("====================");
		print1();
		print1(2);
		print1(3.4);
		print1(2,4);
	}

	// �޼ҵ� �������̵�: �޼ҵ� �̸��� ����, �Ű����� Ÿ��, �Ű����� ������ ���� �ش� �޼ҵ� ȣ���� �����ȴ�.
	//JVM�� ������ �޼ҵ� �̸��� ������ Ÿ���̳� ������ ���� �ش� �޼ҵ带 �۵�
	
	//����: ������ �Ű�����Ÿ�԰� �����̸� ������ �߻���
	
	public static void print1() {		//�޼ҵ� �̸� �տ� static
		System.out.println("�����Ͱ� �����ϴ�. ");
	}
	
	public static void print1(int a) {
		System.out.println("����: "+a);
	}
	public static void print1(double a) {
		System.out.println("double: "+a);
	}
	public static void print1(int a, int b) {
		System.out.println("a: "+ a +" b: " +b);
	}
}

