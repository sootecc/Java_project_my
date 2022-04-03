package chap10.Ex04;


//�޼ҵ� �����ε�(Method Overloading) vs �޼ҵ� �������̵�(Method Overriding)

/*
 * 	1.�޼ҵ� �����ε�: ������ �޼ҵ� �̸����� (�Ű����� Ÿ��, �Ű����� ����)�� ���� �ش� �޼ҵ尡 ȣ��
 * 		-- ��Ӱ��� ������ ����. �����ڿ��� ���� ���
 * 	2.�޼ҵ� �������̵�: �ݵ�� ��� ���迡�� ���
 * 		�θ��� �޼ҵ带 ���Ӱ� �����ؼ� ���
 * 		-> 1.��Ӱ��� 2.�޼ҵ��� �ñ״��İ� ���ƾ��Ѵ�.(�޼ҵ��, �Ű����� ����, �Ű����� Ÿ��)
		-> 3. �ڽĿ��� �θ��� ���������ڿ� ���ų� �� ���� ������� �Ѵ�.
 */		

class Ab{
	void print1() {			//�������̵�
		System.out.println(" Ab Ŭ������ print1() ");
	}
	void print2() {			//�����ε�
		System.out.println("Ab Ŭ������ print2()");
	}
}
class Bc extends Ab{
	@Override
	void print1() {
		System.out.println("Bc Ŭ������ print1");
	}
	void print2(int a) {	//�����ε�
		System.out.println("Bc Ŭ������ print2");
	}
}


public class Overloading_VS_Overriding {

	public static void main(String[] args) {
			//1. A Ÿ�� ����
		
			Ab aa = new Ab();
			aa.print1();
			aa.print2();
			System.out.println("===================");
			
			//2. Bb Ÿ�� ����, ������ ȣ�� Bb
			Bc bb = new Bc();
			bb.print1();		//Bc Ŭ������ print1�� ȣ��
			bb.print2();
			bb.print2(3);
			System.out.println("===================");
			
			//3. Ab Ÿ������ ���� + Bc Ÿ�� ������ ȣ��
			Ab cc = new Bc();
			cc.print1();			//�޼ҵ� �������̵��� �Ǿ������Ƿ� ���� ���ε��� ���ؼ� Bc�� print1()�� ȣ��
			cc.print2();			//AbŬ������ �޼ҵ常 ȣ�� ����
			
			
			
			
	}

}
