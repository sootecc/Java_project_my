package chap05;

import java.util.Arrays;

public class ReadArrayData_Ex05 {

	public static void main(String[] args) {
		
		int[] array = new int[] {3,4,5,6,7};
		
		//1. �迭��ü�� ���� ���ϱ�
		System.out.println(array.length);	//index ����: 5
		System.out.println();
		//2. ���
		//	index�� ���� �Է��Ͽ� ���
		System.out.print(array[0]+ " ");
		System.out.print(array[1]+ " ");
		System.out.print(array[2]+ " ");
		System.out.print(array[3]+ " ");
		System.out.print(array[4]+ " ");
		System.out.println();
		
		
		//	for���� ����Ͽ� ���� ���� �� ���
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		
		//	enhanced for, ó������ ���������� ��ȯ�ϸ鼭 ���. ���� ���� �Ұ�
		for(int k:array) {					//for (����� �ڷ��� ����:�迭){����κ�,k�� ���}
			System.out.print(k+" ");
		}
		System.out.println();
		
		
		//	Arrays.toString(�迭������), �迭�� ��� ���� ���
		System.out.println(Arrays.toString(array));
		
		
	}

}
