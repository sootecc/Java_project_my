package chap06_07.EX02;

import chap06_07.Ex03.AA;

//�پ��� Ÿ���� �޼ҵ�



public class ExternalCallMethods {

	public static void main(String[] args) {
		//��ü ����
		AA a = new AA();
		
		//�޼ҵ� ȣ��
		a.print();
		int k = a.data();		//3
		System.out.println(k);
		
		double result = a.sum(3, 5.2);
		System.out.println(result);
		
		a.printMethod(5);
		a.printMethod(25);
		
		//����:
		
		System.out.println(a.data());		//��� ������ ȣ�� ������ �޼ҵ�(������ �ִ� �޼ҵ�)
		//System.out.println(a.print()); 	�����߻�
		a.print();
		System.out.println(a.sum(4, 10.5));
		//System.out.println(a.printMethod(3)); �����߻�
		
		
	}

}
