package chap06_07.EX02;

import java.util.Scanner;


public class Example_flexible {


	
	public static void main(String[] args) {
			
		//�� ������ ���� �Ҵ��ϰ� ���
		//��ĳ�ʷ� ������ �������� �޾Ƽ� �հ�, ��� // flexible �̿�
		
		
		Scanner number = new Scanner(System.in);			
		String num;
		
		
		
		
		System.out.println("���ڸ� ����� �����Ͽ� �Է����ּ���");
		num = number.nextLine();
		
		System.out.println(num);
		String split[] = num.split(" ");
		int[] token = new int[split.length];
		
		for(int i = 0; i<split.length;i++) {
			token[i] = Integer.parseInt(split[i]);
		}		//���⼭ ��ȯ���� �ʰ� �޼ҵ忡 �ִ� for���� sum ������ �ϸ� �ٲ��� ���� �ִ�.
		
		calc(token);
		
		
	}
	
	static void calc(int...num) {
		int sum = 0;
		
		
		for (int k:num) {
			sum += k;

		}
		
		System.out.println("�հ�: "+sum+"\n���: "+(double)sum/num.length);
	}
	
	

}
