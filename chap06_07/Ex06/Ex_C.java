package chap06_07.Ex06;

import chap06_07.Ex05.C;

public class Ex_C {

	public static void main(String[] args) {
		
		
		// �ٸ� Ŭ������ ������. public�� ����. model,color�޸𸮷� ���� �Ұ�
		// model�� color�� setter�� ���� �Ҵ� �� ���(setter�� �ڵ� public)
		
		C c = new C();
		c.maxspeed = 300;
		c.setColor("yellow");
		c.setModel("tico");
		
		c.print();
	}
}
