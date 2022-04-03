package sec01_basicsyntax.Ex03_ConsolOutput;

import java.util.Scanner;

public class ConsolOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dice  = new int [3];
		int max = 0;
		
		for(int  i = 0; i<dice.length;i++) {
			dice[i] = sc.nextInt();
			if(max<dice[i]) {
				max = dice[i];
			}
		}
		
		if(dice[0]==dice[1]) {
			if(dice[0]==dice[2]) {
				System.out.println(10000+dice[0]*1000);
				
			}
			else {
			System.out.println(1000+dice[0]*100);
			}
		}
		else if(dice[1]==dice[2]) {
			System.out.println(1000+dice[1]*100);
		}
		else if(dice[0]==dice[2]) {
			System.out.println(1000+dice[0]*100);
		}
		else {
			System.out.println(max*100);
		}
		
		
		
	}
		
}

//교재 51쪽 실습