package chap05;

import java.util.Arrays;

public class ReadArrayData_Ex05 {

	public static void main(String[] args) {
		
		int[] array = new int[] {3,4,5,6,7};
		
		//1. 배열전체의 길이 구하기
		System.out.println(array.length);	//index 개수: 5
		System.out.println();
		//2. 출력
		//	index를 직접 입력하여 출력
		System.out.print(array[0]+ " ");
		System.out.print(array[1]+ " ");
		System.out.print(array[2]+ " ");
		System.out.print(array[3]+ " ");
		System.out.print(array[4]+ " ");
		System.out.println();
		
		
		//	for문을 사용하여 범위 지정 후 출력
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		
		//	enhanced for, 처음부터 마지막까지 순환하면서 출력. 범위 지정 불가
		for(int k:array) {					//for (출력할 자료형 변수:배열){실행부분,k를 출력}
			System.out.print(k+" ");
		}
		System.out.println();
		
		
		//	Arrays.toString(배열변수명), 배열의 모든 값을 출력
		System.out.println(Arrays.toString(array));
		
		
	}

}
