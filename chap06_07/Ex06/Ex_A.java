package chap06_07.Ex06;

import chap06_07.Ex05.A;	

public class Ex_A {

	public static void main(String[] args) {
		
		
		//�ٸ� ��Ű���� ��ü�� ����ϴ� ���:
			//1. ��ü Ŭ���� �̸��� ����ϴ� ���		
		chap06_07.Ex05.A a = new chap06_07.Ex05.A();	//Ŭ������ ��ü�̸��� ���: ��Ű����.Ŭ������
		
		//a.m = 10;	���ٺҰ�: default�� �ٸ� ��Ű���� Ŭ���������� ���� �Ұ�
		a.k = 50;	//	public�̶� �ٸ� ��Ű���� Ŭ�������� ������ ����
		a.print2();
		
		
			//2. import�� ����ؼ� �����ϴ� ���
		
		A aa = new A();
		aa.k = 100;
		aa.print2();	//public: �ٸ� ��Ű���� �ִ� Ŭ�������� ���� ����
	}

}
