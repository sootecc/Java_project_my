package KOSMO;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("switch문으로 연산할 정수 두 개와 연산자를 띄어쓰기로 구분하여 입력해주세요.ex) 5 2 *");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	char operator = sc.next().charAt(0);
	int result = 0;
	
	switch(operator) {
	
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("연산자 오류입니다.");
	
	}
	System.out.println("switch 결과값은: "+ result+"입니다.");
	
	
	System.out.println("if문으로 연산할 정수 두 개와 연산자를 띄어쓰기로 구분하여 입력해주세요.ex) 5 2 *");
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	operator = sc.next().charAt(0);
	result = 0;
	
	if (operator == '+') {
		result = num1 + num2;
	}
	else if(operator == '-') {
		result = num1 - num2;
	}
	else if(operator == '*') {
		result = num1 * num2;
	}
	else if(operator == '/') {
		result = num1 / num2;
	}
	else {
		System.out.println("연산자 오류 입니다.");
		return;
	}
	
	System.out.println("결과값은: "+result+"입니다.");
	
	}
}
