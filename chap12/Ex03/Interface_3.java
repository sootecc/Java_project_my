package chap12.Ex03;

interface A{ }
interface B{ }

//1. ���� �������̽� ���
class C implements A{}	//C Ŭ������ A �������̽��� ����(���)

//2. ���� �������̽� ���
class D implements A,B{}	//�������̽��� ���� ����(���)�� �����ϴ�.

//3. Ŭ������ �������̽��� ���ÿ� ��� (extends�� implements�� ������ ���� �Ұ�)
		//Ŭ������ ���� ��� �Ұ�, �������̽��� ���� ��� ����
class E extends C implements A,B{}







public class Interface_3 {

	public static void main(String[] args) {

	}

}
