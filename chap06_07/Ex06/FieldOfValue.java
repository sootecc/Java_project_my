package chap06_07.Ex06;

//��ü�� �ʵ忡 ���� �Ҵ��ϴ� ���: 3����
	//1. �ʵ忡 ���� ���� �ο��ϴ� ���						<��ü�� ���� ��>
	//2. setter�� ���ؼ� ��ü�� �ʵ忡 ���� �ο�(��Ʈ�� ����)	<��ü�� ���� ��>
	//3. �����ڸ� ���ؼ� ��ü�� �ʵ尪�� �ο�(��Ʈ�� ����)		<��ü�� ���� �� �� �ʱⰪ���� �ʵ忡 ���� �Ҵ�>

class Aa{	//1. ��ü ���� �� ���� �ʵ忡 �� �Ҵ�
	
	String name;	//�̸�
	int age;		//����
	String mail;	//�����ּ�

	void print() {
		System.out.println("name: "+name+"\nage : "+age+"\nmail: "+mail);
	}

}

class Bb{	//2. setter�� ���ؼ� �ʵ忡 �� �Ҵ�
	
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

class Cc{	//3. �����ڸ� ���ؼ� �ʵ忡 �� �Ҵ�
	
	String name;
	int age;
	String mail;
	
	Cc(){
		name = "������2";
		age = 30;
		mail = "***@naver.com";
	}
	void print() {
		System.out.println("name: "+name+"\nage : "+age+"\nmail: "+mail);
	}
}

public class FieldOfValue {

	public static void main(String[] args) {
		
		//1. ��ü�� �ʵ忡 ���� ���� �Ҵ�
		Aa aa = new Aa();
		aa.name = "������";
		aa.age = 28;
		aa.mail= "sootecc@gmail.com";
		aa.print();
		System.out.println("====================================");
		
		//2. setter�� ���ؼ� �ʵ忡 �� �Ҵ�
		Bb bb = new Bb();
		bb.setAge(29);
		bb.setMail("***@google.com");
		bb.setName("������1");
		bb.print();
		System.out.println("====================================");
		
		//3. �����ڸ� ���ؼ� �ʵ忡 �� �Ҵ�
		Cc cc = new Cc();
		cc.print();
		
		
	}

}
