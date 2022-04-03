package chap16.Ex03;

//Object: ��� ��ü�� ������ �� ������... �ٿ� ĳ������ �ʿ��ϰ� ĳ���ý� ���ܰ� �߻��� �� �ִ�.(���� Ÿ�� üũ)

//���׸� Ŭ����: �ϳ��� Ŭ�������� �پ��� ������ Ÿ���� ó���� �� �ִ�.
	//���׸� Ÿ�� ����: T(Ÿ��), K(Key), V(Value), N(Number), E(Element, ����)
		// A ~ Z ���� ���Ƿ� ���� �� �ִ�.
		//wrapper Ŭ����: �⺻ Ÿ���� ��üȭ ���� ���� Ŭ����
			//int(�⺻Ÿ��) ==> Integer (��ü), boolean ==> Boolean, char ==> Character
			//double ==> Double, float ==> Float
			//short ==> Short, byte ==> Byte, long ==> Long


//=> ���׸� Ŭ���� ���

class MyClass<T>{
	private T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {	//setter �ʵ� �� �Ҵ�
		this.t = t;
	}
	
	
}

public class SingleGenericArgument {

	public static void main(String[] args) {
		
		//1. ���׸� Ŭ���� ��ü ���� <String>�� �Է�
		MyClass<String> mc1 = new MyClass<String>();
		mc1.set("�ȳ�");
		System.out.println(mc1.get());
	
		//2. ���׸� Ŭ���� ��ü ���� <Integer>�� �Է�
		MyClass<Integer> mc2 = new MyClass<Integer>();		//wrapper Ŭ������ �Ҵ��ؾ� �Ѵ�.
		mc2.set(100);
		System.out.println(mc2.get());
		
		//3. ���׸� Ŭ���� ��ü ���� <Double>�� �Է�
		MyClass<Double> mc3 = new MyClass();		//�������� �ڷ����� ���� �����ϴ�.	
		mc3.set(333.33);
		System.out.println(mc3.get());
		
		//4. ���� Ÿ�� üũ(������ �ܰ迡�� ������ ������ش�.)
		MyClass<Boolean> mc4 = new MyClass<Boolean>();
		mc4.set(true);
		//mc4.set("��");		//���� Ÿ�� üũ, ����� ������ ����������
		
	}

}
