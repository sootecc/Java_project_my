package sec01_basicsyntax.Ex03_ConsolOutput;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		int word_count = 0;
		String[] word = new String[word_count];
		String[] result = new String[word.length];
		
		Scanner sc = new Scanner(System.in);
		word_count = sc.nextInt();
		
		for(int i =0; i<word_count;i++) {
			word[i] = sc.nextLine();
			result[i] = word[i].substring(0);
			System.out.println(result[i]);
		}	//	�ܾ� ��ǲ����
		
		char a,b;  //���ذ� ����
		
		
		
		//1. ���ӵǴ� ���ڸ� �б�
		//2. ���� �� �ߺ��Ǵ� ���� �ִ��� Ȯ��
		//3. �ߺ��Ǵ� ���� ������ �׷� �ܾ� ���, count ++
		
	}
}

