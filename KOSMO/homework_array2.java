package KOSMO;

import java.util.Arrays;

public class homework_array2 {

	public static void main(String[] args) {
	
		//문제:
		//배열변수명:arr1 [100]
		/*
		 * 0번째 방 1
		 * 1번째 방 2
		 * ..
		 * 99번째 방 100
		 * for문을 사용하여 각 방에 값 넣기
		 * 
		 * for문 , 향상된 for문, Arrays.toString을 사용하여 출력해보기
		 */
	
		int[] arr1 = new int[100];
		
		//값 대입 부분
		for(int i = 0;i<arr1.length;i++) {
			arr1[i] = i+1;
		}
	
		
		System.out.println("for문 출력 부분");
		for(int i = 0;i<arr1.length;i++) {
			System.out.print(arr1[i]+ " ");
		}
		
		System.out.println("\n향상된 for문 출력 부분");
		for(int k:arr1) {
			System.out.print(k+ " ");
		}
		
		System.out.println("\nArrays.toString() 출력 부분");
		System.out.println(Arrays.toString(arr1));
		
		
		
	}
}
