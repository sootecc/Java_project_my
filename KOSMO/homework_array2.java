package KOSMO;

import java.util.Arrays;

public class homework_array2 {

	public static void main(String[] args) {
	
		//����:
		//�迭������:arr1 [100]
		/*
		 * 0��° �� 1
		 * 1��° �� 2
		 * ..
		 * 99��° �� 100
		 * for���� ����Ͽ� �� �濡 �� �ֱ�
		 * 
		 * for�� , ���� for��, Arrays.toString�� ����Ͽ� ����غ���
		 */
	
		int[] arr1 = new int[100];
		
		//�� ���� �κ�
		for(int i = 0;i<arr1.length;i++) {
			arr1[i] = i+1;
		}
	
		
		System.out.println("for�� ��� �κ�");
		for(int i = 0;i<arr1.length;i++) {
			System.out.print(arr1[i]+ " ");
		}
		
		System.out.println("\n���� for�� ��� �κ�");
		for(int k:arr1) {
			System.out.print(k+ " ");
		}
		
		System.out.println("\nArrays.toString() ��� �κ�");
		System.out.println(Arrays.toString(arr1));
		
		
		
	}
}
