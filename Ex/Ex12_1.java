package Ex;

import java.util.Scanner;

public class Ex12_1 {

	public static void main(String[] args) {
		
		String str[] = {"����", "����", "��"};
		String user, computer;
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		do {
			System.out.println("���� ���� �� ! >>> ");
			user = sc.next();
			
			if(user.equals("�׸�")) {break;};
			
			n = (int)(Math.random()*3);
			
			computer = str[n];
			
			if(user.equals("����")) {
				if(computer.equals(str[0])) {
					System.out.println("�����ϴ�.");
				}
				else if(computer.equals(str[1])){
					System.out.println("�����ϴ�.");
				}
				else if(computer.equals(str[2])){
					System.out.println("�̰���ϴ�.");
				}
			}
			else if(user.equals("����")) {
				if(computer.equals(str[0])) {
					System.out.println("�̰���ϴ�.");
				}
				else if(computer.equals(str[1])){
					System.out.println("�����ϴ�.");
				}
				else if(computer.equals(str[2])){
					System.out.println("�����ϴ�.");
				}
			}
			else if(user.equals("��")){
				if(computer.equals(str[0])) {
					System.out.println("�����ϴ�.");
				}
				else if(computer.equals(str[1])){
					System.out.println("�̰ܤ������ϴ�.");
				}
				else if(computer.equals(str[2])){
					System.out.println("�����ϴ�.");
				}
			}
			
			
			
		}while(true);
		
		
		
	}

}
