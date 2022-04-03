package chap10.Ex04;

class Human{		//�θ�Ŭ����
	String name;	//�ν��Ͻ� �ʵ�: ��üȭ���Ѿ� ��� ����, Heap�� ����
	int age;	
	
	void eat() {	//�ν��Ͻ� �޼ҵ�: ��üȭ���Ѿ� ��� ����, Heap(������), Ŭ���� ���� �ȿ� �ִ� �ν��Ͻ� �޼ҵ� ������ ���� �ڵ� ���� 
		System.out.println(this.name+"��(��) �Խ��ϴ�.");
	}
	void sleep() {
		System.out.println(this.name+"��(��) ���� ��ϴ�.");
	}
}

class Student extends Human{
	int studentID;
	void goToSchool() {
		System.out.println(this.name+ "��(��) �б��� ���ϴ�.");
	}
}

class Worker extends Human{
	int workerID;
	void goToCompany() {
		System.out.println(this.name+"��(��) ���忡 ���ϴ�.");
	}
}

public class Test01 {

	public static void main(String[] args) {
		
		Human h = new Human();	
		h.name = "ȫ�浿";
		h.age = 30;
		h.eat();
		h.sleep();
		
		Student s = new Student();		
		s.name = "�Ż��Ӵ�";
		s.age = 23;
		s.eat();
		s.studentID = 1111;
		s.goToSchool();
		
		Worker w = new Worker();
		w.name = "BTS";
		w.eat();
		w.sleep();
		w.workerID = 2222;
		w.goToCompany();
		
		Human h1 = new Student();		//��ĳ����
										//h: Human, Student Ÿ���� ��� ����, Human�� ���� ����
		h1.name = "�̼���";
		h1.eat();
		
		//�ٿ�ĳ����
		//if ������ ����Ͽ� instanceof ó��
		//��Ÿ�� ������ �����ϱ� ����
		
		System.out.println(h1 instanceof Student);
		System.out.println(h1 instanceof Human);
		if(h1 instanceof Student) {
			Student s1 = (Student) h1;
			s1.studentID = 3333;
			s1.goToSchool();
		}
		
		if(h1 instanceof Worker) {
			Worker w4 = (Worker) h1;	//������ ������ �߻����� ������ ��Ÿ�� ������ �߻��Ѵ�.
		}									
		else {
			System.out.println("h1�� Worker�� �����ϰ� ���� �ʴ�.");
		}
		
		
	}

}
