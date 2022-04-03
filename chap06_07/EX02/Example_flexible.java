package chap06_07.EX02;

import java.util.Scanner;


public class Example_flexible {


	
	public static void main(String[] args) {
			
		//각 변수의 값을 할당하고 출력
		//스캐너로 임의의 정수값을 받아서 합계, 평균 // flexible 이용
		
		
		Scanner number = new Scanner(System.in);			
		String num;
		
		
		
		
		System.out.println("숫자를 띄어쓰기로 구분하여 입력해주세요");
		num = number.nextLine();
		
		System.out.println(num);
		String split[] = num.split(" ");
		int[] token = new int[split.length];
		
		for(int i = 0; i<split.length;i++) {
			token[i] = Integer.parseInt(split[i]);
		}		//여기서 변환하지 않고 메소드에 있는 for에서 sum 연산을 하며 바꿔줄 수도 있다.
		
		calc(token);
		
		
	}
	
	static void calc(int...num) {
		int sum = 0;
		
		
		for (int k:num) {
			sum += k;

		}
		
		System.out.println("합계: "+sum+"\n평균: "+(double)sum/num.length);
	}
	
	

}
