package chap06_07.Ex06;

class Cde{
	String name;
	int age;
	
	static String email;	//static �ʵ�: ��ü ���� ���� ��� ����(���� �� ��뵵 ����): Ŭ������.�ʵ��
	static int num;
}

public class Static_4 {

	public static void main(String[] args) {
		
		Cde cde1 = new Cde();	//��üȭ
		
		//�ν��Ͻ� �ʵ�: ��üȭ�ؾ� ��� ����
		cde1.name = "ȫ�浿";
		cde1.age = 35;
		
		//static �ʵ�: ��üȭ �ϸ� ��� ����
		cde1.email = "aaa@aaa.com";
		cde1.num = 4;
		
		//static �ʵ�: ��üȭ ���� �ʾƵ� ��� ����: Ŭ���������� ȣ��
		//��� ��ü���� �����ϴ� ����
		Cde.email = "bbb@bbb.com";
		Cde.num = 5;
		
		Cde cde2 = new Cde();
		Cde cde3 = new Cde();
		Cde cde4 = new Cde();
		
		//�ν��Ͻ� �ʵ�: heap ������ ����, �� ��ü���� �������� �ʴ� ������ ���� ������.
		
		cde2.name = "������";
		cde2.age = 50;
		cde3.name = "�������";
		cde3.age = 60;
		cde4.name = "�Ż��Ӵ�";
		cde4.age = 40;
		
		//�ν��Ͻ� �ʵ� �� ���
		System.out.println(cde1.name+" , "+cde1.age);
		System.out.println(cde2.name+" , "+cde2.age);
		System.out.println(cde3.name+" , "+cde3.age);
		System.out.println(cde4.name+" , "+cde4.age);
		
		System.out.println("=================");
		//static �ʵ� ���� �����ϸ� ��� ��ü�� static �ʵ� ���� ����ȴ�.
		System.out.println(cde1.email+" , "+cde1.num);
		System.out.println(cde2.email+" , "+cde2.num);
		System.out.println(cde3.email+" , "+cde3.num);
		System.out.println(cde4.email+" , "+cde4.num);
		
		System.out.println("=================");
		cde2.email="kkk@kkk.com";
		cde2.num = 55;

		System.out.println(cde1.email+" , "+cde1.num);
		System.out.println(cde2.email+" , "+cde2.num);
		System.out.println(cde3.email+" , "+cde3.num);
		System.out.println(cde4.email+" , "+cde4.num);

	}

}
