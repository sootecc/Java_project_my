package Ex;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		String course[] = {"Java", "C++", "HTML5","컴퓨터구조","안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		String name;
		
		while(true) {
			System.out.print("과목 이름 >> ");
			name = sc.next();
			
			for(int i =0;i<5;i++) {
				if(course[i].equals(name)) {
					System.out.println(course[i]+"의 점수는 "+score[i]);
					count = 1;
				}
			}
			
			if(name.equals("그만")) {		//주의. name은 참조변수이므로 ==를 사용하지 않고 equals
				break;
			}
			else if(count == 0) {
				System.out.println("없는 과목입니다.");
			}
			
			count = 0;
			
		}
	}

}
