package chap10.Ex01;

class Dog_sub extends Dog{
	int dog_sub;
	void dog_sub() {
		System.out.println("Dog�� �ڽ� Ŭ�����Դϴ�.");
	}
}

class Tiger extends Animal{
	int leg;
	
	void tigerEat() {
		System.out.println("ȣ���̴� �ٸ� ������ ��ƸԽ��ϴ�.");
	}
}

class Dog extends Animal{
	int dog;
	
	void dogEat() {
		System.out.println("���� ��ᳪ �Ծ�");
	}
}

class Eagle extends Animal{
	int wing;
	
	void eagleFly() {
		System.out.println("�������� ���ƴٴմϴ�.");
	}
}



public class Animal {
	String name;			//������ �̸�
	int age;				//������ ����
	String color;			//������ ��
	
	void eat() {
		System.out.println("��� ������ ������ �Խ��ϴ�. ");
	}
	void sleep() {
		System.out.println("��� ������ ���� ��ϴ�. ");
	}
	
	
	
	public static void main(String[] args) {
		
		//��ĳ������ ���������� ó���ϱ� ������ ȿ�������� �ڵ带 ó���� �� �ִ�.
			//������: �������̵�(���)�� �̿��Ͽ� ��ӿ��� �ϳ��� �޼ҵ�� ���� ������ ó���� �� �ִ�.
		
		// 1. Animal Ŭ���� ��üȭ
		Animal a1 = new Animal();			//�ڽ��� �ʵ�� �޼ҵ常 ����
		
		// 2. Dog Ŭ������ Dog Ÿ������ ��üȭ
		Dog d1 = new Dog();					//Animal, Dog�� �ʵ�� �޼ҵ� ����
		
		// 3. Dog�� Animal Ÿ������ ��ĳ����
		Animal a2 = new Dog();				//a2�� Animal, Dog�� �����ϰ� �ְ� Animal���� ���� ����
		
		// 4. Dog_sub�� Animal Ÿ������ ��ĳ����
		Animal a3 = new Dog_sub();			//a3�� Animal, Dog, Dog_sub�� �����ϰ� �ְ� Animal���� ���� ����
		
			a3.name = "��ũ���׸���";	//Animal�� �ʵ�
		//	a3.dog = 6;				//Dog ���� �Ұ�		
		//	a3.dog_sub = 3;			//Dog_sub ���� �Ұ�
		
		
		// 5. Dog_sub�� Dog Ÿ������ ��ĳ����
		Dog d2 = new Dog_sub();				//d2�� Animal, Dog, Dog_sub�� �����ϰ� �ְ� Animal, Dog�� ���� ����
			
			d2.name = "���۵�";		//Animal�� �ʵ�
			d2.dog = 5;				//Dog
		//	d2.dog_sub = 3;			//Dog_sub ���� �Ұ�
		
		
		//Animal <- Dog <- Dog_sub
		// 6. Dog_sub�� Dog_sub Ÿ������ ��üȭ
		Dog_sub ds1 = new Dog_sub();			//ds1�� Animal, Dog, Dog_sub�� �����ϰ� �ְ� ���� ���� ����
				
			ds1.name = "������";		//Animal Ŭ������ �ʵ�
			ds1.age = 4;			//Animal
			ds1.dog = 3;			//Dog
			ds1.dog_sub = 2;		//Dog_sub
		
	
		/*
		 * 	**��ĳ����**: �ڽ� Ÿ���� ������ Ÿ�Կ��� �θ� ������ Ÿ������ ��ȯ�ϴ� �� (�ڵ� ��ȯ)

			�� �θ� Ÿ���� �ʵ�� �޼ҵ常 ���� ����
			
			�ڽ� �� �θ�
			*/
			Dog ds1_c1 = ds1;	//��ĳ����: Dog_sub -> Dog Ÿ������ ��ĳ����
			Animal ds1_c2 = ds1;//��ĳ����: Dog_sub -> Animal Ÿ������ ��ĳ����
			
			//ds1: Dog_sub ������ Ÿ��
			//ds1_c1: Dog
			//ds1_c2: Animal
			
			
		/*	
			**�ٿ�ĳ����**: �θ� ������ Ÿ������ ��ĳ���� �� ���� �ڽ� ������ Ÿ������ ��ȯ�ϴ� �� (����(����) ��ȯ)
			
			�θ� �� �ڽ�
			
			��ĳ���� �� ���� �ƴ� �������� �ֻ��� �θ𿴴� ���� ���� ��� �Ǵ°���?
			Dog_sub a1_c3 = (Dog_sub)a1;
			a1_c3.dog_sub();
			�غô��� ������ ����
		 */
			Dog_sub a3_down1 = (Dog_sub)a3;
			Dog a3_down2 = (Dog)a3;
			
	}

}
