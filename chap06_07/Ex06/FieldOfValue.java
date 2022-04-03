package chap06_07.Ex06;

//객체의 필드에 값을 할당하는 방식: 3가지
	//1. 필드에 직접 값을 부여하는 방식						<객체를 생성 후>
	//2. setter를 통해서 객체의 필드에 값을 부여(컨트롤 가능)	<객체를 생성 후>
	//3. 생성자를 통해서 객체의 필드값을 부여(컨트롤 가능)		<객체를 생성 할 때 초기값으로 필드에 값을 할당>

class Aa{	//1. 객체 생성 후 직접 필드에 값 할당
	
	String name;	//이름
	int age;		//나이
	String mail;	//메일주소

	void print() {
		System.out.println("name: "+name+"\nage : "+age+"\nmail: "+mail);
	}

}

class Bb{	//2. setter를 통해서 필드에 값 할당
	
	String name;
	int age;
	String mail;
	
	void setName(String name) {
		this.name = name;
	}
	void setAge(int age) {
		this.age = age;
	}
	void setMail(String mail) {
		this.mail = mail;
	}
	void print() {
		System.out.println("name: "+name+"\nage : "+age+"\nmail: "+mail);
	}
	
}

class Cc{	//3. 생성자를 통해서 필드에 값 할당
	
	String name;
	int age;
	String mail;
	
	Cc(){
		name = "김진수2";
		age = 30;
		mail = "***@naver.com";
	}
	void print() {
		System.out.println("name: "+name+"\nage : "+age+"\nmail: "+mail);
	}
}

public class FieldOfValue {

	public static void main(String[] args) {
		
		//1. 객체의 필드에 직접 값을 할당
		Aa aa = new Aa();
		aa.name = "김진수";
		aa.age = 28;
		aa.mail= "sootecc@gmail.com";
		aa.print();
		System.out.println("====================================");
		
		//2. setter를 통해서 필드에 값 할당
		Bb bb = new Bb();
		bb.setAge(29);
		bb.setMail("***@google.com");
		bb.setName("김진수1");
		bb.print();
		System.out.println("====================================");
		
		//3. 생성자를 통해서 필드에 값 할당
		Cc cc = new Cc();
		cc.print();
		
		
	}

}
