package Ex;

import java.util.Scanner;

public class Ex8_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		int money;
		
		System.out.println("환산할 돈의 금액을 입력하세요. >>> ");
		money = sc.nextInt();
		
		for(int i = 0; i<unit.length;i++) {
			System.out.printf(" %d원 짜리 : %d 개 \n", unit[i],money/unit[i]);
			money -= unit[i]*(money/unit[i]); 
		}
		
		
	}

}
