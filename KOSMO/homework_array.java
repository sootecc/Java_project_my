package KOSMO;

import java.util.Arrays;

public class homework_array {

	public static void main(String[] args) {
	
		//����:
		//�迭������:arr2 [300]
		/*
		 * 0��° �� 3
		 * 1��° �� 6
		 * ..
		 * 299��° �� 3�� ���
		 * 
		 * Ȧ�� �� ���� ���� ���, ���� 100~300
		 * 
		 * for���� ����Ͽ� �� �濡 �� �ֱ�
		 * 
		 * for�� , ���� for��, Arrays.toString�� ����Ͽ� ����غ���
		 */
	
		int[] arr2 = new int[300];
		
		//�� ���� �κ�
		for(int i = 0;i<arr2.length;i++) {
			arr2[i] = i*3+3;
		}
	
		
		System.out.println("for�� ��� �κ�");
		for(int i = 0;i<arr2.length;i++) {
			System.out.print(arr2[i]+ " ");
		}
		
		System.out.println("\n���� for�� ��� �κ�");
		for(int k:arr2) {
			System.out.print(k+ " ");
		}
		
		System.out.println("\nArrays.toString() ��� �κ�");
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("========================================");
		
		System.out.println("Ȧ�� �� �� for�� ��� �κ�");
		for(int i = 50;i<arr2.length;i++) {
			int k =2*i + 1;
			if(k>300) {break;}
			System.out.println(k+"��° �� ��: "+arr2[k]+ " ");
		}

		
	}
}
