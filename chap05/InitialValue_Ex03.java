package chap05;

public class InitialValue_Ex03 {

	public static void main(String[] args) {
		//1. �޸��� �ʱⰪ
		int value1;						//�⺻ �ڷ����� �ʱⰪ�� �Ҵ����� �ʾ��� ��
		//System.out.println(value1);
		int [] value2;					//�迭: ���� �ڷ���
		//System.out.println(value2);
		//�ʱⰪ�� ���� ������ ����
		
		
		int value3 = 0;					//�⺻ �ڷ����� 0���� �ʱⰪ�� �Ҵ�
		System.out.println(value3);
		
		int[] value4 = null;			//���� �ڷ����� �ʱⰪ���� null: �� �� ����, ����ִ� ����
		System.out.println(value4);
		
		
		//2. Heap �޸��� �ʱⰪ (���� �ʱ�ȭ)
		//heap�������� �����ڷ����� ���� �Ҵ�
		//�⺻ �ڷ��� �迭
		//boolean: false
		//int: 0 (������)
		//double: 0.0 (�Ǽ���)
		
		boolean array1[] = new boolean[10];
		System.out.println(array1[0]+" "+array1[1]+" "+array1[2]);	//false false false
		// ���� �ڷ����� ���� ���� �ʱ�ȭ�� ������ ������ �⺻���� ����. 
		
		System.out.println("=============for ���� ����Ͽ� �迭�� ���� ���===================");
		for(int i = 0 ; i<3; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		System.out.println("��ü�� �޸� �ּ�: "+array1);
		System.out.println("��ü�� ũ��: "+array1.length);
		System.out.println("=============for �� + .length===================");
		for(int i =0; i<array1.length;i++) {
			System.out.println("array1["+i+"]�� ����:"+array1[i]);
		}
		
		
		
		System.out.println("================int �迭 �ʱⰪ================");
		int[] array2 = new int[3];		//0�� �⺻������ �Ҵ�
		for(int i=0;i<array2.length;i++) {
			System.out.print(array2[i]+" ");
		}
		
		System.out.println("\n=============double �迭 �ʱⰪ================");
		double[] array3 = new double[3];	//0.0�� �⺻������ �Ҵ�
		for(int i=0;i<array3.length;i++) {
			System.out.print(array3[i]+ " ");
		}
		
		System.out.println("\n=============String �迭 �ʱⰪ================");
		//���� �ڷ��� �迭�� ��� �⺻ ������ null
		String[] array4 = new String[3];
		for(int i=0;i<array4.length;i++) {
			System.out.print(array4[i]+ " ");
		}
		
		
		
		
	}

}
