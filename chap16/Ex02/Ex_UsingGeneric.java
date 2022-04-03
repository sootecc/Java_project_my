package chap16.Ex02;

//5���� ��ü�� Object Ÿ���� Ŭ������ ����

class Student1{
	String name;
	String id;
	int pass;
	Student1(String name,String id,int pass){
		this.id = id;
		this.name = name;
		this.pass = pass;
				
	}
	@Override
	public String toString() {
		return "�̸�: "+name+" ���̵�: "+id+" �н�: "+pass ;
	}
}

class Professor1{
	String name;
	int year;
	String email;
	Professor1(String name,int year,String email){
		this.name = name;
		this.year = year;
		this.email = email;
	}
	@Override
	public String toString() {
		return "�̸�: "+name+" ����: "+year+" �̸���: "+email ;
	}
}

class Tiger1{
	String name;
	String run;
	Tiger1(String name,  String run){
		this.name = name;
		this.run = run;
	}
	@Override
	public String toString() {
		return "�̸�: "+name+" �޸���: "+run ;
	}
}

class Banana1{
	String name;
	Banana1(String name){
		this.name = name;
	}
	@Override
	public String toString() {
		return "�̸�: "+ name ;
	}
}



class Save1<T>{
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}

	
}



public class Ex_UsingGeneric {

	public static void main(String[] args) {

		Save1<Student1> s1 = new Save1<Student1>();
		Save1<Professor1> s2 = new Save1<Professor1>();
		Save1<Tiger1> s3 = new Save1();
		Save1<Banana1> s4 = new Save1();
		
		s1.set(new Student1("������","ȭ��",1234));
		s2.set(new Professor1("�̼���",3,"soonshin@naver.com"));
		s3.set(new Tiger1("ȣ����","ȣ���̴� �� �޸��ϴ�."));
		s4.set(new Banana1("��ü�ٳ���"));
		
		
		System.out.println(s1.get());
		System.out.println(s2.get());
		System.out.println(s3.get());
		System.out.println(s4.get());
	}

}
