package KOSMO;

import java.util.Arrays;

public class homework_array {

	public static void main(String[] args) {
	
		//문제:
		//배열변수명:arr2 [300]
		/*
		 * 0번째 방 3
		 * 1번째 방 6
		 * ..
		 * 299번째 방 3의 배수
		 * 
		 * 홀수 번 방의 값만 출력, 범위 100~300
		 * 
		 * for문을 사용하여 각 방에 값 넣기
		 * 
		 * for문 , 향상된 for문, Arrays.toString을 사용하여 출력해보기
		 */
	
		int[] arr2 = new int[300];
		
		//값 대입 부분
		for(int i = 0;i<arr2.length;i++) {
			arr2[i] = i*3+3;
		}
	
		
		System.out.println("for문 출력 부분");
		for(int i = 0;i<arr2.length;i++) {
			System.out.print(arr2[i]+ " ");
		}
		
		System.out.println("\n향상된 for문 출력 부분");
		for(int k:arr2) {
			System.out.print(k+ " ");
		}
		
		System.out.println("\nArrays.toString() 출력 부분");
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("========================================");
		
		System.out.println("홀수 번 방 for문 출력 부분");
		for(int i = 50;i<arr2.length;i++) {
			int k =2*i + 1;
			if(k>300) {break;}
			System.out.println(k+"번째 방 값: "+arr2[k]+ " ");
		}

		
	}
}
