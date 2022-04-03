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
		}	//	단어 인풋까지
		
		char a,b;  //기준과 현재
		
		
		
		//1. 연속되는 글자만 읽기
		//2. 글자 중 중복되는 것이 있는지 확인
		//3. 중복되는 것이 없으면 그룹 단어 출력, count ++
		
	}
}

