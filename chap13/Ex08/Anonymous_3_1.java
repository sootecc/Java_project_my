package chap13.Ex08;

//3. �޼ҵ��� �Ű������� ����: 
//	3-1. ��ü ���� �� �Ű������� ����(Ŭ������ O, �������� O)
//	3-2. Ŭ������ O, �������� X


interface AA{		//�������̽�, �߻�޼ҵ带 ����
	public abstract void cry();		//�߻�޼ҵ�, public abstract
	void fly();
}

class BB implements AA{				//BB�� AA�������̽��� ����
	@Override
	public void cry() {
		System.out.println("�۸�: �Ű����� ���� �� ���");
	}
	@Override
	public void fly() {
		System.out.println("���� ���մϴ�: �Ű����� ���� �� ���");
	}
}

class CC {		//CC ��ü�� abc �޼ҵ� ȣ��� AŸ���� �Ű������� �޴´�.
	void abc(AA a) {	//�ڽ� Ŭ������ ������ �ڵ� ��ĳ����
		a.cry();
		a.fly();
	}
}



public class Anonymous_3_1 {	

	public static void main(String[] args) {
		
		// Ŭ������ O, �������� O
		CC c = new CC();
		AA a = new BB();		//B�� ��üȭ�ؼ� AŸ������ ����, a: ��������
		
		c.abc(a);
		System.out.println("====================================");
		
		// Ŭ������ O, �������� X
	
		c.abc(new BB());		//interface�� �ƴ� ������ Ŭ����, �ڵ� ��ĳ���� �ȴ�.
		
	
	}

}
