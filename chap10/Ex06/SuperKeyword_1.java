package chap10.Ex06;


//super: �θ� Ŭ����(��Ӱ���)
//this: �ڽ��� ��ü

//�������̵�: �����ִ�. �ڽ��� �޼ҵ尡 �θ��� �޼ҵ带 ���������� �θ� �ٽ� ȣ���� �� ����(�������� ����)
//

class A {
	void abc() {
		System.out.println("A Ŭ������ abc �޼ҵ�");
	}
}
class B extends A{
	void abc() {
		System.out.println("B Ŭ������ abc �޼ҵ�");
	}
	void bcd() {
		abc();	//this.abc		this�� �ڽ��� ��ü
		super.abc();		
	}
}

public class SuperKeyword_1 {

	public static void main(String[] args) {
		//1. ��ü ����
		B bb = new B();
		
		//2. �޼ҵ� ȣ��
		bb.bcd();	 
	
	}

}
