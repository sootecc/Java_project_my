package chap16.Ex02;

//5���� ��ü�� Object Ÿ���� Ŭ������ ����

class Student{
	String name;
	String id;
	int pass;
	Student(String name,String id,int pass){
		this.id = id;
		this.name = name;
		this.pass = pass;
				
	}
	@Override
	public String toString() {
		return "�̸�: "+name+" ���̵�: "+id+" �н�: "+pass ;
	}
}

class Professor{
	String name;
	int year;
	String email;
	Professor(String name,int year,String email){
		this.name = name;
		this.year = year;
		this.email = email;
	}
	@Override
	public String toString() {
		return "�̸�: "+name+" ����: "+year+" �̸���: "+email ;
	}
}

class Tiger{
	String name;
	String run;
	Tiger(String name,  String run){
		this.name = name;
		this.run = run;
	}
	@Override
	public String toString() {
		return "�̸�: "+name+" �޸���: "+run ;
	}
}

class Banana{
	String name;
	Banana(String name){
		this.name = name;
	}
	@Override
	public String toString() {
		return "�̸�: "+ name ;
	}
}



class Save<T>{
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}

	
}



public class Ex_UsingObject {

	public static void main(String[] args) {

		Save<Student> s1 = new Save<Student>();
		Save<Professor> s2 = new Save<Professor>();
		Save<Tiger> s3 = new Save();
		Save<Banana> s4 = new Save();
		
		s1.set(new Student("������","ȭ��",1234));
		s2.set(new Professor("�̼���",3,"soonshin@naver.com"));
		s3.set(new Tiger("ȣ����","ȣ���̴� �� �޸��ϴ�."));
		s4.set(new Banana("��ü�ٳ���"));
		
		
		System.out.println(s1.get());
		System.out.println(s2.get());
		System.out.println(s3.get());
		System.out.println(s4.get());
	}

}
