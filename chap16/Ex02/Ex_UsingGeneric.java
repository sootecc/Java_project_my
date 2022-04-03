package chap16.Ex02;

//5개의 객체를 Object 타입의 클래스에 저장

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
		return "이름: "+name+" 아이디: "+id+" 패스: "+pass ;
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
		return "이름: "+name+" 년차: "+year+" 이메일: "+email ;
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
		return "이름: "+name+" 달리기: "+run ;
	}
}

class Banana1{
	String name;
	Banana1(String name){
		this.name = name;
	}
	@Override
	public String toString() {
		return "이름: "+ name ;
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
		
		s1.set(new Student1("김유신","화랑",1234));
		s2.set(new Professor1("이순신",3,"soonshin@naver.com"));
		s3.set(new Tiger1("호돌이","호랑이는 잘 달립니다."));
		s4.set(new Banana1("돌체바나나"));
		
		
		System.out.println(s1.get());
		System.out.println(s2.get());
		System.out.println(s3.get());
		System.out.println(s4.get());
	}

}
