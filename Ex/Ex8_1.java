package Ex;

import java.util.Scanner;

public class Ex8_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		int money;
		
		System.out.println("ȯ���� ���� �ݾ��� �Է��ϼ���. >>> ");
		money = sc.nextInt();
		
		for(int i = 0; i<unit.length;i++) {
			System.out.printf(" %d�� ¥�� : %d �� \n", unit[i],money/unit[i]);
			money -= unit[i]*(money/unit[i]); 
		}
		
		
	}

}
