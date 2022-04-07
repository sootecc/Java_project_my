package chap18.Ex08;

//�迭�� �����ڿ� ����
@FunctionalInterface
interface A{
	int[] abc (int len);
}

public class RefOfArrayConstructor {



	

	
	public static void main(String[] args) {

		//�迭�� ������ ����.
		//1. �͸� �̳� Ŭ����
		A a1 = new A() {		//�迭 ���� int[] arr = new int[���ǰ���];
			@Override
			public int[] abc(int len) {	//������ len ���� �޾Ƽ�
				return new int[len];	//������ �޾Ƽ� �迭 ���� ũ�⸦ ����
			}
		};
		
		//���ٽ�
		A a2 = (int len) -> {return new int[len];};
		A a3 = len -> new int[len];
		
		
		//�迭�� ������ ���� ǥ����
		A a4 = int[]::new;
		
		
		
		//�迭 ���� ����
		//int[] array = new int[3];
		//int[] array = new int[] {1, 2, 3, 4, 5};	����� ���ÿ� �� �Ҵ�
		//int[] array = {1, 2, 3, 4, 5};			����� ���ÿ� �� �Ҵ�
		
		
		int[] array1 = a1.abc(3);		//abc�޼ҵ尡 �� ũ�⸦ �������� ��
		System.out.printf("%d%s",array1.length,System.lineSeparator());
		
		int[] array2 = a2.abc(4);		//abc�޼ҵ尡 �� ũ�⸦ �������� ��
		System.out.printf("%d%s",array2.length,System.lineSeparator());
		
		int[] array3 = a3.abc(5);		//abc�޼ҵ尡 �� ũ�⸦ �������� ��
		System.out.printf("%d%s",array3.length,System.lineSeparator());
		
		
	
	
	}

}
