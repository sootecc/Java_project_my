package chap10.Ex04;

class Animal3 {			//�θ� Ŭ����, ��� Ŭ������ Object Ŭ������ ����Ѵ�. �⺻������ �����Ǿ� ����
	String name;
	int age;
	
	void cry() {
		System.out.println(this.name+"��(��) ��ϴ�.");
	}

	@Override						//Object Ŭ���� ���� toString �޼ҵ�
	public String toString() {		//��ü�� �ּҸ� ����Ѵ�. [��Ű����.Ŭ������@��ü �޸��� �ؽ��ڵ�]
		return "�̸���: "+name+" , ���̴�: "+age+"�Դϴ�."+super.toString();
	}

	

	
	
}

class Tiger3 extends Animal3{

	Tiger3(){}					//�ٸ� �����ڰ� ��ü ���� ������ ��� �⺻ ������ ȣ���� �� �����Ǿ� ������ �ȵȴ�.
	
	Tiger3(String a, int b){	//������: ��ü ������ �޸��� �ʱⰪ�� �Ҵ��� �� ���
		super.name = a;			//�θ�(super) Ŭ����
		super.age = b;
	}
	
	@Override
	void cry() {
		//super.cry();		//super Ű����� �θ�Ŭ����, super: ��� ������ �� �ڽ� Ŭ�������� �θ� Ŭ���� ȣ���� ��
							//this Ű����� �ڱ� �ڽ��� ��ü	
		System.out.println("ȣ���̴� ���� �ϰ� ��ϴ�.");
	}						
}

class Cat3 extends Animal3{
	
	Cat3(){}
	
	Cat3(String a, int b){
		super.name = a;
		super.age = b;
	}
	
	@Override
	void cry() {
		//super.cry();
		System.out.println("����̴� �߿�");
	}
	
}
class Dog3 extends Animal3{

	Dog3(){}
	
	Dog3(String a, int b){
		super.name = a;
		super.age = b;
	}
	
	@Override
	void cry() {
		System.out.println("���� �۸�");
	}
	
}



public class Test02 {

	public static void main(String[] args) {
		
		Animal3 a3 = new Animal3();		//a3 ��ü ����
		System.out.println(a3);			//��ü ��ü�� ����� ���, Object Ŭ������ toString �޼ҵ尡 ȣ��ȴ�.
										//Object.toString(): ��ü �޸� �ּ��� �ؽ��ڵ带 ������ش�.
										//chap10.Ex04.Animal3@32d2fa64 | [��Ű����.Ŭ������@��ü �޸��� �ؽ��ڵ�]
		System.out.println(a3.toString());
		System.out.println("========================================");
		//��ü ��ü�� ����ϸ� ��ü�� Object Ŭ������ toString �޼ҵ带 ȣ���Ѵ�.
		
		Animal3 t3 = new Tiger3();
		Animal3 c3 = new Cat3();
		Animal3 d3 = new Dog3();
		
		t3.cry();		//�θ��� cry()�� ȣ���� ��� �������̵��� Tiger3�� cry() ȣ��
		c3.cry();		//�θ��� cry()�� ȣ���� ��� �������̵��� Cat3�� cry() ȣ��
		d3.cry();
		System.out.println("========================================");
		
		Animal3[] animal3 = {t3,c3,d3};
		for(int i = 0; i<animal3.length;i++) {
			animal3[i].cry();
		}
		System.out.println("========================================");
		
		for(Animal3 k : animal3) {
			k.cry();
		}
		System.out.println("========================================");
		
		Animal3 tt3 = new Tiger3("ȣ����",5);
		Animal3 cc3 = new Cat3("�����",3);
		Animal3 dd3 = new Dog3("��",2);
		
		System.out.println(tt3);	// toString
		System.out.println(cc3);
		System.out.println(dd3);
		
		Animal3[] animal33 = {tt3, cc3, dd3};
		for(int i = 0;i<animal33.length;i++) {
			System.out.println(animal33[i]);
		}
		
		for(Animal3 k : animal33) {
			System.out.println(k);
		}
		System.out.println("========================================");
		
	}

}
