package chap06_07.Ex05;

class B{	//�ܺ� Ŭ����: public�� �� �� ����. default�� �����Ǿ� �ִ�.
			//�ٸ� ��Ű������ ������ �Ұ���, ���� ��Ű�� �������� ���� ����
	private int a = 1 ; 		//private: ���� Ŭ���� �������� ��� ����
	int b = 2;					//default: ���� ��Ű������ �ٸ� Ŭ�������� ���� ����
	protected int c = 3;		//protected: default ���� + �ٸ� ��Ű���� ���� ����(��ӵ� ���)
	public int d = 4;			//public: �ٸ� ��Ű������ ������ ����
	
	//private < default < protected < public
	
	private void print1() { //���� Ŭ������ �����ϴ� �޼ҵ�
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	void print2() { //���� Ŭ������ �����ϴ� �޼ҵ�
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	protected void print3() { //���� Ŭ������ �����ϴ� �޼ҵ�
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	public void print4() { //���� Ŭ������ �����ϴ� �޼ҵ�
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	
}



public class ExternalClass_1 {

	public static void main(String[] args) {
		
		B b = new B();		//default: ���� ��Ű���� �����ϹǷ� B class�� ������ �� �ִ�.
		Bb bb = new Bb(); 
		
		//�ʵ� ����
		//bb.a = 10;	
		bb.b = 20;
		bb.c = 30;
		bb.d = 40;
	
		//�޼ҵ� ����
		//bb.print1();		private
		bb.print2();		//default
		bb.print3();		//protected
		bb.print4();		//public
	
	}

}
