package chap13.Ex07;

//2. �������̽��� �߻�޼ҵ带 ������ !�͸� ���� Ŭ����! ���� �� ȣ��: �� ���� ����ϴ� ���


interface AA{		//�������̽�, �߻�޼ҵ带 ����
	public abstract void cry();		//�߻�޼ҵ�, public abstract
	void fly();
}

class BB{
	
	AA a = new AA() {	//�������̽��� ��üȭ �� �� ����. ������ �͸� ���� Ŭ������ �����Ͽ� ���� ����
		//A �������̽��� ������ �ڽ� Ŭ���� ���, Ŭ���� �̸��� ����.(�����Ϸ��� �������� �̸� �Ҵ�)
		@Override
		public void cry(){
			System.out.println("�۸�");
		}
		@Override
		public void fly() {
			System.out.println("�������մϴ�.");
		}
	};
	
	void abc() {
		a.cry();
		a.fly();
	}
	
	
}


public class AnonymousClass_2_1 {

	public static void main(String[] args) {
		
		BB b = new BB();
		b.abc();
	
	}

}
