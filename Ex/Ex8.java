package Ex;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};	// 환산할 돈의 종류
		int[] count = {0, 0, 0, 0, 0, 0, 0, 0};	//돈의 개수
				
		System.out.print("금액을 입력하시오>> ");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		while(true) {
			if(money>=unit[0]) {
				money -=unit[0];
				count[0]++;		//50000
			}
			else if(money>=unit[1]) {
				money -=unit[1];
				count[1]++;		//10000
			}
			else if(money>=unit[2]) {
				money -=unit[2];
				count[2]++;		//1000
			}
			else if(money>=unit[3]) {
				money -=unit[3];
				count[3]++;		//500
			}
			else if(money>=unit[4]) {
				money -=unit[4];
				count[4]++;		//100
			}
			else if(money>=unit[5]) {
				money -=unit[5];
				count[5]++;		//50
			}
			else if(money>=unit[6]) {
				money -=unit[6];
				count[6]++;		//10
			}
			else if(money>=unit[7]) {
				money -=unit[7];
				count[7]++;		//1
			}
			else {
				break;
			}
		}
		
		for(int i = 0; i<unit.length;i++) {
			System.out.println(unit[i]+" 원 짜리 : "+ count[i]+"개");
		}
		
		
	}

}
