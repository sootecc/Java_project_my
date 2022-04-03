package Ex;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		String str[] = {"가위", "바위", "보"};
		String user;
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		
		
		while(true) {
			
			System.out.print("가위 바위 보! >> ");
			user = sc.next();
			n = (int)(Math.random()*3);
			
			if(user.equals("가위")&&str[n].equals("가위")) {
				System.out.println("사용자 = "+user+", 컴퓨터 = "+str[n]+" \t비겼습니다.");
			}
			else if(user.equals("가위")&&str[n].equals("바위")){
				System.out.println("사용자 = "+user+", 컴퓨터 = "+str[n]+" \t컴퓨터가 이겼습니다.");
			}
			else if(user.equals("가위")&&str[n].equals("보")){
				System.out.println("사용자 = "+user+", 컴퓨터 = "+str[n]+" \t사용자가 이겼습니다.");
			}
			else if(user.equals("바위")&&str[n].equals("가위")){
				System.out.println("사용자 = "+user+", 컴퓨터 = "+str[n]+" \t사용자가 이겼습니다.");
			}
			else if(user.equals("바위")&&str[n].equals("바위")){
				System.out.println("사용자 = "+user+", 컴퓨터 = "+str[n]+" \t비겼습니다.");
			}
			else if(user.equals("바위")&&str[n].equals("보")){
				System.out.println("사용자 = "+user+", 컴퓨터 = "+str[n]+" \t컴퓨터가 이겼습니다.");
			}
			else if(user.equals("보")&&str[n].equals("가위")){
				System.out.println("사용자 = "+user+", 컴퓨터 = "+str[n]+" \t컴퓨터가 이겼습니다.");
			}
			else if(user.equals("보")&&str[n].equals("바위")){
				System.out.println("사용자 = "+user+", 컴퓨터 = "+str[n]+" \t비겼습니다.");
			}
			else if(user.equals("보")&&str[n].equals("보")){
				System.out.println("사용자 = "+user+", 컴퓨터 = "+str[n]+" \t사용자가 이겼습니다.");
			}
			else if(user.equals("그만")) {
				break;
			}
			
			
		}
				
		
		
	}

}
