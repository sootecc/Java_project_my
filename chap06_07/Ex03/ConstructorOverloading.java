package chap06_07.Ex03;

//������ �����ε�: �ϳ��� �����ڸ� ������Ÿ��, ������ ���� �ٸ� �����ڰ� ȣ��
//����) �޼ҵ��, ������ Ÿ��, ���� ���� ��� ���� �߻�
class Abc{
	int a, b, c;
	String d;
	
	Abc(){
		System.out.println(a+" , "+b+" , "+c);
		System.out.println("============");
		}
	Abc(String d){
		this.d = d;
		System.out.println(d);
		System.out.println("============");
	}
	Abc(int a){
		this.a = a;
		System.out.println(a);
		System.out.println("============");
	}
	Abc(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println(a+" , "+b);
		System.out.println("============");
	}
	Abc(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println(a+" , "+b+" , "+c);
		System.out.println("============");
	}
	
}


public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Abc abc = new Abc();
		Abc abc1 = new Abc(1);
		Abc abc2 = new Abc(1,2);
		Abc abc3 = new Abc(1,2,3);
		Abc abc4 = new Abc("overloading");	

	}

}
