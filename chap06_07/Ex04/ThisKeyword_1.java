package chap06_07.Ex04;

//������ this Ű���� �ڵ� �߰�
//1. Ŭ���� ���ο��� field, method �̸� �տ� �ڵ����� this Ű���尡 �ٴ´�.
	// this Ű�� �ڱ� �ڽ��� ��ü field�� ��ü method�� ��Ī, 

class A{
	int m;
	int n;
	
	A(){}
	
	
	void init(int a, int b) {
		int c;			//a,b,c �������� (stack �����ȿ� ������� ���� ������.)
		c = 3;			//init() �޼ҵ� ������ stack�� ����, �޼ҵ尡 ������ ������ �Ҵ� ����
		this.m = a;		//this Ű�� �������� ��, �����Ϸ��� �ڵ����� �߰�
		this.n = b;		
	}
	void work() {
		this.init(2, 3);
		System.out.println(this.m+" , "+this.n);	//this�� ���� ����, ������ �����Ϸ��� �ڵ����� �߰�
	}
}

public class ThisKeyword_1 {

	public static void main(String[] args) {
		
		//2. ��ü ����
		A a = new A();
		
		//3. �޼��� ȣ��
		a.work();
		
		
	}

}
