package chap13.Ex06;

//1. �������̽��� �߻�޼ҵ带 ������ !Ŭ���� ����! ���� �� ȣ��: ����� ����ϴ� ���


interface AA{		//�������̽�, �߻�޼ҵ带 ����
	public abstract void cry();		//�߻�޼ҵ�, public abstract
	void fly();
}

class BB{
	
	AA a = new CC();
	
	void abc() {
		a.cry();
		a.fly();
	}
	
	class CC implements AA{	//class C�� A�������̽��� �޼ҵ带 ������ Ŭ����

		@Override
		public void cry(){
			System.out.println("�۸�");
		}
		@Override
		public void fly() {
			System.out.println("�������մϴ�.");
		}
	}
}


public class AnonymousClass_1_1 {

	public static void main(String[] args) {

		BB b = new BB();
		b.abc();
	}

}
