package chap04;

public class Dowhile_Ex05 {

	public static void main(String[] args) {
		
		//1. while문과 do while문의 비교
		//반복 횟수가 0인 경우
		int a= 0;
		while(a<0) {
			System.out.println(a+" ");
			a++;
		}
		
		System.out.println("==================");
		
		a=0;
		do {
			System.out.println(a + " ");		//do while에서 무조건 한 번은 실행된다.
			a++;									
		}while(a<0);	//조건이 false
		
		
		
		//2. 반복 횟수가 1인 경우
		System.out.println("======반복 횟수가 1인 경우======");
		a=0;
		while(a<1) {
			System.out.println(a+" ");
			a++;
		}
		
			
		a=0;
		do {
			System.out.println(a + " ");		
			a++;									
		}while(a<1);	
		
		
		
		//반복 횟수가 10인 경우
		System.out.println("======반복 횟수가 10인 경우======");
		a=0;
		while(a<10) {
			System.out.print(a+" ");
			a++;
		}
		
		System.out.println();	
		a=0;
		do {
			System.out.print(a + " ");		
			a++;									
		}while(a<10);	
		
		
	}

}
