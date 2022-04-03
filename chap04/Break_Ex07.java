package chap04;

public class Break_Ex07 {

	public static void main(String[] args) {
		//1.단일 loop가 적용된 곳에서 break로 탈출
		for(int i = 0;i<10;i++) {
			System.out.println(i);
			break;
		}
		
		System.out.println("=================");
		
		//2. for문 내에서 if조건을 사용하여 break
		for(int i=0;i<10;i++) {
			if(i==5) {
				break;
			}
			System.out.println(i+" ");
		}
		
		System.out.println("=================");
		
		//3. 다중 loop문일 때 break 탈출
		for(int i=0;i<5;i++) {
			for(int j = 0;j<5;j++) {
				if(i==2) {
					break;
				}
				System.out.println(i+","+j);
			}
		}
		
		System.out.println("=================");
		//4. 다중 loop에서 한 번에 탈출
		//	4-1.라벨 이름을 이용하여 탈출
POS1:		for(int i =0; i<5; i++) {
			for(int j=0;j<5;j++) {
				
				if(i==2) {
					break POS1;
				}
				System.out.println(i+","+j);
				
			}
		}

		System.out.println("=================");
		//  4-2. 변수 조건을 false로 만들어 탈출
		for(int i=0;i<5;i++) {
			for(int j =0;j<5;j++) {
				if(i==2) {
					i=100;	//변수 값을 조정하여 false로 만들기!
					break;
				}
				System.out.println(i+","+j);
			}
		}
		
		
		
	}

}
