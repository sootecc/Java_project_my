package chap05;

public class PrimaryAndReferenceType {

	public static void main(String[] args) {
		
		//1. �⺻ �ڷ����� ���� ���� (stack ���� ����)
		
		int value1 = 3;
		int value2 = value1;
		
		value2 = 7;
		System.out.println(value1);	
		System.out.println(value2);
		System.out.println("==================");
		
		
		//2. ���� �ڷ����� ���� ���� (stack ��(�� ������ �ּ�)�� ����)
		
		int[] array1 = new int[] {3,4,5,7};
		int[] array2 = array1;
		
		array2[0] = 7;
		System.out.println(array1[0]);	//7
		System.out.println(array2[0]);	//7
		System.out.println(array1);		//�ּҰ� ���
		System.out.println(array2);		//�ּҰ� ���
		

		
		
		
	}

}
