package chap04;

public class For_Ex03 {

	public static void main(String[] args) { 

		//for 기본 작동
		
		int a;	//for문 블록 밖에서 선언된 변수, 값 할당은 아직
		
		for(a=0;a<3;a++) {
			System.out.print(a+ " ");
		}
		
		System.out.println("\nfor문 후 a의 값은:"+ a);
		System.out.println("\n=========================");
		
		for (int b = 0; b <= 10; b++) {
			System.out.println(b);
		}
		System.out.println("\n=========================");
		// System.out.println(b); 변수 b는 for문 내에서만 유효함
		
		
		int c;
		for(c=10;c>0;c--) {
			System.out.print(c + " ");
		}
		System.out.println("\n=========================");
		
		
		//2의 배수를 출력
		for (int i = 0; i< 100;i+=2) {
			System.out.println(i+" ");
		}
		System.out.println("\n=========================");

		//for문 내에서 초기값과 증가값은 여러 변수를 할당할 수 있다.
		
		for (int i=0,j=0; i<10; i++,j++) {
			System.out.println(i+" * "+j+" : " +(i*j));
		} 
		System.out.println("\n=========================");
		
		// 1 부터 10 까지 곱한 값을 출력하라.
		// 1 부터 100까지 더한 값을 출력하라.
		int m_sum = 1;
		int p_sum = 0;
		
		for(int i = 1;i< 11;i++) {
			m_sum *= i;
		}
		for(int i=1;i<101;i++) {
			p_sum += i;
		}
		System.out.println("1~10 까지의 곱: " +m_sum);
		System.out.println("1~100까지의 합: " +p_sum);
		
		
		//이중for문 : 1~9단 구구단 출력
		System.out.println("-----☆구구단 출력☆-----");
		for (int i = 1; i<10; i++) {
			System.out.println("======="+i+"단=======");
			for (int j = 1; j<10; j++) {
				System.out.println(i+" * "+j+"= "+i*j);
			}
		}
		
		
		/*
		 * for문에서 무한 루프 발생, 조건이 없을 경우(항상 true)
		for (int i = 0;;i++) {
			System.out.println(i+" ");
		}
		*/
		/*
		for(;;) {
			System.out.println("무한루프");
		}
		*/
		System.out.println("=======================");
		
		//무한 루프 탈출
		for (int i = 0;;i++) {
			
			if(i > 100) {break;}	//무한루프를 종료
			System.out.println(i);
		}
	
		//for문을 사용하여 1~1000 사이의 4의 배수를 더한 값, 평균 값을 출력
		double count = 0;
		int sum = 0;
		for (int i=1;i<1001;i++) {
			if(i%4==0) {
				count +=1;
				sum +=i;
			}
		}
		System.out.println("1~1000사이의 4의 배수 합:" +sum);
		System.out.println("1~1000사이의 4의 배수 평균:"+ (sum/count));
		
	}
}
