package Ex;

import java.util.Scanner;

public class Ex12_1 {

	public static void main(String[] args) {
		
		String str[] = {"가위", "바위", "보"};
		String user, computer;
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		do {
			System.out.println("가위 바위 보 ! >>> ");
			user = sc.next();
			
			if(user.equals("그만")) {break;};
			
			n = (int)(Math.random()*3);
			
			computer = str[n];
			
			if(user.equals("가위")) {
				if(computer.equals(str[0])) {
					System.out.println("비겼습니다.");
				}
				else if(computer.equals(str[1])){
					System.out.println("졌습니다.");
				}
				else if(computer.equals(str[2])){
					System.out.println("이겼습니다.");
				}
			}
			else if(user.equals("바위")) {
				if(computer.equals(str[0])) {
					System.out.println("이겼습니다.");
				}
				else if(computer.equals(str[1])){
					System.out.println("비겼습니다.");
				}
				else if(computer.equals(str[2])){
					System.out.println("졌습니다.");
				}
			}
			else if(user.equals("보")){
				if(computer.equals(str[0])) {
					System.out.println("졌습니다.");
				}
				else if(computer.equals(str[1])){
					System.out.println("이겨ㅑㅆ습니다.");
				}
				else if(computer.equals(str[2])){
					System.out.println("비겼습니다.");
				}
			}
			
			
			
		}while(true);
		
		
		
	}

}
