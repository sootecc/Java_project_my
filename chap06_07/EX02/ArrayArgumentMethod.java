package chap06_07.EX02;

import java.util.Arrays;

public class ArrayArgumentMethod {

	//static 있으면서 같은 클래스에 존재하는 메소드
	//다른 패키지에서 접근 가능하도록 설정: 접근제어자(public, protected, default, private)
	//접근제어자가 생략되어 있으면: default(같은 패키지에서 접근가능)
	
	static void printArray(int[] a) {	
		
		System.out.println("====Arrays.toString()로 출력====");
		System.out.println(Arrays.toString(a));
		//for문을 사용하여 출력
		
		System.out.println("=========for문으로 출력=========");
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		
		System.out.println("=====enhanced for문으로 출력=====");
		for(int i :a) {
			System.out.print(i+ " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// 배열을 매개변수로 가지는 메소드 호출
		
		int[] a = new int[] {1,2,3};		//배열변수를 선언하고 값을 넣음
		
		printArray(a);		//static이라 얘를 객체 생성없이 호출 가능
		printArray(new int[] {4,5,6,7,8});
		//printArray({1,2,3}); 오류발생
	}

}
