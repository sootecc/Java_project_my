package chap06_07.Ex06;

import chap06_07.Ex05.Bb;

//import chap06_07.Ex05.B;		//class B�� Ŭ���� ���� �����ڰ� default�̱� ������ ���� �Ұ���



public class ExternalClass_2 {

	public static void main(String[] args) {
	
		//B b = new B();	//public �ƴ϶� �ȵ�
		//�ٸ� ��Ű���� Ŭ�������� Bb Ŭ������ ���� �ϴ� ���
		
			//1. import�� ���� ���
			//2. Bb Ŭ������ Ŭ���� ���� �����ڴ� public
			//3. �ʵ�, �޼ҵ��� ���� �����ڿ� ���� ������ ����(protected(��Ӱ���), public), �Ұ���(private, default)
		
		Bb b = new Bb();	//public�̶� import ����
		
		//<<�ʵ� ����>>
		//b.a = 10;			//private: ���� Ŭ���� �������� ����
		//b.b = 20;			//default: ���� ��Ű�� �������� ���� ����
		//b.c = 30;			//protected: default ���� + �ٸ� ��Ű������ ���� ����(���)
		b.d = 40;			//public: protected + �ٸ� ��Ű������ ���� ����
		
		
		//<<�޼ҵ� ����>>
		//b.print1();		//private
		//b.print2();		//default
		//b.print3();		//protected
		b.print4();			//public
	}

}
