package chap12.Ex01;


//2. �߻� �޼ҵ带 ����ϴ� �� ��° ���: �ڽ� Ŭ���� ���� ���� �͸� Ŭ������ Ȱ���ϴ� ���
	// �ӽ������� �� ���� ����� ��(�̺�Ʈ ó��)
	// ����: �ڽ� Ŭ���� ������ ���� �ʴ´�.
	// ����: ���� ��ü�� �����ؾ� �� ��� ��ȿ�����̴�.
abstract class AAA{
	abstract void abc();	//�߻� �޼ҵ�
}





public class AbstractClass_2 {

	public static void main(String[] args) {
		
		//1. �͸� ��ü ����
		AAA aaa = new AAA() {	//�͸� ��ü�� Ȱ���� �߻� �޼ҵ带 Ŭ���� �������� ����. ���� �����ݷ� ���°� �� Ư���ϳ�
			void abc() {
				System.out.println("��� 2: ��ü ���� ���� �͸�Ŭ������ �߻�޼ҵ� ����");
			}
		};
		
		//AAA aaa1 = new AAA(); �߻�Ŭ������ ��ü ���� �Ұ�, �͸� Ŭ���� ���� �� �޼ҵ� �������Ͽ� ���
		AAA aaa1 = new AAA() {
			void abc() {
				System.out.println("��� 2: ��ü ���� ���� �͸�Ŭ������ �߻�޼ҵ� ����");
			}
		};
		
		AAA aaa2 = new AAA() {
			void abc() {
				System.out.println("��� 2: ��ü ���� ���� �͸�Ŭ������ �߻�޼ҵ� ����");
			}
		};			
		
		
		//2. �޼ҵ� ȣ��
		aaa.abc();		
		aaa1.abc();
		aaa2.abc();
	}

}
