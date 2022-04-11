package chap19.Ex04;

public class Character_Objectg {

	public static void main(String[] args) {

		//1. char => int로 변환
		
		char ch1 = 'A';		//char : 2byte
		
		System.out.printf("%c%s",ch1,System.lineSeparator());		//char: 2byte
		System.out.printf("%d%s",(int)ch1,System.lineSeparator());	
	
		char ch1_1 = 'a';		//char : 2byte
		
		System.out.printf("%c%s",ch1_1,System.lineSeparator());		//char: 2byte
		System.out.printf("%d%s",(int)ch1_1,System.lineSeparator());	
	
		
		char ch2 = 'Z';
		System.out.printf("%c%s",ch2,System.lineSeparator());
		System.out.printf("%d%s",(int)ch2,System.lineSeparator());
	
		//2. char에 정수(아스키 코드)로 저장할 수 있다.
		
		char ch3 = 66;			//char에 정수 값으로 저장이 가능하다.
		System.out.printf("%c%s",ch3,System.lineSeparator());
		System.out.printf("%d%s",(int)ch3,System.lineSeparator());
		
		int ch4 = 65;			//int => char
		System.out.printf("%c%s",ch4,System.lineSeparator());
		System.out.printf("%d%s",(char)ch4,System.lineSeparator());
		
		
	
	
	
	}
	
	

}
