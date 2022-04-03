package chap06_07.EX01;

//Ŭ����(class): ���赵, �ؾ�� Ʋ
//��ü(object): Ŭ������ �����Ͽ� RAM���� �۵��Ǵ� �����ڵ�(�ؾ)
	//��ü = �ν��Ͻ�
	//�ν��Ͻ�ȭ(��üȭ)��Ų��.	(���� �޼ҵ忡�� ��ü�� �ν��Ͻ�ȭ ��������Ѵ�.
	// A a = new A();		<==Ŭ������ ��üȭ���Ѽ� �޸𸮿� �ε�
	

class A {	//�ܺ� Ŭ����
	int m = 3;			//�ʵ�(����) : class block���� ����� ����
						//�ʵ�� �ν��Ͻ�ȭ(��ü) ���Ѿ� ����� ����
						//�ʵ�� �޸��� Heap ������ ����
	
	
	void print() {								//�޼ҵ�: ������������ �Լ�	
		System.out.println("��ü ���� �� Ȱ��");
	
	}
	
}

class B {	//�ܺ� Ŭ����
	String name = "ȫ�浿";
	int age = 24;
	String phone = "010-1111-1111";
	
	void printName() {
		System.out.println(name);
	}
	void printAge() {
		System.out.println(age);
	}
	void printPhone() {
		System.out.println(phone);
	}
}





public class CreateObjectAndUsingOfMember {	//public�̶�� Ű�� �� Ŭ������ �ϳ��� �־�� �ϰ� �� Ŭ������ �̸��� ���� �̸��̾���Ѵ�.

	public static void main(String[] args) {
		
		
		A a = new A();				//Class A�� ��üȭ(�ν��Ͻ�ȭ)��Ų��. (�޸𸮿� �ε�)
		System.out.println(a.m);
		a.print();
		
		System.out.println("==========================");
			
		A b = new A();				//Class A�� ��üȭ(�ν��Ͻ�ȭ)���Ѽ� RAM�� �ε�.
		System.out.println(b.m);
		b.print();
		
		System.out.println("==========================");
		
		A c = new A();
		System.out.println(c.m);
		c.print();
		
		System.out.println("==========================");
		
		
		
		
		B bb = new B();
		System.out.println(bb.age);
		System.out.println(bb.name);
		System.out.println(bb.phone);
		bb.printAge();
		bb.printName();
		bb.printPhone();
		
		B cc = new B();
		System.out.println(cc.age);
		System.out.println(cc.name);
		System.out.println(cc.phone);
		cc.printAge();
		cc.printName();
		cc.printPhone();
		
		
		
	}

}
