package Ex;


import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		//������ � �̸��� �ְ� �ش� ��� ������(���)�� �־ ����ϴ� ���α׷��� �ۼ�
		// ��ü �� �� ��յ� ���
		
		/*
		 * ��)
		 * �Է�>>
		 * Ź�� 2 �߱� 9 �౸ 11 �� 6 ���� 2
		 * 
		 * ���>>
		 * Ź��:2, �߱�:9, �౸:11, ��:6, ����:2
		 * ������� ������ �� �հ�:
		 * ������� ��� ������ ��:
		 * 
		 * "�׸�" �̶�� �Է��ϸ� ���α׷� ����
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {						//do while�� ����� ���� ������?
			System.out.println("�Է�>> ");
			String input = sc.nextLine();	//��ü String ���� ��ǲ�޴� ����, .next(): ������� ��ǲ
			
			if(input.equals("�׸�")) {break;}
			else {
				Calc(Divide_Transform(input));
			}
		}
	}
	
	
	
	
	static int[] Divide_Transform(String input) {
		String split[] = input.split(" ");
		int number[] = new int[split.length/2];
		
		for(int i=0; i<split.length/2;i++) {
			number[i] = Integer.parseInt(split[2*i+1]);			//%�������� ¦, Ȧ �����ϴ� ���� �ִ�.		
			System.out.print(split[2*i]+":"+number[i]+" ");
		}	//Ȧ�� �ε����� integer�� ����&�պκ� ���
		
		System.out.println();
		return number;
	}
	
	
	static void Calc(int[] number) {
		int sum = 0;
		
		for(int k : number) {sum+=k;}
		System.out.println("������� ������ �� �հ�: "+sum);
		System.out.println("������� ��� ������ ��: "+(double)sum/number.length);
	}
	
	

}
