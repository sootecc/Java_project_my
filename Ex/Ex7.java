package Ex;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		int[] array = new int[10]; 
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력하시오>> ");
		
		for(int i=0; i<10; i++) {
			array[i]  = sc.nextInt();
			
		}
		sc.close();
		
		System.out.print("3의 배수는 ");
		
		for(int i=0;i<array.length;i++) {
			if(array[i]%3==0) {
				System.out.print(array[i]+" ");
			}
		}
		
	}

}
