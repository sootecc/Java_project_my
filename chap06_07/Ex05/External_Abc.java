package chap06_07.Ex05;

import chap06_07.Ex06.Bcd;

// import chap06_07.Ex06.Abc;		//Abc Ŭ������ ���������ڰ� default

public class External_Abc extends Bcd{ 		//External_Abc Ŭ������ Bcd Ŭ������ ��� ����
	//Bcd: �θ� Ŭ����, External_Abc: �ڽ� Ŭ����
	
	public static void main(String[] args) {
		
		//Abc abc2 = new Abc();		//class ���� �����ڰ� default. import�Ұ�
		
		Bcd bcd1 = new Bcd();					//�θ� Ŭ����
		External_Abc ext = new External_Abc();	//�ڽ� Ŭ����
		
		
		//�ٸ� ��Ű������ ȣ�� �� ��
		//1. import
		//2. ��ü ����
		//3. ���� ������ Ȯ�� �� ����(�ʵ�, �޼ҵ�)
				
		//�ٸ� ��Ű������ �ʵ� ȣ��
			bcd1.a = 1000;	//public		�ٸ� ��Ű������ ���� ����
			ext.b = 2000;	//protected		�ڽ� Ŭ�������� �θ� Ŭ������ protected�� ����
			
		//�ٸ� ��Ű������ �޼ҵ� ȣ��
			bcd1.print1();	//public
			ext.print2();	//protected
		//	bcd1.print3();	//default(X)
		//	bcd1.print4();	//private(X)
				
		
	}

}
