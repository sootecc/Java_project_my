package chap19.Ex04;


/*
 	A ~ Z ������ �ƽ�Ű�ڵ尪 ���
 	
 	��� ���
 	========================
 	A, 65
 	B, 66
 	
 	...
 	
 	Z, 90
 	
 	========================
 	a ~ z ������ �ƽ�Ű�ڵ尪 ���
 	
 	��� ���
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
