package chap10.Ex05;

class AA{				//�θ� Ŭ����
	int m = 3;			//�ν��Ͻ� �ʵ�
	void print() {
		System.out.println("AA class");
	}
}


class BB extends AA{		
	int m = 4;		//�ν��Ͻ� �ʵ�
	@Override
	void print() {
		System.out.println("BB class");
	}
}

class CC extends AA{
	int m = 5;		//�ν��Ͻ� �ʵ�
	@Override
	void print() {
		System.out.println("CC class");
	}
}

public class OverlapinstanceField {

	public static void main(String[] args) {
		//1. ��ü ����
		AA aa = new AA();
		BB bb = new BB();
		AA ab = new BB();
		
		CC cc = new CC();
		AA ac = new CC();
		
		//2. �ν��Ͻ� �ʵ� ���: �������̵��� ���� �ʴ´�.
		System.out.println(aa.m);				//3
		System.out.println(bb.m);				//4
		System.out.println(ab.m);				//3	�ν��Ͻ� �ʵ�� �������̵� ���� �ʴ´�.
		ab.print();		//�ν��Ͻ� �޼ҵ�� �������̵� �ȴ�. AA�� print()ȣ��� BB�� print()���
		System.out.println("=================");
		System.out.println(cc.m);				//5
		System.out.println(ac.m);				//3
		
		
		
	}

}
