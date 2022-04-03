package chap10.Ex01;

class Student_sub extends Student{
	//Student_sub�� Student�� ��� �ް� �ִ�. Student�� �ʵ�� �޼ҵ带 ��� �޴´�.
	//Student�� Person�� ��� �ް� �ִ�. Person�� �ʵ�� �޼ҵ带 ��� �޴´�.
	
	//Student_sub�� Person�� �ʵ�� �޼ҵ�, Student�� �ʵ�� �޼ҵ带 ���� ��� �޴´�.
	
	String sub1;
	
	void sub1() {
		System.out.println("Student_sub1Ŭ����. �θ��� �ʵ�� �޼ҵ带 ��� �޴´�.");
		System.out.println(this.sub1);
		
	}
}

class Student extends Person{	//���л� Ŭ����, �θ�Ŭ����: Person
		//�ڽ� Ŭ������ �θ� Ŭ������ ����� ��ӹ޴´�.
	int studentID;
	void goToSchool() {
	System.out.println("Student �ڽ� Ŭ������ �޼ҵ� goToSchool ȣ��");
	System.out.println(this.name);
	System.out.println(this.age);
	System.out.println(this.studentID);
	}
}

class Worker extends Person{	//������ Ŭ����, �θ�Ŭ����: Person
	
	int workerID;
	void goToWork() {
	System.out.println("Worker �ڽ� Ŭ������ �޼ҵ� goToWork ȣ��");
	System.out.println(this.name);
	System.out.println(this.age);
	System.out.println(this.workerID);
	}
}

public class Person {	//���: �θ� Ŭ������ ���(�ʵ�, �޼ҵ�, ���� Ŭ����)�� �ڽ� Ŭ�������� ���
						//����� ����: 
						// 1. �ߺ��� �ڵ� ����(�ڵ��� ����)
						// 2. �ڵ尡 ��������
						// 3. ������ ����(�޼ҵ� �������̵��� ����)  -> �ϳ��� �޼ҵ� �̸��� ���� ���� �������� ���
	String name;
	int age;
	
	void eat() {
		System.out.println("�θ� Ŭ������ eat() �޼ҵ�");
	}
	void sleep() {
		System.out.println("�θ� Ŭ������ sleep() �޼ҵ�");
	}

	
	public static void main(String[] args) {
			
		// 1. Person ��ü ����
		Person p = new Person();
			p.name = "ȫ�浿";
			p.age = 11;
			p.eat();
			p.sleep();
			System.out.println("====================================");
			
		
		
		
		
		// 2. Student ��ü ����
		Student s = new Student();		//Person Ŭ������ ���, Person Ŭ������ �ʵ�� �޼ҵ带 ���
										//�ڽ� Ŭ������ �θ� Ŭ�������� ����� �ʵ�� �޼ҵ� ��� ����
			//Person Ŭ������ �ʵ�
			s.name = "�̼���";
			s.age = 50;
			
			//Student Ŭ������ �ʵ�
			s.studentID = 20200310;
			
			//Person Ŭ������ �޼ҵ�
			s.eat();
			s.sleep();
			
			//Student Ŭ������ �޼ҵ�
			s.goToSchool();
		
		System.out.println("====================================");
		
		
		
		
		
		// 3. Worker ��ü ����
		Worker w = new Worker();
			
			//Person Ŭ������ �ʵ�
			w.name = "�������";
			w.age = 60;
			
			//Worker Ŭ������ �ʵ�
			w.workerID = 20220310;
			
			//Person Ŭ������ �޼ҵ�
			w.eat();
			w.sleep();
			
			//Worker Ŭ������ �޼ҵ�
			w.goToWork();
			
		System.out.println("====================================");
		
		
		
		
		
		
		
		Student_sub sub1 = new Student_sub();
		//Ŭ���� Ÿ�� 	��ü��		
		
			//Person Ŭ������ �ʵ�� �޼ҵ�
			sub1.name = "��������";
			sub1.age = 70;
			sub1.eat();
			sub1.sleep();
			//Student Ŭ������ �ʵ�� �޼ҵ�
			sub1.studentID = 20210310;
			sub1.goToSchool();
			//Student_sub�� �ʵ�� �޼ҵ�
			sub1.sub1 = "�ڽ��� �ڽ� Ŭ����";
			sub1.sub1();
			
	
			
			
		//��ĳ����===================================================================	
		//��ü ������ Ÿ�� ��ȯ
		Person p1 = new Person();		//����, Person�� Person�̴�. (�ڽ��� �θ��.)
		Person p2 = new Student();		//��ĳ����, Student�� Person�̴�.
		//Student sp = new Person();	//Person�� Student��.(X)
		Person pw = new Worker();		//��ĳ���� Worker�� Person�̴�.
		//Worker wp = new Person();		//Person�� Worker��.(X)
		//�ڽ��� �θ� ����, �Ҿƹ��� �ҸӴϵ� ����
				
		Person ps1 = new Student_sub();		//��ĳ����: Student_sub ��ü�� ������ �θ� ������ Ÿ������ ����ȯ
			//Student_sub�� Person Ÿ������ ��ĳ����, PersonŬ������ ����� ��� ���� => Person�� �� ������?
			
		
			ps1.name = "BTS";	//Person Ŭ������ �ʵ�� �޼ҵ常 ���� ����, Person�� �ֻ��� �θ�ϱ�~
			ps1.age = 30;
			ps1.eat();
			ps1.sleep();
			
			
		Student ss1 = new Student_sub();	//��ĳ����: Student_sub�� StudentŸ������ ��ĳ����
			//Person�� student�� �ʵ�� �޼ҵ带 ��� ����, �ֻ��� �θ���� ~ Student����
			//Person Ŭ������ �ʵ�� �޼ҵ�
			ss1.name = "SES";
			ss1.age = 30;
			ss1.eat();
			ss1.sleep();
			//Student�� �ʵ�� �޼ҵ�
			ss1.studentID = 20220310;
			ss1.goToSchool();
			
		
			
		Student_sub ss2 = new Student_sub();	//Person, Student, Student_sub�� �ʵ�� �޼ҵ� ��� ���.
			//Person Ŭ������ �ʵ�� �޼ҵ�
			ss2.name = "�����������ܿ�";
			ss2.age = 40;
			ss2.eat();
			ss2.sleep();
			//Student�� �ʵ�� �޼ҵ�
			ss2.studentID = 20220310;
			ss2.goToSchool();
			//Student_sub�� �ʵ�� �޼ҵ�
			ss2.sub1 = "student_sub";
			ss2.sub1();
		
			
			
		//��� ���迡�� ��ü ������ �θ� ������ Ÿ������ ��ĳ���� ����
			//�θ� ������ Ÿ������ ��ĳ���� �� ��� �θ�� �� ���� �θ���� �ʵ�� �޼ҵ常 ��� ����
			
			//Person <= Student <= Student_sub
			
			Person ps4 = new Student_sub();
			//Student_sub ��ü�� ������ PersonŸ������ ��ĳ����
			//Student_sub�� Person, Student, Student_sub�� ��� �ʵ�� �޼ҵ带 �����ϰ� �ִµ�
			//�� �� Person Ŭ������ �ʵ�� �޼ҵ常 ���� �����ϰ� �ȴ�.
			
			Student ss4 = new Student_sub();
			//Student_sub ��ü�� ������ StudentŸ������ ��ĳ����
			//Student_sub�� Person, Student, Student_sub�� ��� �ʵ�� �޼ҵ带 �����ϰ� �ִµ�
			//�� �� Person, Student Ŭ������ �ʵ�� �޼ҵ常 ���� �����ϰ� �ȴ�.
			
			Student_sub ss5 = new Student_sub();
			//Student_sub ��ü�� ������ Student_subŸ������ ����
			//Student_sub�� Person, Student, Student_sub�� ��� �ʵ�� �޼ҵ带 �����ϰ� �ִµ�
			//�� �� Person, Student, Student_sub Ŭ������ �ʵ�� �޼ҵ忡 ���� �����ϰ� �ȴ�.
			
			
			
		
			
			
		//�ٿ� ĳ����: �θ� ������ Ÿ������ ��ĳ���� �� ���� �ڽ� ������ Ÿ������ ��ȯ(�������� ��ȯ)
			
		Student ps5 = (Student) ps4;		//ps4�� ���� ������ ������ Ÿ���� Person
					//ps5�� Person, Student �� �ʵ�� �޼ҵ� ���� ����
			ps5.name = "�ٿ� ĳ����";
			ps5.age = 30;
			ps5.studentID = 20220310;	//Student �ʵ�� �޼ҵ� ��� ����
			ps5.goToSchool();			//Student�� �޼ҵ� ���
			
		
			
		Student_sub ps6 = (Student_sub)ps4;	//ps4�� Person ������ Ÿ�Կ��� Student_sub�� �ٿ�ĳ����
					//Student_sub�� �ٿ� ĳ���õ�(Person, Student, Student_sub�� �ʵ�� �޼ҵ� ���� ����)
			ps6.name = "�̿��";
			ps6.age = 30;
			ps6.studentID = 20220310;	//Student
			ps6.sub1 = "student_sub(�ڽ��� �ڽ�)";
			
	
			
		
			
	}

}