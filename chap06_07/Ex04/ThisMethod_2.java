package chap06_07.Ex04;

//this();�� ���ó: �������� �����ڿ��� �ߺ��� ���� �Ź� �Է��� ���
class Aaa{
	int m1,m2,m3,m4;
	Aaa(){		
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	
	}
	Aaa(int a){
		
		m1 = a;
		m2 = 2;
		m3 = 3;
		m4 = 4;
		
	}
	Aaa(int a, int b){
		
		m1 = a;
		m2 = b;
		m3 = 3;
		m4 = 4;
	}

	
	void print() {			//�� �޸��� ���� ���
		System.out.println(m1+" "+m2+" "+m3+" "+m4);
	}
}

//this();�� ���ó: �������� �����ڿ��� �ߺ��� ���� �Ź� �Է��� ���
class Bbb{
	int m1,m2,m3,m4;
	Bbb(){		
		m1 = 4;
		m2 = 3;
		m3 = 2;
		m4 = 1;
	
	}
	Bbb(int a){
		this();
		m1 = a;
	
	}
	Bbb(int a, int b){
		this();
		m1 = a;
		m2 = b;
		
	}

	
	void print() {			//�� �޸��� ���� ���
		System.out.println(m1+" "+m2+" "+m3+" "+m4);
	}
}


public class ThisMethod_2 {

	public static void main(String[] args) {
		
		Aaa a = new Aaa();
		Aaa a1 = new Aaa(1);
		Aaa a2 = new Aaa(1,2);

		
		a.print();
		a1.print();
		a2.print();
		
		Bbb b = new Bbb();
		Bbb b1 = new Bbb(4);
		Bbb b2 = new Bbb(4,3);
		
		b.print();
		b1.print();
		b2.print();
	}

}
