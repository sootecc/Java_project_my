package chap06_07.Ex05;

	//���� ������(ĸ��ȭ, �����͸� �ܺηκ��� ��ȣ): public, protected, default, private
		//Ŭ���� �̸�, �ʵ��, �޼ҵ��, �����ڸ� < ���������ڰ� �ݵ�� �Ҵ�Ǿ� �ִ�.
		//Ŭ���� �̸�: public, default

public class A {

		int m = 3;	//�ʵ��� �⺻ ���� �����ڴ� default, ������
		int n = 4;	//default: �ٸ� ��Ű���� Ŭ���������� ���� �Ұ�
				
					//private: �ܺ� Ŭ�������� ������ �Ұ���
		public int k = 10;	//public: �ٸ� ��Ű������ ���� ����
		
		void print() {		//default: ���� ��Ű������ Ŭ���������� ��� ����
			System.out.println("import success "+ m+" , "+n);
		}
		public void print2() {
			System.out.println("�ܺ���Ű���� �ٸ� Ŭ�������� ���� ����" + k);
		}
	public static void main(String[] args) {

	}

}
