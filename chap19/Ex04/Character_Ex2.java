package chap19.Ex04;


/*
 	A ~ Z 까지의 아스키코드값 출력
 	
 	출력 결과
 	========================
 	A, 65
 	B, 66
 	
 	...
 	
 	Z, 90
 	
 	========================
 	a ~ z 까지의 아스키코드값 출력
 	
 	출력 결과
 	========================
 	a, 97
 	b, 98
 	
 	...
 	
 	z, 113
 	
 */


public class Character_Ex2 {
	public static void main(String[] args) {
		
		for (int i = 65; i<123; i++) {
			if(i>90 && i<97) {}
			else {
				System.out.println((char)i+" , "+i);
			}
		}
		
	}
}
