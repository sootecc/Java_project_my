package chap13.Ex04;

//���� �̳�Ŭ����: Ŭ������ �޼ҵ� ���ο� ����� Ŭ����
	//�޼��� ������ �ʵ��  final Ű�� ������. ���� ���� �� �� ����.
	//�����̳�Ŭ�������� ���Ǵ� ���� ������ �ڵ����� final�� ����ȴ�.
class A{
	int a = 3;		//�ʵ�: Heap, �ݵ�� �ʱ�ȭ�� ������ �����
//	a = 4;			//���� �Ҵ�� �ʵ��� �ʱⰪ�� �����Ϸ��� ��üȭ�ؼ� ���� �����ؾ��Ѵ�.
					//�����ڳ� setter�� ���ؼ� �ʱⰪ�� �Ҵ��Ŀ� ��ü�� ����
	A(int a){
		this.a = a;
	}
	public void setA(int a) {	//setter
		this.a = a;
	}
	
	void ccc() {	//��������: �޼��� ������ ����, �޸��� ���� ������ ����
		int a = 3;	//�������� �ʱⰪ 3 �Ҵ�
		a = 4; 		
		a = 10;
		int b;
		b = 0;		//���������⶧���� �ʱⰪ�� �־�����Ѵ�.
		
		System.out.println(a);
		System.out.println(b);	
	}
	
	
	
	void abc() {
		int b = 5;		//���� ����: �޼ҵ� ���ο� ����� ����
						//�̳�Ŭ������ �ƴ� abc() �ȿ����� �������� �� ���� ����
						//�̳� Ŭ�������� ����Ϸ��ϸ� �ڵ����� final�� �ٴ´�.
		
		class B{		//���� �̳�Ŭ����
			void bcd() {
				System.out.println(a);		//�ʵ�
				System.out.println(b);		//��������
				a = 5;			//�ʵ�� �� ���� ����
				//b = 7; 		//����Ŭ���� ���ο� ����� ���������� �ڵ����� final
				
			}
		}
		
		B bb = new B();
		bb.bcd();
	}
}

public class InnerClass_4 {

	public static void main(String[] args) {
		
		//1. ��ü�� ���� �� �޼ҵ� ȣ��
		A a = new A(3);
		a.abc();
		
		
		
	}

}