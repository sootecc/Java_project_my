package chap10.Ex05;

class AAAA{								//static �޼ҵ�: �������̵� ���� �ʴ´�.
	static void print() {
		System.out.println("A Ŭ����");
	}
}
class BBBB extends AAAA{
	static void print() {
		System.out.println("B Ŭ����");
	}
}

public class OverlapStaticMethod {

	public static void main(String[] args) {
		//1. ��ü ���� ���� ȣ��
		
		AAAA.print();
		BBBB.print();
		System.out.println("============");
		
		
		//2. ��ü ���� �� ȣ��
		AAAA aaaa = new AAAA();
		aaaa.print();				// A class
		BBBB bbbb = new BBBB();
		bbbb.print();				// B class
		AAAA aabb = new BBBB();
		aabb.print();				// A class 	static �޼ҵ�� �������̵� ���� �ʴ´�.
		
		
	}

}
