package KOSMO;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("switch������ ������ ���� �� ���� �����ڸ� ����� �����Ͽ� �Է����ּ���.ex) 5 2 *");
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
			System.out.println("������ �����Դϴ�.");
	
	}
	System.out.println("switch �������: "+ result+"�Դϴ�.");
	
	
	System.out.println("if������ ������ ���� �� ���� �����ڸ� ����� �����Ͽ� �Է����ּ���.ex) 5 2 *");
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
		System.out.println("������ ���� �Դϴ�.");
		return;
	}
	
	System.out.println("�������: "+result+"�Դϴ�.");
	
	}
}
