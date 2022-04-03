package chap04;

public class SwitchEx02 {
	
	public static void main(String[] args) {
		
		// 1. break를 걸어주지 않으면 해당 case부터 끝까지(break를 만나기 전까지)전부 실행시킨다.
		int value1 = 2;
		
		switch(value1) {
			
		case 1:
			System.out.println("A학점");
		case 2:
			System.out.println("B학점");
		case 3:
			System.out.println("C학점");
		default:
			System.out.println("F학점");
		}
		
		System.out.println("========================");
		
		// 2. break가 포함된 경우
		int value2 = 3;
		
		switch(value2) {
		
		case 1:
			System.out.println("A학점");
			break;
		case 2:
			System.out.println("B학점");
			break;
		case 3:
			System.out.println("C학점");
			break;
		default:
			System.out.println("F학점");		//마지막은 break 생략 가능
		}
		
		System.out.println("========================");

		value2 = 2;
		
		if(value2 == 1) {
			System.out.println("A학점(if)");
		}
		else if(value2 == 2) {
			System.out.println("B학점(if)");
		}
		else if(value2 == 3) {
			System.out.println("C학점(if)");
		}
		else {
			System.out.println("F학점(if)");
		}
		
		System.out.println("========================");
		
		
		/*
		 * switch문을 사용하여 점수가 7점 이상은 pass, 7점 이하는 fail을 출력
		 * input값이 전부 정수이면 switch 고려해볼만하다
		 */
	
		int a = 8;
		
		switch(a) {
		case 10:
		case 9:
		case 8:
		case 7:
			System.out.println("pass");
			break;
		default:
			System.out.println("fail");
		}
	
	
	}
}
